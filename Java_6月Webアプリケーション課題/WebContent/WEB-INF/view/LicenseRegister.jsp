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
	<a href="/Java_6月Webアプリケーション課題/TopServlet" class="back"><img src="images/戻る.png" width="50px" height="50px"></a>
	<h3>新しく登録する資格の名称を入力してください。</h3>
	<form action="/Java_6月Webアプリケーション課題/LicenseRegisterResultServlet" method="get">
	資格の名称：<input type="text" name="lname"><br>
	<input type="submit" value="登録する" class="square_btn">
	</form>
</div>
</body>
</html>