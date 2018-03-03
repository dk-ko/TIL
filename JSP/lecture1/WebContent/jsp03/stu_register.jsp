<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="lecture1.jsp03.*" %>
<%
int id=0;
String studentNumber="";
String name="";
int departmentId=0;
int year=0;
String s;
String 에러메세지 = null;
request.setCharacterEncoding("UTF-8");
if(request.getMethod().equals("POST")){
	s=request.getParameter("id");
	id=Integer.parseInt(s);
	studentNumber=request.getParameter("studentNumber");
	name=request.getParameter("name");
	s=request.getParameter("departmentId");
	departmentId=Integer.parseInt(s);
	s=request.getParameter("year");
	year=Integer.parseInt(s);
	
	if(id==0)
		에러메세지 = "사용자 아이디를 입력하세요";
	else if(studentNumber==null||studentNumber.length()==0)
		에러메세지 = "학번을 입력하세요";
	else if(name==null||name.length()==0)
		에러메세지 = "이름을 입력하세요";
	else if(departmentId==0)
		에러메세지 = "학과ID를 입력하세요";
	else if(year==0)
		에러메세지 = "학년을 입력하세요";
	else{
		Student student = new Student(id,studentNumber,name,departmentId,year);
		session.setAttribute("student",student);
		response.sendRedirect("stu_register_sc.jsp");
		return;
	}
}
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
	input.form-control, select.form-control {width:200px;}
</style>
</head>
<body>
<div class="container">

<h1>학생 등록</h1>
<hr/>

<form method="post">
<div class="form-group">
 <label>ID</label>
 <input type="text" class="form-control" name="id" value="<%=id!=0?id:""%>"/>
</div>
<div class="form-group">
 <label>학번</label>
 <input type="text" class="form-control" name="studentNumber" value="<%=studentNumber %>"/>
</div>
<div class="form-group">
 <label>이름</label>
 <input type="text" class="form-control" name="name"/>
</div>
<div class="form-group">
 <label>학과</label>
 <select class="form-control" name="departmentId">
  <option value="1" <%=departmentId==1 ? "selected":"" %>>소프트웨어공학과</option>
  <option value="2" <%=departmentId==2 ? "selected":"" %>>컴퓨터공학과</option>
  <option value="3" <%=departmentId==3 ? "selected":"" %>>정보통신공학과</option>
  <option value="4" <%=departmentId==4 ? "selected":"" %>>글로컬IT공학과</option>
 </select>
</div>
<div class="form-group">
 <label>학년</label>
 <input type="text" class="form-control" name="year" value="<%=year!=0?year:""%>"/>
</div>
<button type="submit" class="btn btn-primary">
 <i class="glyphicon glyphicon-ok"></i>저장 
</button>

</form>
<hr/>

<% if(에러메세지 !=null) {%>
 <div class="alert alert-danger">
  학생등록 실패:<%=에러메세지 %>
 </div>
<%} %>

</div>
</body>
</html>