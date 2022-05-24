
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>교과부전형 부정입학List</title>
</head>
<body>
<h1>교과부전형 부정입학List</h1>
<table border=1>
	<tr>
	
		<th>이름</th>
		<th>전공</th>
		<th>출신 고등학교</th>
		<th>필기점수</th>
		<th>수능등급</th>
	</tr>
	<c:forEach var="std_n" items="${std_cmd}">
	<tr>
	
	<td>${std_n.name}</td>
	<td>${std_n.major}</td>
	<td>${std_n.highschool}</td>
	<td>${std_n.student_score}</td>
	<td>${std_n.low_sat}</td>
	</tr>
	</c:forEach>
</table>
<a href="/Kim/std1_subject.do"><button>교과부 전형 입력</button></a>
<a href="/Kim/admin"><button>메인페이지</button></a>
</body>
</html>