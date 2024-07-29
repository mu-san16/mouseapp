import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/MouseInfo")
public class MouseInfoServlet extends HttpServlet{

    protected void doPost(HttpServletRequest req, HttpServletResoponse res)
        throws IOException, ServletExpcetion{
            req.setCharacterEncoding("utf-8")
            res.setContentType("text/html;charset=utf-8")

            String mouseName = req.getParameter("gene");
            String mouseAge = req.getParameter("birth");
            String [] mouseSexs = req.getParameterValues("sex");
            String userName = (String) req.getSession().getAtrribute("userName")

            // 性別を表示用の文字列に変換
            String mouseSex = "";
            if (mouseSexs != null) {
                mouseSex = String.join(", ", mouseSexs);
            }

            PrintWriter out = res.getWriter();
            out.println("<html>");
            out.println("<head>");
            out.println("<title>追加情報の確認</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>追加情報の確認</h1>");
            out.println("<p>ユーザー名：" + userName + "</p>");
            out.println("<p>マウスの名前：" + mouseName + "</p>");
            out.println("<p>マウスの年齢：" + mouseAge + "</p>");
            out.println("<p>マウスの性別：" + mouseSex + "</p>");
            out.println("<a href='mouseInfo.html'>戻る</a>");
            out.println("</body>");
            out.println("</html>");
        }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException {
        doPost(req, res);
    }
}