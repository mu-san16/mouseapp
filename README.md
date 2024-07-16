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
statementはSQL文を実行するためのオブジェクトで下記のコードを実行することで得ることができる

```bash
Statement stmt = con.createStatement();
```

先ほどの接続情報をもつconからstatementメゾットを作成している

## SQLの実行
SQL文で実行して欲しい内容を下記のように記載することで実行することが可能

```bash
int count = stmt.executeUpdate(SQL文);
```

このコードにより実際にSQL文を実行することができる

## 検索処理
select文で検索するためのSQL文を実行するために必要な処理となる
```bash
ResultSet rs = stmt.executeQuery(SQL文);
```
ResultSetは検索結果を保持するメソッドとなっている

## リソースの解放
リソースをたくさん使うので、使い終わったら切る作業が必要となり、下記のコードで実行することが可能

```bash
re.close();
stmt.close();
con.close();
```

###　補足
ステートメントの生成の部分ですが、PreparedStatementを使用することがある。
PrepareStatementとは似たSQL文を繰り返し実行することに使用するものであり、使い方は以下の方法で使用する。


```bash
PreparedStatement ps = con.prepareStatement((?入り)SQL文);
```

(?入り)SQL文とは？
```bash
INSERT INTO テーブル名　VALEUS (?.?.?);
```
このように?の入ったSQL文で、?の部分は後で指定します。このSQL文ではINSERTでデータを挿入していることを表している。

次にsetterメソッドで?に値を設定する。
```bash
ps.setInt(1, 7);   ps.setString(2, "+/+");
```
どんなデータを入れるか指定をする

この繰り返しを使用する場合は、データ先にリストとして準備しておく必要がある

