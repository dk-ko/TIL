<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="lecture1.jsp03.*" %>
<%
Student stu=(Student)session.getAttribute("student");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
 body{font-family:굴림체;}
 table.table{width:400px;}
 td:nth-child(1){background-color:#eee; width:40%;}
</style>
</head>
<body>
<div class="container">
	
<h1>학생등록 성공</h1>
<hr/>

<table class="table table-bordered">
<tr>
 <td>ID</td>
 <td><%=stu.getId() %></td>
</tr>
<tr>
 <td>학번</td>
 <td><%=stu.getStudentNumber() %></td>
</tr>
<tr>
 <td>이름</td>
 <td><%=stu.getName() %></td>
</tr>
<tr>
 <td>학과ID</td>
 <td><%=stu.getDepartmentId() %></td>
</tr>
<tr>
 <td>학년</td>
 <td><%=stu.getYear() %></td>
</tr>
</table>

</div>

</body>
</html>