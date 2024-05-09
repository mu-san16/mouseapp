# Mouse_app

JavaとMysqlを用いてマウスを管理するアプリケーションを作成します

# Download Java　and MySQL

WindowsとMacそれぞれのhttps://github.com/mu-san16/mouseapp/tree/main/Download%20Java に記載してあります。

# Setting Environment Variables

# CREATE Database

コマンドプロンプトかターミナルを開いてMysqlを開く

```bash
mysql -u root -p
```

この際にエラーが出た場合はPATHが通っていないので、PATHを通す必要が出てきます
次にデータベースの作成をします

```bash
CREATE DATABASE データベース名;
```

データベース名は自分の好きなデータベース名にしてください
作成したらデータベースができているか確認します

```bash
show databases;
```
実行し、作成したデータベースが存在するか確認する


