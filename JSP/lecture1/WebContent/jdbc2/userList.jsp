<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, lecture1.jdbc2.*" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my" %>
<%
int currentPage = 1;
int pageSize = 10;

String pg = request.getParameter("pg");
if (pg != null) currentPage = Integer.parseInt(pg);

List<User> list = UserDAO.findAll(currentPage, pageSize);
int recordCount = UserDAO.count();
%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style>
		body { font-family: 굴림체; }
		thead th { background-color: #eee; }
		table.table { width: 700px; }
	</style>
</head>
<body>

<div class="container">
<h1>사용자 목록</h1>

<table class="table table-bordered table-condensed">
	<thead>
		<tr>
			<th>id</th>
			<th>유저번호</th>
			<th>이름</th>
			<th>부서</th>
			<th>유저타입</th>
		</tr>
	</thead>
	<tbody>
		<% for (User user : list) { %>
		<tr>
			<td><%= user.getId() %></td>
			<td><%= user.getUserid() %></td>
			<td><%= user.getName() %></td>
			<td><%= user.getDepartmentName() %>
			<td><%= user.getUserType() %>
		</tr>
		<% } %>
	</tbody>
</table>

<my:pagination pageSize="<%=pageSize %>" recordCount="<%=recordCount %>" queryStringName="pg"/>

</div>

</body>
</html>