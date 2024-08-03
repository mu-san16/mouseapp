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

# サーブレット
サーバ側で動くJavaプログラムで、4つのポイントを抑える必要がある

1. 4つのパッケージのインポート
2. HttpServletクラスの継承
3. アノテーションでマッピングの指定
4.

#　サーブレットのフォーム連携
フォームで入力された情報を保存するための場所を作るのに必要なものとなってくる。
1. フォームの入力情報は**値の属性=入力値**の形でリクエストに格納される
　　例えば、ログイン画面で名前を入力したら、名前という属性と入力された名前でリクエストされるということである。
　　そうすることで、名前という部分に入力されてデータが保存されるということを行うことができる

2. doGet()/doPost()の引数reqが持つメゾットから入力値を取得する

リクエストデータの中でどのような文字コードを読み取るかを指定する
```bash
void setCharacterEncoding(String en);
```

入力情報のどの属性を受け取り、保存するかを指定する。nameやpasswordなど自分で指定する部分となる
```bash
String getParameter(String name)
String[] getParameterValues(String name);
```

#　セッション管理
複数のリクエスト・レスポンスにまたがってユーザーの識別とデータの管理をする仕組み。一般的にはリクエストした情報は一度使用したら消えるが、セッションオブジェクトを使用することで、データを保存することが可能となる。
また複数の管理のものを管理するためにセッションIDが生成される。
この内容は上記のサーブレットに記載する。

reqからセッションオブジェクトを取得する。初回時にture→生成/false→null
```bash
HttpSession getSession(boolean create);
```

セッションオブジェクトのデータを管理。valueをnameという名前で格納
```bash
void setAttribute(String name, Object value);
```

nameという名前のデータを取得
```bash
Object getAttribute(String name);
```

# JSP(Java Server Pages)
HMTLに独自のタグでJavaのコードを埋め込んで動的なwebページを作る技術
サーブレットはJavaの中にHTMLが含まれるが、JSPではHTMLの中にJavaが含まれる
かなり高速に作業することが可能となる

JSPにはタグと呼ばれるものが存在し、このタグを使用することで動かすことが可能
1. ディレクティブタグ
　　サーブレット変換時に必要な設定を記述

```bash
<%@page contentType = "text.html;charset = utf-8" %>
```

```bash
<%@page import = "java.util.*" %>
```

2. 宣言タグ
　　メンバ変数やメソッドを定義

```bash
<%@String fortune(){ 〜　} %>
```

3. 式タグ
　　出力したい式を記述

```bash
<%= i + j %>
```

4. スクリプトタグ
　　Javaのプログラムを記述

```bash
<% for (int i = 0; i < 3; i ++){%>
```
5. コメントタグ
　　JSPのコメントを記述

```bash
<%-- コメント　-- %>
```

6. アクションタグ
　　特定の処理をシンプルに書くためのタグ

```bash
<jsp:useBean id = "counter" scope = "session" class = "Counter" />
```

