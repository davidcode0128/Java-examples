/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "UpdateServlet", urlPatterns = {"/UpdateServlet"})
public class UpdateServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int id = Integer.valueOf(request.getParameter("id"));
            int bookCount = Integer.valueOf(request.getParameter("bookCount"));            
            PreparedStatement ps = null;
            Connection conn = null;
            try {
                DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                // 資料庫連線字串
                String url = "jdbc:derby://localhost:1527/EmployeeDB";
                // 資料庫使用者名稱
                String user = "test";
                // 資料庫密碼
                String password = "tiger";
                // 建立Connection連線
                conn = DriverManager.getConnection(url, user, password);
                // 更新SQL語句
                String sql = "update tb_books set bookcount=? where id=?";
                // 獲取PreparedStatement
                ps = conn.prepareStatement(sql);
                // 對SQL語句中的第一個參數賦值
                ps.setInt(1, bookCount);
                // 對SQL語句中的第二個參數賦值
                ps.setInt(2, id);
                // 執行更新操作
                ps.executeUpdate();
                // 關閉PreparedStatement
                ps.close();
                // 關閉Connection
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                out.println("Error: " + e.toString() + e.getMessage());
                // and show us the stacktrace
                e.printStackTrace();
            }
            // 重定向到FindServlet
            response.sendRedirect("FindServlet");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateServlet at " + request.getContextPath() + "</h1>");
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
