//フロントエンド(login.jsp)とバックエンド(UserBean, UserDAO)をつなぐ役割！

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

        // UserBeanを使用してユーザー認証を行う
        UserBean userBean = new UserBean();
        //User認証を行い次の画面に推移する(ValidateUserに関してはUserDAOに生成されている関数)
        boolean isValid = userBean.validateUser(username, password);
        if (isValid) {
            //セッションを取得(ユーザとサイトを繋ぐために必要であり、ページを跨いでユーザーの情報を記憶することが可能となる)
            //認証成功
            HttpSeesion session = request.getSession();
            session.setAttribute("user", username);
            //次のページへの推移を促す
            response.sendRedirect("MouseInput.jsp");
        } else {
            //認証失敗
            request.steAttribute("errorMessage", "Invaild username or password");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }
}