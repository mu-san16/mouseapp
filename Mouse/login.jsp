<!-- ユーザーログインフォームを表示し、
 ログイン処理のためのインターフェースを提供する -->
 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <!DOCTYPE html>
 <html lang = "ja">
 <!-- headはページの基本的な設定を行い、UTF-8はさまざまな言語への対応、タイトルなどを適切に設定 -->
 <head>
     <meta charset = "UTF-8">
     <title>ログイン画面</title>
     <link rel = "stylesheet" type = "text/css" href = "css/login.css">
 </head>
 <body>
     <div class = "login-container">
         <h1>Mouse Database</h1>
         <form id = "loginForm" method = "post">
             <!-- グループで囲むことでレイアウトの変更をしやすい -->
             <div class = "form-group">
                 <label for = "username">ユーザー名</label>
                 <!-- どのようなタイプにするか、フォームを送信したときに識別に要するname、requiredは必須入力であることを指す -->
                 <input type = "text" id = "username" name="username" required>              
             </div>
 
             <div class = "form-group">
                 <label for = "password">パスワード</label>
                 <!-- passwordは入力したデータを隠して入力することを表している。-->
                 <input type = "password" id = "password" name = "password" required>
             </div>
 
             <div class="form-group button-group">
                <button type="submit" onclick="setAction('register')">新規登録</button>
                <button type="submit" onclick="setAction('login')">ログイン</button>
            </div>
         </form>
     </div>
     <script>
         function setAction(action) {
             //特定のIDを取得するに使用される構文
             var form = document.getElementById('loginForm');
             if (action === 'login') {
                 form.action = 'LoginServlet';
             } else if (action === 'register') {
                 form.action = 'RegisterServlet'
             }
         }
     </script>
 </body>
 </html>
 
 