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
<title>농어촌 특별전형</title>
</head>
<body>
<h1>농어촌 특별전형</h1>
<form:form method="POST" action="/Kim/RuralArea_input.do" commandName="msg">
<table>
	<tr><td>학생의 이름</td><td><input type="text" value="" name="name" id="name"/></td></tr>
	<tr><td>학생의 전공</td><td><form:input path="major"/></td></tr>
	<tr><td>거주지역</td><td><form:input path="area"/></td></tr>
	<tr><td>거주기간</td><td><form:input path="during_area"/>(년)</td></tr>
	<tr><td>해당 중학교 재학기간</td><td><form:input path="during_middle"/>(년)</td></tr>
	<tr><td>해당 고등학교 재학기간</td><td><form:input path="during_high"/>(년)</td></tr>
	<tr><td>학생의 필기점수</td><td><form:input path="student_score"/></td></tr>
	<tr><td>학생의 면접점수</td><td><form:input path="student_interview_score"/></td></tr>
	<tr><td>등록</td><td><input type="submit" value="전송"/></td></tr>	
</table>
</form:form>
<a href="/Kim/RuralArea_list.do"><button>농어촌 특별전형 List</button></a>
<a href="/Kim/admin"><button>메인페이지</button></a>
</body>
</html>