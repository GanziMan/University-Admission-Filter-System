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
<title>특성화고졸재직자 특별전형</title>
</head>
<body>
<h1>특성화고졸재직자 특별전형</h1>
<form:form method="POST" action="/Kim/specialhigh_input.do" commandName="msg">
<table>
	<tr><td>학생의 이름</td><td><input type="text" value="" name="name" id="name"/></td></tr>
	<tr><td>학생의 전공</td><td><form:input path="major"/></td></tr>

	<tr><td>특성화고/산업회사</td><td><input type="radio" name="school_industry" id="school_industry" value="school"/><label>특성화고</label> <input type="radio" name="school_industry" id="school_industry" value="industry" /><label>산업회사</label></td></tr>
	
	<tr><td>재학 or 재직기간</td><td><form:input path="during_school_industry"/></td></tr>
	<tr><td>산업회사 서명인원</td><td><form:input path="industry_people"/></td></tr>
	<tr><td>학생의 필기점수</td><td><form:input path="student_score"/></td></tr>
	<tr><td>학생의 면접점수</td><td><form:input path="student_interview_score"/></td></tr>
	<tr><td>등록</td><td><input type="submit" value="전송"/></td></tr>	
</table>
</form:form>
<a href="/Kim/specialhigh_list.do"><button>특성화고졸재직자 특별전형 List</button></a>
<a href="/Kim/admin"><button>메인페이지</button></a>
</body>
</html>