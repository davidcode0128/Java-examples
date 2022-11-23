/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 作業BMI;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher; // 新增
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class bmiController extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        
        bmiModel bmi = new bmiModel(); // bmi物件
        String 身高字串 = request.getParameter("身高cm"); // 取得表單提交的參數 身高
        String 體重字串 = request.getParameter("體重kg"); // 取得表單提交的參數 體重
        double 身高cm = 0.0; double 體重kg = 0.0;
        try {
            身高cm = Double.parseDouble(身高字串); // 字串轉整數
            體重kg = Double.parseDouble(體重字串); // 字串轉整數
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
        
        bmi.set身高cm(身高cm); // 設定 bmi 欄位 身高
        bmi.set體重kg(體重kg); // 設定 bmi 欄位 體重
        // 取得轉發網頁物件，設定轉到 bmiView.jsp (顯示 bmi model 資料)
        // WEB-INF 資料夾，只能由 Java 程式使用，使用者無法從瀏覽器直接訪問，安全性高
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/bmiView.jsp");
        // 在請求物件中設定 model 物件 (寄放資料)
        // request 物件提供類似 Map 功能來管理資料，setAttribute() 相當於 Map.put() 用來放資料
        request.setAttribute("身高cm", 身高cm);
        request.setAttribute("體重kg", 體重kg);
        request.setAttribute("model", bmi); // JSP透過 ${model.欄位} 讀資料，所以屬性要設定為"model"
        // 執行轉交 JSP，接下來 Tomcat 會處理 bmiView.jsp，將網頁結果傳回給瀏覽器
        rd.forward(request, response);
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet bmiController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet bmiController at " + request.getContextPath() + "</h1>");
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
