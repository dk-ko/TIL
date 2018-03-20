<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style>
		body { font-family: 굴림체;}
		input.form-control { width: 200px; }
	</style>
</head>
<body>
	<div class="container">
	<h1>학생 수정</h1>
	<hr/>
	
	<form:form method="post" modelAttribute="student">
		<div class="form-group">
			<label>학번</label>
			<form:input path="studentNumber" class="form-control" />
		</div>
		<div class="form-group">
			<label>이름</label>
			<form:input path="studentName" class="form-control" />
		</div>
		<div class="form-group">
			<label>이메일</label>
			<form:input path="email" class="form-control" />
		</div>
		<button type="submit" class="btn btn-primary">
			<i class="glyphicon glyphicon-ok"></i>저장
		</button>
	</form:form>
	
	<c:if test="${ not empty message }">
		<hr/>
		<div class="alert alert-success">${ message }</div>
	</c:if>
	</div>
</body>
</html>