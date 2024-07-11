# Mouse_app

JavaとMysqlを用いてマウスを管理するアプリケーションを作成します

# Download Java and MySQL

WindowsとMacそれぞれのhttps://github.com/mu-san16/mouseapp/tree/main/Download%20Java に記載してあります。

# Setting Environment Variables

# Create Database

コマンドプロンプトかターミナルを開いてMysqlを開く

```bash
mysql -u root -p
```

この際にエラーが出た場合はPATHが通っていないので、PATHを通す必要が出てきます
次にデータベースの作成をします。まず、どんなデータがあるか確認する

```bash
show databases;
```
おそらく4種類のデータベースが初期設定として存在すると思います
次にデータベースを作成する

```bash
CREATE DATABASE データベース名;
```

データベース名は自分の好きなデータベース名にしてください
作成したらデータベースができているか確認します

```bash
show databases;
```
実行し、作成したデータベースが存在するか確認する
データベースの存在を確認したら、データベースにテーブルデータができたか確認する

```bash
use CREATE TABLE データベース名.テーブル名(カラム　形状, カラム　形状, カラム　形状);
```
形状に関しては種類があるので調べてください。データベースが作成できたらテーブルデータができたかどうか確認する

```bash
desc データベース名.テーブル名;
```
少しわかりずらいと思いますが、テーブルができていることが確認できると思います
ここまでできたら、データベースに移動してデータを入れてみる

```bash
USE データベース名;
```
このコードにより使用するデータベースを決める

```bash
SEKECT * FROM テーブル名;
```

出力がEmpty set (0.01 sec)になることを確認する

```bash
INSERT INTO テーブル名 VALUES(作成したテーブルのカラムの順番にデータを入れる);
```

これによりテーブルにデータが挿入される。データが挿入されたかどうかを確認する

```bash
SEKECT * FROM テーブル名;
```

出力
```bash
+--------+-----------+------+
| xxxxxx | xxxxxx    | xxxx |
+--------+-----------+------+
| xxxx   | xxxxxxxxx |   xx |
+--------+-----------+------+
```
のようになれば完成です。

# Create updater
## DBへの接続
JDBCドライバーを管理するためのクラスであるDriverManagerを使用して行う。使い方は下記のようになっている。

```bash
Connection con = DriverManager.getConnection(URL, ユーザー名、パスワード);
```

ユーザー名とパスワードはMySQLを使用するときのrootとpassとなる。
またURLは接続するDBを指定する文字列
→jdbc:mysql://(DBサーバ名)/(DB名)
このコードを実行することによりDBへの接続が可能となる

## ステートメントの生成

## SQLの実行
## リソースの解放

# Create updater
ここではWeb上でデータベースを接続するための準備を行います。Javaファイルを作成し、Javaファイルにコードを記載する準備を行います。

```bash
touch ファイル名.java
```

ファイル名は好きに設定してください。また、ファイルはフォルダの中に作るのがおすすめです。
作成できたらVscodeに移動してコードを記載していきます。

```bash
code .
```
ここからはhttps://github.com/mu-san16/mouseapp/tree/main/Create%20updater を確認しましょう。


