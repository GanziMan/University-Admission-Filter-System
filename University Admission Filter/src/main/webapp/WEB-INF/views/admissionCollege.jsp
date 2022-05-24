<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>College admin</title>
    <link rel="stylesheet" type="text/css" href="login.css">
    <link rel="stylesheet" type="text/css" href="common.css">
    <link href="https://fonts.googleapis.com/css2?family=Lobster&display=swap" rel="stylesheet">
</head>
<style>

.container {

text-align:center;
}
.westagram {
  
  font-family: "Lobster", cursive;
  font-size: 45px;
  margin: 40px;
}
.bigbox {

text-align:center;
 
}

.btn-container {
  text-align:center;
}
.btn {
  width: 260px;
  height: 32px;
  margin: 15px;
  background-color: lightskyblue;
  color: white;
  font-weight: bold;
  font-size: 14px;
  border: 0;
  border-radius: 3px;
  cursor:pointer;
}

.line-l {
  width: 95px;

  border: 0.5px solid lightgray;
}
.centerchar {

  font-size: 13px;
  font-weight: bold;
  color: lightslategray;
}
.line-r {
  width: 95px;

  border: 0.5px solid lightgray;
}


</style>
<body>

     <h1 class="westagram">대학입학 전형</h1>
 <div class="bigbox" align="center">
    <div class="btn-container" align="center">
    <table>
    <tr>
    <td> <a href="/Kim/std1_subject.do"><button class="btn">학생부교과 전형</button></a></td>
    <td> <a href="/Kim/std1_document.do"><button class="btn">학생부종합 전형</button></a></td>
    </tr>
    
    <tr>
    
    <td> <a href="/Kim/std1_expat3.do"><button class="btn">재외국민3년 특별전형</button></a></td>
    <td> <a href="/Kim/std1_expat12.do"><button class="btn">재외국민12년 특별전형</button></a></td>
    </tr>
    <tr>
    	<td> <a href="/Kim/std1.do"><button class="btn">장애인등 대상자 특별전형</button></a></td>
    	
    	<td> <a href="/Kim/std1_RuralArea.do"><button class="btn">농어촌 특별전형</button></a></td>
    </tr>
    <tr>
    <td>  <a href="/Kim/std1_specialhigh.do"><button class="btn">특성화고졸 재직자 특별전형</button></a></td>
    </tr>
    </table>
    
    </div>

 </div>
</body>
</html>