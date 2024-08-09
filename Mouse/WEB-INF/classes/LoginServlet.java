import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException {
            req.setCharacterEncoding("utf-8");
            res.setContentType("text/html;charset=utf-8");

            String name = req.getParameter("name");
            req.getSession().setAttribute("userName", name);

            res.sendRedirect("MouseInfo.html?userName=" + name);
        }
    
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException {
            doPost(req, res);
        }
}