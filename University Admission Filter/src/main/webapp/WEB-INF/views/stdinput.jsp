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
<title>장애인등 대상자 특별전형</title>
</head>
<body>
<h1>장애인등 대상자 특별전형</h1>
<form:form method="POST" action="/Kim/stdinput.do" commandName="msg">
<table>
	<tr><td>학생의 이름</td><td><input type="text" value="" name="name" id="name"/></td></tr>
	<tr><td>학생의 전공</td><td><form:input path="major"/></td></tr>
	<tr><td>장애종류</td><td><input type="radio" value="중증" name="disabledtype" id="disabledtype"/><label></label><label>중증</label><input type="radio" value="경증" name="disabledtype" id="disabledtype"/><label>경증</label></td></tr>
	<tr><td>장애등급</td><td><form:input path="disablescore"/></td></tr>
	<tr><td>출신고등학교</td><td><form:input path="highschool"/></td></tr>
	<tr><td>필기점수</td><td><form:input path="student_score"/></td></tr>
	<tr><td>면접점수</td><td><form:input path="student_interview_score"/></td></tr>
	<tr><td>서류 위조 확인여부</td><td><input type="radio" name="document_confirm" id="document_confirm" value="yes"/><label>Yes</label><input type="radio" name="document_confirm" id="document_confirm" value="no"/><label>No</label></td></tr>
	<tr><td>등록</td><td><input type="submit" value="전송"/></td></tr>	
</table>
</form:form>
<a href="/Kim/std_list.do"><button>장애인등 대상자 특별전형 List</button></a>
<a href="/Kim/admin"><button>메인페이지</button></a>
</body>
</html>