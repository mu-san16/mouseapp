//データベースとプログラムの橋渡しをする重要なファイル
//1. 通訳者の役割、2. 管理人の役割、 3.セキュリティ担当の役割などを持っている

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import bean.UserDTO;

//クラスは引き出し
public class UserDAO {
    private DataSource dataSource;

    //引き出しの中においておくもの
    public UserDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //ユーザーのログイン認証を行う (3.セキュリティ担当の役割が一番近い)
    //この関数をServletで呼び出すと使用することができる
    public boolean authenticateUser(String username, String password) throws SQLException {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        try (Connection conn = dataSource.getConnection();
            //sql文の内容を渡すイメージ
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
                //入力されたデータを受け取りsql文を完成させる
                pstmt.setString(1, username);
                pstmt.setString(2, password);
                //完成されたsql文をもとにデータベースにそのデータがあるか探す
                try (ResultSet rs = pstmt.executeQuery()) {
                    return rs.next();
                }
            }
    }

    //新しいユーザーの登録を行う
    public void regsiteUser(UserDTO user) throws SQLException{
        String sql = "INSERT INTO users (username, password) VALEUS (?, ?)";
        try (Connection conn = dataSource.getConnection());
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, user.getUsername());
                pstmt.setString(2, user.getPassword());
                //データを更新している
                pstmt.executeUpdate();
            }
    }

    //ユーザー名からユーザー情報を取得 (このコードは絶対必要)
    public void getUserByUsername(String username) throws SQLException {
        String sql = "SELECT * FROM users WHERE username = ?";
        try (Connection conn = dataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, username);
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        //空の箱を準備してデータとして保存する
                        UserDTO user = new UserDTO();
                        user.setUsername(rs.getString("username"));
                        user.setPassword(rs.getString("password"));
                        return user;
                    }
                }
            }
    }
}