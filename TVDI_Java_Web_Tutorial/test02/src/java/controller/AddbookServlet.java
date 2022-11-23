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
@WebServlet(name = "AddbookServlet", urlPatterns = {"/AddbookServlet"})
public class AddbookServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {            
            Connection conn = null;
            PreparedStatement ps = null;
            String name = String.valueOf(request.getParameter("name"));
            Double price = Double.valueOf(request.getParameter("price"));
            int bookCount = Integer.valueOf(request.getParameter("bookCount"));
            String author = String.valueOf(request.getParameter("author"));
            try {
               /* DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");*/
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
                // 新增圖書信息的SQL語句
                String str = "insert into tb_books(name,price,bookcount,author) values(?,?,?,?)";
                // 獲取PreparedStatement
                ps = conn.prepareStatement(str);
                // 對str語句中的第1個參數賦值
                ps.setString(1, name);
                // 對str語句中的第2個參數賦值
                ps.setDouble(2, price);
                // 對str語句中的第3個參數賦值
                ps.setInt(3, bookCount);
                // 對str語句中的第4個參數賦值
                ps.setString(4, author);
                // 執行更新操作，返回所影響的行數
                int row = ps.executeUpdate();
                // 判斷是否更新成功
                if (row > 0) {
                    // 更新成輸出信息
                    out.print("成功新增了" + row + "條資料！");
                }else{
                out.print("圖書資料新增失敗！");
                }
                // 關閉PreparedStatement，釋放資源
                ps.close();
                // 關閉Connection，釋放資源
                conn.close();                
            } catch (SQLException e) {
                out.print("圖書資料新增失敗！");
                out.print(e);
                out.println("SQL Error: " + e.toString() + " "
                        + e.getErrorCode() + " " + e.getSQLState());
                // and show us the stacktrace
            } catch (ClassNotFoundException e) {
                out.println("Error: " + e.toString() + e.getMessage());
                // and show us the stacktrace
            }
            request.getRequestDispatcher("link.jsp").include(request, response);
            out.close();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet addbookSetvlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet addbookSetvlet at " + request.getContextPath() + "</h1>");            
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
