//データベースとプログラムの橋渡しをする重要なファイル
//1. 通訳者の役割、2. 管理人の役割、 3.セキュリティ担当の役割などを持っている

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import bean.UserDTO;

public class UserDAO {
    private DataSource dataSource;

    public UserDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //ユーザーのログイン認証を行う (3.セキュリティ担当の役割が一番近い)
    public boolean authenticateUser(String username, String password) throws SQLException {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        try (Connection conn = dataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, username);
                pstmt.setString(2, password);
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
                pstmt.executeUpdate();
            }
    }
}