//ユーザーの情報を1つのまとまりとして扱うための箱みたいなもの
//郵便物を送る箱をイメージしてもらうとわかりやすく、この箱の中に情報を入れて情報を表示したり、データベースに送ったりする

//他のファイルからのアクセスをする際に必要である
public class UserDTO {
    private String username;
    private String password;

    //この部分は初期化するために必要な部分
    public UserDTO() {}

    public UserDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //getとsetは他のファイルとのやりとりで使用することが目的となっている(橋渡し)
    //getは情報を取り出す
    public String getUsername() {
        return username;
    }

    //setは情報を設定する
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
                "username='" + username + '\'' +
                ", password='[PROTECTED]'" +
                '}';
    }
}