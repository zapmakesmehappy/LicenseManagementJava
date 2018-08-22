<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="dto.ReturnData" %>
<%@page import="dto.ReturnI" %>
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
<%request.setCharacterEncoding("UTF-8");%>
<%ReturnI i = (ReturnI) request.getAttribute("inum"); %>
<div class="tab">
	<table>
		<tr>
			<th class="h">生徒名</th>
			<th class="h">資格名</th>
			<th class="h">受験日</th>
			<th class="h">合否</th>
		</tr>
		<%String strH[] = new String[i.getI()];
		for(int h = 0;h < strH.length;h++){
			String str = "rs" + h;
			strH[h] = str;
		}%>
		<%for(int j = 0;j < strH.length;j++){ %>
		<%ReturnData data = (ReturnData) request.getAttribute(strH[j]);%>
		<tr>
			<td class="d"><%=data.getName() %></td>
			<td class="d"><%=data.getLname() %></td>
			<td class="d"><%=data.getDate() %></td>
			<td class="d"><%=data.getSof() %></td>
		</tr>
		<%} %>
	</table>
	</div>
	<a href="/Java_6月Webアプリケーション課題/TopServlet">TOPへ戻る</a>
	</div>
</body>
</html>