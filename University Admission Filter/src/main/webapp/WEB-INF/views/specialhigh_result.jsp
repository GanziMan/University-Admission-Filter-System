<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>특성화고졸재직자 특별전형 등록된 내용</title>
<%
    request.setCharacterEncoding("UTF-8");
%>


<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
	<h1>특성화고졸재직자 특별전형 등록된 내용</h1>
	
	<table>
	
		<tr><td>이름 : </td><td>${msg.name}</td></tr>
		<tr><td>전공 : </td><td>${msg.major}</td></tr>
		<tr><td>특성화고 or 산업회사: </td><td>${msg.school_industry}</td></tr>
		<tr><td>재학 or 재직기간: </td><td>${msg.during_school_industry}</td></tr>
		<tr><td>산업회사 서명인원: </td><td>${msg.industry_people}</td></tr>
		<tr><td>필기점수 : </td><td>${msg.student_score}</td></tr>
		<tr><td>면접점수 : </td><td>${msg.student_interview_score}</td></tr>
	</table>
	<a href="std_delete.do?seq=${msg.seq}"><button>삭제</button></a>
	<a href="/Kim/specialhigh_list.do"><button>특성화고졸재직자 특별전형 List</button></a>
</body>
</html>