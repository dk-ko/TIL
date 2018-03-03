<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>gugu3</title>
<style>
	table {border-collapse:collapse;}
	td {padding:5px; border: solid 1px gray;}
</style>
</head>
<body>

<table>
<% for(int f=0; f<=1; ++f){ %>
<tr>
<% for(int i=2; i<=5; ++i){ %>
<td>
	<% for(int j=1; j<=9; ++j){ %>
		<%= i+(4*f) %>x<%=j%>=<%= (i+(4*f))*j %></br>
	<%} %>
</td>
<%} %>
</tr>
<%} %>
</table>

</body>
</html>