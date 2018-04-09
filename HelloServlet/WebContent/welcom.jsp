<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8" >
<title>Welcome</title>
</head>
<body>
名前とパスワードを入力してください。
<form method="post" action="WelcomeSever">
<input type="text" name="username">
<input type="password" name="password">
<input type="submit" value="送信">
</form>
</body>
</html>