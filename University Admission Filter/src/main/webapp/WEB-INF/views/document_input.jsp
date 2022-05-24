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
<title>학생부종합 전형</title>
</head>
<body>
<h1>학생부종합 전형</h1>
<form:form method="POST" action="/Kim/document_input.do" commandName="msg">
<table>
	<tr><td>학생의 이름</td><td><input type="text" value="" name="name" id="name"/></td></tr>
	<tr><td>학생의 전공</td><td><form:input path="major"/></td></tr>
	<tr><td>출신 고등학교</td><td><form:input path="highschool"/></td></tr>
	<tr><td>필기점수</td><td><form:input path="student_score"/></td></tr>
	<tr><td>면접점수</td><td><form:input path="student_interview_score"/></td></tr>
	<tr><td>서류 위조 확인여부</td><td><input type="radio" name="document_confirm" id="document_confirm" value="yes"/><label>yes</label> <input type="radio" name="document_confirm" id="document_confirm" value="no" /><label>no</label></td></tr>
	<tr><td>수능평가 최저 점수</td><td><form:input path="low_sat"/></td></tr>
	<tr><td>등록</td><td><input type="submit" value="전송"/></td></tr>	
</table>
</form:form>
<a href="/Kim/document_list.do"><button>학생부종합List</button></a>
<a href="/Kim/admin"><button>메인페이지</button></a>
</body>
</html>
