// 必要なモジュールのインポート
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

 //Mouseという名前クラスの作成
public class Mouse{
    public static void main(String[] argrs) {  //mainメゾットを定義
        // データベース接続情報
        String url = "jdbc:mysql://localhost:3306/mouseapp";  //mouseappの部分は変更が必要
        String user = "root";
        String password = "password";  // 変更が必要
        //この上3つのコードに関しては今後書き換えることがないものとなっている

        String sql = "INSERT INTO mouse VALUES('+/-', '2024/5/1', 1)";  //VALUESの部分は変更が必要です

        Connection con = null;  //データベース接続を保持するためのオブジェクトの宣言
        Statement stmt = null;  //SQL文を実行するためのオブジェクトの宣言

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //DBに接続
            con = DriverManager.getConnection(url, user, password);
            //ステートメントの生成
            stmt = con.createStatement();
            //SQLを実行
            int count = stmt.executeUpdate(sql);
            System.out.println(count + "件更新しました"); 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //リソースを解放
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}