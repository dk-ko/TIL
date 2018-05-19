<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:url var="R" value="/" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<h1>메인 페이지</h1>
	
	<div style="margin: 20px;">
		<span>현재시각:</span>
		<span><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${currentTime }"/></span>
	</div>
	
	<div style="margin: 20px;">
		<input type="text" name="etc" style="width:400px;"/>
	</div>
	
	<div style="margin: 20px;">
		<a class="btn btn-info" href="${R}">메인 페이지 새로고침</a>
	</div>
	
	<iframe id="iframe1" src="${R}file/list" style="width:100%; height: 600px; border:none;">
	</iframe>
	
	<script>
		function setIframeHeight(h){
			$("#ifrmae1").height(h);
		}
	</script>
</div>
</body>
</html>