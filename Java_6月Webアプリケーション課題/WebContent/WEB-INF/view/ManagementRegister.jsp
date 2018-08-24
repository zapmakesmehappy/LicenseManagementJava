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
	<h3>登録済みの学生の資格情報を入力してください。</h3>
	<form action="/Java_6月Webアプリケーション課題/ManagementRegisterResultServlet" method="get">
	学生　の　名前：<input type="text" name="name"><br>
	登録する資格名：<input type="text" name="lname"><br>
	　受　験　日　：<input type="text" name="date">～年～月を年と月を省略して入力してください。(例)29年8月　→2908<br>
	　合　　　否　：合<input type="radio" name="sof" value="合">否<input type="radio" name="sof" value="否">
	<input type="submit" value="登録する" class="sqare_btn">
	</form>
</div>
</body>
</html>