<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
    request.setCharacterEncoding("UTF-8");
%>


<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
	<h1>등록된 내용</h1>
	
	<table>
	
		<tr><td>이름 : </td><td>${msg.name}</td></tr>
		<tr><td>전공 : </td><td>${msg.major}</td></tr>
		<tr><td>장애종류 : </td><td>${msg.disabledtype}</td></tr>
		<tr><td>장애등급 : </td><td>${msg.disablescore}</td></tr>
		<tr><td>출신 고등학교 : </td><td>${msg.highschool}</td></tr>
		<tr><td>필기점수 : </td><td>${msg.student_score}</td></tr>
		<tr><td>면접점수 : </td><td>${msg.student_interview_score}</td></tr>
		<tr><td>서류위조여부확인 : </td><td>${msg.document_confirm}</td></tr>
		
	</table>
	<a href="std_delete.do?seq=${msg.seq}"><button>삭제</button></a>
		<a href="/Kim/std_list.do"><button>장애인등 대상자 특별전형 List</button></a>

</body>
</html>