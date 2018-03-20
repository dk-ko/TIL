<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	<h1>Student</h1>
	<table class="table table-bordered">
		<thead>
			<tr>
				<td>id</td>
				<td>학번</td>
				<td>이름</td>
				<td>이메일</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="s" items="${ list }">
				<tr>
					<td>${ s.id }</td>
					<td>${ s.studentNumber }</td>
					<td>${ s.studentName }</td>
					<td>${ s.email }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>