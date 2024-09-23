//フロントエンド(login.jsp)とバックエンド(UserBean, UserDAO)をつなぐ役割！
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.httl.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//WebServletはURLのパターンの指定をしている(ファイル名と合わせるのが基本)
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException,IOException {
        //Formに登録した情報を受け取る作業をしている
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // UserBeanを使用してユーザー認証を行う
        UserBean userBean = new UserBean();
        boolean isRegistered = userBean.registerUser(username, password);

        if (isRegistered) {
            //登録成功
            request.setAttribute("successMessage", "Registration successful. Please login.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            //登録失敗
            request.setAttribute("errorMessage", "Registration failed. Username may already exist.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}