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
		<h3 class="ff"> Menu  클릭하세요 !!!</h3>
 
 
    <c:if test="${empty login}">
        <h3><a href="login.jsp"> Login </a></h3>
        <h3><a href="users.html"> 회원가입 </a></h3>
    </c:if>    
        
    <c:if test="${!empty login}">
        <h3><a href="logout.do"> Logout </a></h3>
        <h3><a href="bookForm.html"> 도서등록폼 </a></h3>
        <h3><a href="./listBook.do"> 도서목록 </a></h3>
    </c:if>

	</section>
</div>

<%@ include file="common/footer.jsp" %>

</body>
</html>