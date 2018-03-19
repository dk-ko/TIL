<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<table border=1>
	<thead>
		<tr>
			<td>id</td>
			<td>studentNumber</td>
			<td>studentName</td>
			<td>email</td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>${ student.id }</td>
			<td>${ student.studentNumber }</td>
			<td>${ student.studentName }</td>
			<td>${ student.email }</td>
		</tr>
	</tbody>
	</table>
</body>
</html>