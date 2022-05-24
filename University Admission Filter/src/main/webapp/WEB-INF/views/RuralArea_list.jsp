
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>농어촌지역 특별전형 학생List</title>
</head>
<body>
<h1>농어촌지역 특별전형 학생List</h1>
<table border=1>
	<tr>
		
		<th>이름</th>
		<th>전공</th>
		<th>지역</th>
		<th>지역 거주기간(년)</th>
		<th>(중학교)해당지역 재학기간(년)</th>
		<th>(고등학교)해당지역 재학기간(년)</th>
		<th>필기점수</th>
		<th>면접점수</th>
	</tr>
	<c:forEach var="std_n" items="${std_cmd}">
	<tr>

	<td>${std_n.name}</td>
	<td>${std_n.major}</td>
	<td>${std_n.area}</td>
	<td>${std_n.during_area}(년)</td>
	<td>${std_n.during_middle}(년)</td>
	<td>${std_n.during_high}(년)</td>
	<td>${std_n.student_score}</td>
	<td>${std_n.student_interview_score}</td>
	</tr>
	</c:forEach>
</table>
<a href="/Kim/RuralArea_list_if.do"><button>농어촌 특별전형 List 필터링</button></a>
</body>
</html>