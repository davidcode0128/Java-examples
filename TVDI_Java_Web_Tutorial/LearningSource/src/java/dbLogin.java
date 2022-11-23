/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(urlPatterns = {"/dbLogin"})
public class dbLogin extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            String account = String.valueOf(request.getParameter("account"));
            String pass = String.valueOf(request.getParameter("password"));
            request.setAttribute("account", account);
            request.setAttribute("password", pass);
            Connection conn = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            RequestDispatcher rd = null;
            String page = "welcome.html";
            try {
                DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                String url = "jdbc:derby://localhost:1527/EmployeeDB";
                String user = "test";
                String password = "tiger";
                conn = DriverManager.getConnection(url, user, password);
                String str = "SELECT * FROM USERACCOUNT WHERE ACCOUNT = ? and PASSWORD = ?";
                ps = conn.prepareStatement(str);
                ps.setString(1, account);
                ps.setString(2, pass);
                rs = ps.executeQuery();
                if (rs.next()) {
                if (request.getAttribute("account").equals(rs.getString(1))
                        && request.getAttribute("password").equals(rs.getString(2))) {
                    rd = request.getRequestDispatcher(page);
                    rd.forward(request, response);                    
 /* if (rs.getString("ACCOUNT").equals(account) && rs.getString("PASSWORD").equals(pass)) {*/
 /*if (account.equals(rs.getString("ACCOUNT")) && pass.equals(rs.getString("PASSWORD"))) {*/
                    System.out.println("login ok!!");
                    System.out.flush();
                    System.out.println("<script>");
                    System.out.println("alert('恭喜，登入成功');");
                    System.out.println("history.back();");
                    System.out.println("</script>");
                    System.out.close();
                } else {
                    /*rd = request.getRequestDispatcher(page);
                    rd.forward(request, response);
                    /*    System.out.println("login fail!!");
                    System.out.flush();
                    System.out.println("<script>");
                    System.out.println("alert('很抱歉，使用者名稱或密碼錯誤');");
                    System.out.println("history.back();");
                    System.out.println("</script>");
                    System.out.close();*/
                }
                }
            } catch (SQLException | ClassNotFoundException e) {
                System.err.println(e);
            } finally {
                try {
                    if (ps != null) {
                        ps.close();
                    }
                } catch (SQLException ex) {
                    System.err.println(ex);
                }
                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException ex) {
                    System.err.println(ex);
                }
            }
            /*RequestDispatcher rd = null;
            rd = request.getRequestDispatcher(page);
            rd.forward(request, response);*/
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet dbLogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet dbLogin at " + request.getContextPath() + "</h1>");
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
