<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border=1>
<tr>
<%
	for(int i=1; i<=10; ++i){
		out.print("  ");
		out.print("<td>");
		out.print(i);
		out.println("</td>");
	}
%>
</tr>
</table>

<table border=1>
<tr>
<%
	for(int i=1;i<=10;++i){
		out.println("  <td>"+i+"</td>");
	}
%>
</tr>
</table>

<table border=1>
<% for(int i=0; i<=3; ++i){
	out.println("  <tr>");
	for(int j=1;j<=4;++j){
		out.println("  <td>"+(i*4+j)+"</td>");
	}
	out.println("  </tr>");
	}
%>
</table>

</body>
</html>