<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<title>layout2</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<tiles:insertAttribute name="menu" />
	
	<div class="container" style="min-height:700px;">
		<tiles:insertAttribute name="body"/>
	</div>
	<div class="container" style="margin-top:50px; border-top:1px solid #ddd; padding:30px; font-size:10pt; color:#888;">
		<div style="float: left; padding-right: 20px;">
			<img src="/layout2/res/images/skhu.png" style="width: 200px;"/>
		</div>
		<div>152-716 서울시 구로구 연동로 320 / 지하철 1, 7호선 온수(성공회대 입구)역 T.02-2610-4114</div>
		<div style="margin-top: 5px;">Copyright (c) Sung-Kong-Hoe University. All rights reserved.</div>
	</div>
</body>
</html>