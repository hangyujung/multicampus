<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" href="./css/table.css">
<link rel="stylesheet" href="./css/mypage.css">

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>MyWeb Hom</title>
</head>


<body>

<%@ include file="common/header.jsp" %>

 <div id="output">
		<section>
			<h3 class="ff"> login form</h3>

<h3> login form </h3>

<form action="login.do"  method="post" >

  <table border="1" >
     <tr>
       <td><label for="id"> ID </label></td>
       <td><input type="text" id="id" name="id" value="" required="required"/> </td>
     </tr>
     <tr>
       <td><label for="pw"> PW </label></td>
       <td><input type="password" id="pw" name="pw" value="" required="required"/> </td>
     </tr>
     <tr>
        <td colspan="2">
             <input type="submit" value="로그인 ">
             <input type="reset" value="취소">
             <a href="users.html"> 회원가입</a>
             <span style="color: red;">${msg}</span>
        </td>
     </tr>
  </table>
</form>


		</section>
</div>

<%@ include file="common/footer.jsp" %>

</body>
</html>