<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>재외국민3년 특별전형 등록된 내용</title>
<%
    request.setCharacterEncoding("UTF-8");
%>


<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
	<h1>재외국민3년 특별전형 등록된 내용</h1>
	
	<table>
	
		<tr><td>이름 : </td><td>${msg.name}</td></tr>
		<tr><td>전공 : </td><td>${msg.major}</td></tr>
		<tr><td>출신 학교 국적: </td><td>${msg.schoolcountry}</td></tr>
		<tr><td>학교 재학기간: </td><td>${msg.during_school}(년)</td></tr>
		<tr><td>1년간 한국에 있었던 기간: </td><td>${msg.during_1year_per}(일)</td></tr>
		<tr><td>부모님이 1년간 한국에 있었던 기간: </td><td>${msg.during_1year_per_parent}(일)</td></tr>
		<tr><td>필기점수 : </td><td>${msg.student_score}</td></tr>
		<tr><td>면접점수 : </td><td>${msg.student_interview_score}</td></tr>
	</table>
	<a href="std_delete.do?seq=${msg.seq}"><button>삭제</button></a>
	<a href="/Kim/expat3_list.do"><button>재외국민3년 특별전형 List</button></a>
</body>
</html>