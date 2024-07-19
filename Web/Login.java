import java.io.*;        //PrintWriter
import javax.servlet.*;      //GenericServlet
import javax.servlet.http.*;     //HttpServlet
import javax.servlet.annotation.*;    //アノテーション機能

@WebServlet("/Login")     //この"/Login"部分に関しては変更する必要がある
public class Login extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException {
      req.setCharacterEncoding("utf-8");
      res.setContentType("text/html;charset=utf-8");
      PrintWriter out = res.getWriter();
      out.println("<html>");
      out.println("<head>");
      out.println("<title>�m�F���</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h2>���͏����m�F���ēo�^�{�^���������Ă�������</h2>");
      out.println("�����F<strong>" + req.getParameter("name") + "</strong><br/>");
      out.println("�p�X���[�h�F<strong>" + req.getParameter("pass") + "</strong><br/>");
      String age = req.getParameter("age");
      if(age.equals("child")){
        age = "18�Ζ���";
      } else {
        age = "18�Έȏ�";
      }
      out.println("�N��F<strong>" + age + "</strong><br/>");
      String[] langs = req.getParameterValues("lang");
      out.println("�J���o���F<strong>");
      for(int i = 0; i < langs.length; i++){
        out.println(langs[i] + " ");
      }
      out.println("</strong><br/>");    
      out.println("�Z���F<strong>" + req.getParameter("address") + "</strong><br/>");
      out.println("���ӌ��E���₢���킹�F<br/><strong>" + req.getParameter("msg") + "</strong><br/><br/>");
      out.println("<input type=\"submit\" value=\"�o�^\" />");
      out.println("<input type=\"reset\" value=\"�߂�\" /><br/><br/>");
      out.println("�i���̉�ʂ̓T�[�u���b�g�ŏo�͂��Ă��܂��j");
      out.println("</body>");
      out.println("</html>");
    }
    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws IOException, ServletException {
      doPost(req, res);
    }
  }