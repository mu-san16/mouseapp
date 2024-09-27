//アプリケーションの中心的な処理を含むファイルとなる
//ログインできるかどうか、新規登録できるかどうか確認
package bean;

import dao.UserDAO;
import javax.sql.DataSource;
import java.sql.SQLException;

public class UserBean {
    private UserDAO userDAO;
    private UserDTO userDTO;

    public UserBean(DataSource dataSource) {
        this.userDAO = new UserDAO(dataSource);
        this.userDTO = new UserDTO();
    }

    //ログインの確認
    public boolean login(String username, String password) {
        try {
            return userDAO.authenticateUser(username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    //ユーザー登録機能
    public boolean register(String username, String password) {
        try {
            UserDTO newUser = new UserDTO(username, password);
            userDAO.registerUser(newUser);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    //ユーザー情報取得機能
    public UserDTO getUserInfo(String username) {
        try {
            return userDAO.getUserByUsername(username);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}