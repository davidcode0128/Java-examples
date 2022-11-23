/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.AccountDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "EditAccount", urlPatterns = {"/EditAccount"})
public class EditAccount extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        try (PrintWriter out = response.getWriter()) {
            String repo = new String("");                 //紀錄結果狀態 Ex.修改成功或是錯誤的訊息
  AccountDao accountDao = new AccountDao();
  String pattern = "[a-zA-Z0-9]{1,16}";        //帳號密碼格式
  
  String action = new String("");
  if(null != request.getParameter("do")) 
   action = request.getParameter("do");
  String account = request.getParameter("account");
  String newPassWord = null;
  String confirmNPW = null;
  String confirmPW = request.getParameter("confirmPW");
  
  switch(action) {
  
   case "edit" :
    if(confirmPW.matches(pattern)){ //檢查密碼格式
     accountDao.getAccount().setAccount(account);
     accountDao.getAccount().setPassWord(confirmPW);
     if(accountDao.checkAccount(true)) {
      if(!"".equals(request.getParameter("newPassWord")) && !"".equals(request.getParameter("confirmNPW"))) {   //檢查是否更改密碼
       newPassWord = request.getParameter("newPassWord");
       confirmNPW = request.getParameter("confirmNPW");
      }
      if(newPassWord.equals(confirmNPW) && newPassWord.matches(pattern) && confirmNPW.matches(pattern)) { //檢查新密碼格式
       accountDao.getAccount().setPassWord(newPassWord);
      }else {
       out.println("<script type=\"text/javascript\">");
       out.println("alert('密碼或確認密碼不符合');");
       out.println("history.go(-1);");
       out.println("</script>");
      }
      accountDao.getAccount().setUid(Integer.parseInt(request.getParameter("uid")));
      accountDao.getAccount().setName(request.getParameter("name"));
      accountDao.getAccount().setPhone(request.getParameter("phone"));
      accountDao.getAccount().setEmail(request.getParameter("email"));
      accountDao.getAccount().setAddress(request.getParameter("address"));
     } else {
      repo += "密碼或確認密碼不符合";
     }
     if(accountDao.editAccount()) {
      out.println("<script type=\"text/javascript\">");
      out.println("alert('修改成功');");
      if(1 == (int)request.getSession().getAttribute("acLevel"))
       out.println("location='accountList.jsp';");
      else {
       out.println("location='accountInfo.jsp';");
      }
      out.println("</script>");
     } else {
      repo += "修改失敗";
     }
    } else {
     repo += "密碼或確認密碼不符合";
    }
    
    out.println("<script type=\"text/javascript\">");
    out.println("alert('"+repo+"');");
    out.println("history.go(-1);");
    out.println("</script>");
    break;
   
   case "register":
    newPassWord = request.getParameter("passWord");
    if(newPassWord.matches(pattern) && confirmPW.matches(pattern) && newPassWord.equals(confirmPW)) {
     accountDao.getAccount().setAccount(account);
     accountDao.getAccount().setPassWord(newPassWord);
     accountDao.getAccount().setName(request.getParameter("name"));
     accountDao.getAccount().setPhone(request.getParameter("phone"));
     accountDao.getAccount().setEmail(request.getParameter("email"));
     accountDao.getAccount().setAddress(request.getParameter("address"));
     if(accountDao.addAccount()) {
      request.getSession().setAttribute("login", account);
      request.getSession().setAttribute("acLevel", 0);
      out.println("<script type=\"text/javascript\">");
      out.println("alert('註冊成功');");
      out.println("location='accountCenter.jsp'");
      out.println("</script>");
     }
    } else {
     out.println("<script type=\"text/javascript\">");
     out.println("alert('密碼不符合或格式錯誤');");
     out.println("history.go(-1)");
     out.println("</script>");
    }
    
    break;
  
  }
  
 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditAccount</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditAccount at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
