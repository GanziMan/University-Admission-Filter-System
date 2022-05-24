
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>재외국민12년 특별전형 학생List</title>
</head>
<body>
<h1>재외국민12년 특별전형 학생List</h1>
<table border=1>
	<tr>
		
		<th>이름</th>
		<th>전공</th>
		<th>출신학교 국적</th>
		<th>학교 재학기간</th>
		<th>1년간 국내 거주기간</th>
		<th>부모님(1년간 국내 거주기간)</th>
		<th>필기점수</th>
	</tr>
	<c:forEach var="std_n" items="${std_cmd}">
	<tr>
	<td>${std_n.name}</td>
	<td>${std_n.major}</td>
	<td>${std_n.schoolcountry}</td>
	<td>${std_n.during_school}(년)</td>
	<td>${std_n.during_1year_per}(일)</td>
	<td>${std_n.during_1year_per_parent}(일)</td>
	<td>${std_n.student_score}</td>
	</tr>
	</c:forEach>
</table>
<a href="/Kim/expat12_list_if.do"><button>재외국민12년 특별전형 List 필터링</button></a>
<a href="/Kim/std1_expat12.do"><button>재외국민12년 특별전형 입력</button></a>
<a href="/Kim/admin"><button>메인페이지</button></a>
</body>
</html>