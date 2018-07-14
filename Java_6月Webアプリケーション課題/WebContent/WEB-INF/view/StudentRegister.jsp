<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<link rel="stylesheet" type="text/css" href="/Java_6月Webアプリケーション課題/css/style.css">
<title>資格管理くん</title>
</head>
<body>
<header><a href="/Java_6月Webアプリケーション課題/TopServlet"><img src="images/資格管理くん2.png"></a></header>
<div id="con">
	<h3>登録したい学生の情報を入力してください。</h3>
	<form action="/Java_6月Webアプリケーション課題/StudentRegisterResultServlet" method="get">
	名　前：<input type="text" name="name"><br>
	学　年：<input type="text" name="year"><br>
	クラス：<input type="text" name="class"><br>
	<input type="submit" value="登録する" class="button">
	</form>
	<a href="/Java_6月Webアプリケーション課題/TopServlet">TOPへ戻る</a>
</div>
</body>
</html>