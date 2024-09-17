import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.httl.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//WebServletはURLのパターンの指定をしている(ファイル名と合わせるのが基本)
@WebServlet("/LoginServlet")
//LoginServletクラスの宣言を行なっている。(publicは他のパッケージからもアクセスできることを表す)
//HttpServletはHTTPプロトコルを使用したWebアプリケーションの基本的な機能を提供
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException,IOException {
        //Formに登録した情報を受け取る作業をしている
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //UserBeanを使えるようにするため変数を生成する
        UserBean userBean = new UserBean();
        //User認証を行い次の画面に推移する(ValidateUserに関してはUserDAOに生成されている関数)
        if (userBean.validateUser(username, password)) {
            //セッションを取得(ユーザとサイトを繋ぐために必要であり、ページを跨いでユーザーの情報を記憶することが可能となる)
            HttpSeesion session = request.getSession();
            session.setAttribute("user", username);
            //次のページへの推移を促す
            response.sendRedirect("MouseInput.jsp");
        } else {
            request.steAttribute("errorMessage", "Invaild username or password");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }
}