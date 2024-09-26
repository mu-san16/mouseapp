// ユーザー情報のデータベース操作（挿入、取得、更新、削除）を担当
import java.spl.*;

public class UserDAO {
    //この部分のsqlの設定をしており、sqlでデータベースを作成する必要がある(次タスク)
    private final String URL = "jdbc:mysql://localhost/xxxxxxx"
    private final String USER = "root"
    private final String PASS = "pass"
    private Connection con = null;

    public void connect() {
        try{
            con = DriverManager.getConnection(URL, USER, PASS);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}