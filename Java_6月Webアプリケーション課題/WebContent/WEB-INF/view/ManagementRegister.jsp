<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>資格管理くん</title>
</head>
<body>
<header>資格管理くん</header>
<div id="con">
	<h3>登録済みの学生の資格情報を入力してください。</h3>
	<form action="/Java_6月Webアプリケーション課題/ManagementRegisterResultServlet" method="get">
	学生　の　名前：<input type="text" name="name"><br>
	登録する資格名：<input type="text" name="lname"><br>
	　受　験　日　：<input type="text" name="date">～年～月を年と月を省略して入力してください。(例)29年8月　→2908<br>
	　合　　　否　：合<input type="radio" name="sof" value="合">否<input type="radio" name="sof" value="否">
	<input type="submit" value="登録する" class="button">
	</form>
	<a href="/Java_6月Webアプリケーション課題/TopServlet">TOPへ戻る</a>
</div>
</body>
</html>