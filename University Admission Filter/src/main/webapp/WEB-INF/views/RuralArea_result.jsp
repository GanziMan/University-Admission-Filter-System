<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>농어촌지역 특별전형 등록된 내용</title>
<%
    request.setCharacterEncoding("UTF-8");
%>


<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
	<h1>농어촌지역 특별전형 등록된 내용</h1>
	
	<table>
	
		<tr><td>이름 : </td><td>${msg.name}</td></tr>
		<tr><td>전공 : </td><td>${msg.major}</td></tr>
		<tr><td>거주지역: </td><td>${msg.area}</td></tr>
		<tr><td>거주기간: </td><td>${msg.during_area}</td></tr>
		<tr><td>해당 중학교 재학기간: </td><td>${msg.during_middle}</td></tr>
		<tr><td>해당 고등학교 재학기간: </td><td>${msg.during_high}</td></tr>
		<tr><td>필기점수 : </td><td>${msg.student_score}</td></tr>
		<tr><td>면접점수 : </td><td>${msg.student_interview_score}</td></tr>
	</table>
	<a href="std_delete.do?seq=${msg.seq}"><button>${msg.name}삭제</button></a>

	<a href="/Kim/RuralArea_list.do"><button>농어촌 특별전형 List</button></a>
</body>
</html>