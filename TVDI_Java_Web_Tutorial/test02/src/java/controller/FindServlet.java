package controller;

import model.book;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FindServlet", urlPatterns = {"/FindServlet"})
public class FindServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {            
            try {
                DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn = null;
                Statement stmt = null;
                ResultSet rs = null;
                // 資料庫連線字串
                String url = "jdbc:derby://localhost:1527/EmployeeDB";
                // 資料庫使用者名稱
                String user = "test";
                // 資料庫密碼
                String password = "tiger";
                // 建立Connection連線
                conn = DriverManager.getConnection(url, user, password);
                // 獲取Statement
                stmt = conn.createStatement();
                // 新增圖書資訊的SQL語句
                String sql = "select * from tb_books";
                // 執行查詢
                rs = stmt.executeQuery(sql);
                // 例項化List物件
                List<book> list = new ArrayList<>();
                // 判斷游標向後移動，並判斷是否有效
                while (rs.next()) {
                    // 例項化Book物件
                    book book = new book();
                    // 對id屬性賦值
                    book.setId(rs.getInt("id"));
                    // 對name屬性賦值
                    book.setName(rs.getString("name"));
                    // 對price屬性賦值
                    book.setPrice(rs.getDouble("price"));
                    // 對bookCount屬性賦值
                    book.setBookCount(rs.getInt("bookCount"));
                    // 對author屬性賦值
                    book.setAuthor(rs.getString("author"));
                    // 將圖書物件新增到集合中
                    list.add(book);
                }
                // 將圖書集合放置到request之中
                request.setAttribute("list", list);
                rs.close(); // 關閉ResultSet
                stmt.close(); // 關閉Statement
                conn.close(); // 關閉Connection		
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                out.println("Error: " + e.toString() + e.getMessage());
                // and show us the stacktrace
                e.printStackTrace();
            }
            // 請求轉發到book_list.jsp
            request.getRequestDispatcher("book_list.jsp").forward(request, response);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet bookController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet bookController at " + request.getContextPath() + "</h1>");
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
