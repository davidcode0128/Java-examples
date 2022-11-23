package Domain.Controller;

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

@WebServlet(name = "userController", urlPatterns = {"/userController"})
public class userController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("content-type", "text/html;charset=UTF-8");
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
            String page = null;
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
                    page = "welcome.html";
                    rd = request.getRequestDispatcher(page);
                    rd.forward(request, response);
                    ps.close();
                    rs.close();
                    conn.close();
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
                try {
                    if (rs != null) {
                        rs.close();
                    }
                } catch (SQLException ex) {
                    System.err.println(ex);
                }

            }
            out.flush();
            out.println("<script>");
            out.println("alert('很抱歉，使用者名稱或密碼錯誤');");
            out.println("history.back();");
            out.println("</script>");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet userController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet userController at " + request.getContextPath() + "</h1>");
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
