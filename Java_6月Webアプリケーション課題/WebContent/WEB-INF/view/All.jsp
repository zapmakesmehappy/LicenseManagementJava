<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="dto.ReturnData" %>
<%@page import="dto.ReturnI" %>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>資格管理くん</title>
</head>
<body>
<div id="con">
<%request.setCharacterEncoding("UTF-8");%>
<%ReturnI i = (ReturnI) request.getAttribute("inum"); %>
	<table>
		<tr>
			<th>生徒名</th>
			<th>資格名</th>
			<th>受験日</th>
			<th>合否</th>
		</tr>
		<%String strH[] = new String[i.getI()];
		for(int h = 0;h < strH.length;h++){
			String str = "rs" + h;
			strH[h] = str;
		}%>
		<%for(int j = 0;j < strH.length;j++){ %>
		<%ReturnData data = (ReturnData) request.getAttribute(strH[j]);%>
		<tr>
			<td><%=data.getName() %></td>
			<td><%=data.getLname() %></td>
			<td><%=data.getDate() %></td>
			<td><%=data.getSof() %></td>
		</tr>
		<%} %>
	</table>
	<a href="/Java_6月Webアプリケーション課題/TopServlet">TOPへ戻る</a>
	</div>
</body>
</html>