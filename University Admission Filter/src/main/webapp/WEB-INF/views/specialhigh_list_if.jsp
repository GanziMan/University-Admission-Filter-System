
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>특성화고졸재직자 특별전형 학생List</title>
</head>
<body>
<h1>특성화고졸재직자 특별전형 부정입학List</h1>
<table border=1>
	<tr>
		
		<th>이름</th>
		<th>전공</th>
		<th>특성화고 or 특정산업</th>
		<th>재학/재직 기간</th>
		<th>산업회사 서명인원</th>
		<th>필기점수</th>
		<th>면접점수</th>
	</tr>
	<c:forEach var="std_n" items="${std_cmd}">
	<tr>

	<td>${std_n.name}</td>
	<td>${std_n.major}</td>
	<td>${std_n.school_industry}</td>
	<td>${std_n.during_school_industry}(년)</td>
	<td>${std_n.industry_people}(명)</td>
	<td>${std_n.student_score}</td>
	<td>${std_n.student_interview_score}</td>
	</tr>
	</c:forEach>
</table>
<a href="/Kim/std1_specialhigh.do"><button>특성화고졸재직자 특별전형 입력</button></a>
<a href="/Kim/admin"><button>메인페이지</button></a>
</body>
</html>