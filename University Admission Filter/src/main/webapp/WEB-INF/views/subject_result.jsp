<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생교과부전형 등록된 내용</title>
<%
    request.setCharacterEncoding("UTF-8");
%>


<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
	<h1>학생교과부전형 등록된 내용</h1>
	
	<table>
	
		<tr><td>이름 : </td><td>${msg.name}</td></tr>
		<tr><td>전공 : </td><td>${msg.major}</td></tr>
		<tr><td>출신 고등학교: </td><td>${msg.highschool}</td></tr>
		<tr><td>필기점수 : </td><td>${msg.student_score}</td></tr>
		<tr><td>수능평가 최저 점수 : </td><td>${msg.low_sat}</td></tr>
		
	</table>
	<a href="std_delete.do?seq=${msg.seq}"><button>삭제</button></a>
	<a href="/Kim/subject_list.do"><button>교과부 전형 List</button></a>
</body>
</html>