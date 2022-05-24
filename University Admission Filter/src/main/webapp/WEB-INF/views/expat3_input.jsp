<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
   
<!DOCTYPE html>
<%
    request.setCharacterEncoding("UTF-8");
%>


<html>
<head>
<meta charset="UTF-8">
<title>재외국민 3년 특별전형</title>
</head>
<body>
<h1>재외국민 3년 특별전형</h1>
<form:form method="POST" action="/Kim/expat3_input.do" commandName="msg">
<table>
	<tr><td>학생의 이름</td><td><input type="text" value="" name="name" id="name"/></td></tr>
	<tr><td>학생의 전공</td><td><form:input path="major"/></td></tr>
	<tr><td>출신 학교 국적</td><td><input type="radio" value="국외" name="schoolcountry" id="schoolcountry"/><label>국외</label> <input type="radio" value="국내" name="schoolcountry" id="schoolcountry"/><label>국내</label></td></tr>
	<tr><td>학교 재학기간</td><td><form:input path="during_school"/>(년)</td></tr>
	<tr><td>1년간 한국 있었던 기간</td><td><form:input path="during_1year_per"/>(일)</td></tr>
	<tr><td>부모님이 1년간 한국에 있었던 기간</td><td><form:input path="during_1year_per_parent"/>(일)</td></tr>
	<tr><td>학생의 필기점수</td><td><form:input path="student_score"/></td></tr>
	<tr><td>학생의 면접점수</td><td><form:input path="student_interview_score"/></td></tr>
	<tr><td>등록</td><td><input type="submit" value="전송"/></td></tr>	
</table>
</form:form>
<a href="/Kim/expat3_list.do"><button>재외국민3년 특별전형 List</button></a>
<a href="/Kim/admin"><button>메인페이지</button></a>
</body>
</html>