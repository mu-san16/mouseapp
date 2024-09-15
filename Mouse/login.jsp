<!-- ユーザーログインフォームを表示し、
 ログイン処理のためのインターフェースを提供する -->
<!DOCTYPE html>
<html>
<!-- headはページの基本的な設定を行い、UTF-8はさまざまな言語への対応、タイトルなどを適切に設定 -->
<head>
    <meta charset = "UTF-8">
    <title>ログイン画面</title>
    <link rel = "stylesheet" type = "text/css" href = "css/login.css">
</head>
<body>
    <div class = "login-container">
        <h1>Mouse Database</h1>
        <form action = "LoginServlet" method = "post">
            <label for = "username">ユーザー名：</label>
            <!-- どのようなタイプにするか、フォームを送信したときに識別に要するname、requiredは必須入力であることを指す -->
            <input type = "text" id = "username" name="username" required>

            <label for = "password">パスワード</label>
            <!-- passwordは入力したデータを隠して入力することを表している。-->
            <input type = "password" id = "password" name = "password" required>

            <input type = "submit" value = "ログイン" onclick = "setAction('login')">
            <input type = "submit" value = "新規登録" onclick = "setAction('register')">
        </form>

    </div>
    <script>
        // 記載する必要がある
    </script>
</body>
</html>
