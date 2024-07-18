# Basic

WebではWebブラウザとWebサーバーがやりとりをすることで成り立っている。Webブラウザが**リクエスト**を行い、リクエストを受け取ったWebサーバーが情報を返すことを行う。返すことを**レスポンス**という。
Web環境で動くプログラムをWebアプリケーションといい、サーバーサイドとクライアントサイドに分かれている。サーバーサイドには**Java, PHP, Python**が使用されており、クライアントサイドでは**JavaScript**が使用される

# HTML(Hyper Text Markup Language)
・ハイパーテキスト：複数の文章を結びつける仕組み(**リンク**を使用することができる)
・マークアップ言語：**タグ**を使って文章に意味づけができる(<title>HTML</title>)

具体的な例はhttps://github.com/mu-san16/mouseapp/blob/main/Web/example.html を確認してください。

# form画面
入力情報をWebサーバーに送ることできるページであり、サイトなどに入る際に使用するものである。
何をどのように誰にという情報を処理するプログラムを作成することで、動かすことが可能である。

```bash
<form action = "プログラムURL" method = "GET/POST">
      フォーム部品
</form>
```

具体的な例はhttps://github.com/mu-san16/mouseapp/blob/main/Web/example.html を確認してください。

# Apache Tomcat
webサーバーとwebコンテナの機能を持つJava製の無料ソフトウェアである。サーブレットとJSPの実行環境を整えることが可能
webアプリではファイル構成が重要となり、下記のようなファイル構成にするのが一般的である
<pre>
Webapps
├── コンテキストルート
    ├── HTMLファイル
    ├── JSPファイル
    ├── 画像データなど
    ├── WEB・INF
        ├── classes-class
        ├── web.xml
</pre>

## download Tomcat
Windowsの場合:https://qiita.com/ryome/items/5513da20c0a0f3cfdb45
Macの場合:https://qiita.com/R1ck29/items/9729b0b2abb9020c31eb

## Execution Tomcat
Windowsの場合
Tomcatのディレクトリまで移動する

```bash
cd ./apache-tomcat-xxxx/bin
```

```bash
startup.bat
```

停止する場合
```bash
shutdown.bat
```

Macの場合
Tomcatのディレクトリまで移動する

```bash
cd ./apache-tomcat-xxxx/bin
```

実行する

```bash
./startup.sh
```

停止する
```bash
./shutdown.sh
```