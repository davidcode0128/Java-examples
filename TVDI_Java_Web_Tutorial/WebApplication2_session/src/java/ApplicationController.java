
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ApplicationController", urlPatterns = {"/ApplicationController"})
public class ApplicationController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            // 讀取請求參數 ( 表單送來資料 )
            String operation = request.getParameter("operation");

            // 預設轉發物件為空
            RequestDispatcher rd = null;

            // 取得 session 與 請求參數 user ( session 能記錄 登入登出期間 所有資料， request 只能記錄表單 單次請求資料 )
            HttpSession session = request.getSession();
            String user = request.getParameter("user"); // login.jsp 會傳來 user , index.jsp 不會

            if ("Login".equals(operation)) {
                if (user == null) {
                    rd = request.getRequestDispatcher("/WEB-INF/login.jsp"); // login.jsp 會傳來 user , index.jsp 不會
                } else {
                    // 從 請求參數 取得的 user 資料寄放在 session 櫃台
                    session.setAttribute("user", user);
                    rd = request.getRequestDispatcher("/WEB-INF/welcome.jsp");
                }
            } else if ("Shopping".equals(operation)) {
                rd = request.getRequestDispatcher("/WEB-INF/shopping_form.jsp");
            } else if ("Logout".equals(operation)) {
                // 取得 session 寄放的 user 資料 (清除櫃台資料 step1)
                user = (String) session.getAttribute("user");
                // 讓 session 失效 清空櫃台資料 (清除櫃台資料 step2)
                session.invalidate();
                // user 資料寄放 request 櫃台 讓 logout.jsp 可以顯示 user 名稱 (清除櫃台資料 step3)
                request.setAttribute("user", user);
                rd = request.getRequestDispatcher("/WEB-INF/logout.jsp");
            }
            // 執行轉發 (如果表單提交的動作不是 Login , rd 會是 null , 會引發 NullPointerException)
            rd.forward(request, response);

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ApplicationController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ApplicationController at " + request.getContextPath() + "</h1>");
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
