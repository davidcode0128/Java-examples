package Domain.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "registerController", urlPatterns = {"/registerController"})
public class registerController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String account = String.valueOf(request.getParameter("account"));
            String address = String.valueOf(request.getParameter("address"));
            String pass = String.valueOf(request.getParameter("password"));
            Connection conn = null;
            PreparedStatement ps = null;
            String page = "welcome.html";
            try {
                DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                String url = "jdbc:derby://localhost:1527/EmployeeDB";
                String user = "test";
                String password = "tiger";
                conn = DriverManager.getConnection(url, user, password);
                String str = "INSERT INTO USERACCOUNT(ACCOUNT,PASSWORD,ADDRESS) values(?,?,?)";
                ps = conn.prepareStatement(str);
                ps.setString(1, account);
                ps.setString(2, pass);
                ps.setString(3, address);
                int row = ps.executeUpdate();
                if (row <= 0) {
                    System.out.print("?????????????????????");
                    System.out.println("<a href='index.html'>??????</a>");
                }
                ps.close();
                conn.close();
            } catch (SQLException | ClassNotFoundException e) {
                System.err.println(e);
                System.out.println("SQL Error: " + e.toString() + e.getMessage());
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
            RequestDispatcher rd = request.getRequestDispatcher(page);
            if (rd != null) {
                rd.forward(request, response);
            }
            /*out.flush();
            out.println("<script>");
            out.println("alert('?????????????????????');");
            out.println("history.back();");
            out.println("</script>");*/
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registerController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet registerController at " + request.getContextPath() + "</h1>");
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
