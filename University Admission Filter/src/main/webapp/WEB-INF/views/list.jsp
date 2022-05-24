
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장애인등 대상자 특별전형</title>
</head>
<body>
<h1>장애인등 대상자 특별전형 학생List</h1>
<table border=1>
	<tr>
		
		<th>이름</th>
		<th>전공</th>
		<th>장애종류</th>
		<th>장애등급</th>
		<th>출신 고등학교</th>
		<th>필기점수</th>
		<th>면접점수</th>
		<th>서류 위조여부 확인</th>
	</tr>
	<c:forEach var="std_n" items="${std_cmd}">
	<tr>
	<td>${std_n.name}</td>
	<td>${std_n.major}</td>
	<td>${std_n.disabledtype}</td>
	<td>${std_n.disablescore}(급)</td>
	<td>${std_n.highschool}</td>
	<td>${std_n.student_score}</td>
	<td>${std_n.student_interview_score}</td>
	<td>${std_n.document_confirm}</td>

	</tr>
	</c:forEach>
</table>
<a href="/Kim/std_list_if.do"><button>장애인등 대상자 특별전형 List 필터링</button></a>
<a href="/Kim/admin"><button>메인페이지</button></a>
</body>
</html>