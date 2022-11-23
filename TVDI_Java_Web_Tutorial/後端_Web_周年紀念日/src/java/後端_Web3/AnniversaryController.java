
package 後端_Web3;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher; // 新增
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AnniversaryController extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        AnniversaryModel am = new AnniversaryModel(); // 結婚幾周年物件
        String yearString = request.getParameter("years"); // 取得表單提交的參數 結婚了幾年
        int year = 0;
        try {
            year = Integer.parseInt(yearString); // 字串轉整數
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
        am.setYear(year); // 設定 結婚周年物件 欄位 year
        
        // 取得轉發網頁物件，設定轉到 anniversaryView.jsp (顯示 結婚周年物件 model 資料)
        // WEB-INF 資料夾，只能由 Java 程式使用，使用者無法從瀏覽器直接訪問，安全性高
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/anniversaryView.jsp");
        // 在請求物件中設定 model 物件 (寄放資料)
        // request 物件提供類似 Map 功能來管理資料，setAttribute() 相當於 Map.put() 用來放資料
        request.setAttribute("model", am); // JSP透過 ${model.欄位} 讀資料，所以屬性要設定為"model"
        // 執行轉交 JSP，接下來 Tomcat 會處理 anniversaryView.jsp，將網頁結果傳回給瀏覽器
        rd.forward(request, response);    
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AnniversaryController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AnniversaryController at " + request.getContextPath() + "</h1>");
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
