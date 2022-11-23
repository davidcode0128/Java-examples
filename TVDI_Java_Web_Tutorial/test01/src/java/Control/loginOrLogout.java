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
@WebServlet(name = "loginOrLogout", urlPatterns = {"/loginOrLogout"})
public class loginOrLogout extends HttpServlet {

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
              String action = new String("");       //識別登入或登出
  
  if(null != request.getParameter("do")) {
   action = request.getParameter("do");
   
   switch(action) {
    case "login":
     AccountDao accountDao  = new AccountDao();
     accountDao.getAccount().setAccount(request.getParameter("account"));
     accountDao.getAccount().setPassWord(request.getParameter("passWord"));
     if(accountDao.checkAccount(true)) {
         request.getSession().setAttribute("login", accountDao.getAccount().getAccount());  //帳號密碼正確後，在Session中寫入名稱為login內容為帳號名稱
         request.getSession().setAttribute("uid", accountDao.getAccount().getUid());
         out.println("<script type=\"text/javascript\">");
         out.println("alert('登入成功');");
         out.println("</script>");
     }else {
      out.println("<script type=\"text/javascript\">");
      out.println("alert('帳號或密碼錯誤');");
      out.println("loaction='login.jsp';");
      out.println("</script>");
     }
     break;
    case "logout":
     if(null != request.getSession().getAttribute("login")) {
      request.getSession().invalidate();          //使得Session失效
      out.println("<script type=\"text/javascript\">");
      out.println("alert('您已經成功登出');");
      out.println("location='login.jsp';");
      out.println("</script>");
     }
     break;
    default :
     response.sendRedirect("login.jsp");    //預防action為其他內容
     break;
   }
  } else {
   response.sendRedirect("login.jsp");  //預防沒有do
  }
  
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet loginOrLogout</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet loginOrLogout at " + request.getContextPath() + "</h1>");
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
