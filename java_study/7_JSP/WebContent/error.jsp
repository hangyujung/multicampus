<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page isErrorPage="true" %>    

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
			<h3 class="ff"> Error page</h3>

            <h4 style="color: red;"> 서버 점검중입니다. </h4>
            <div style="color: red;"> ${exception} </div>
            <div style="color: red;"> ${msg} </div>


		</section>
</div>

<%@ include file="common/footer.jsp" %>

</body>
</html>