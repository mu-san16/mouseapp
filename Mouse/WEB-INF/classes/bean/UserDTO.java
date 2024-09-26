// データベースとアプリケーション間でユーザー情報を転送するためのデータ構造を提供
// データのカプセル化：ユーザー関連のデータをひとまとめにする

//他のファイルからのアクセスをする必要があるので記載する必要がある
public class UserDTO {
    private int id;
    private String username;
    private String password;

    //この部分は初期化するために必要な部分
    public UserDTO() {}

    public UserDTO(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    //getとsetは他のファイルとのやりとりで使用することが目的となっている(橋渡し)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='[PROTECTED]'" +
                '}';
    }
}