<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" href="./css/table.css">
<link rel="stylesheet" href="./css/mypage.css">
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bookList</title>
<link rel="stylesheet" href="./css/table.css">

<script type="text/javascript">
   function f1() {
	  return confirm('삭제 할건가요?');
   }

</script>

</head>
<body>

<%@ include file="common/header.jsp" %>


<div id="output">
	<section>
<h3> Book List</h3>
<br>
<form action="${pageContext.request.contextPath}/searchBook.do">

   <table>
     <tr align="right">
        <td>
           <select name="condition">
               <option value="title">도서제목</option>
               <option value="publisher">출판사</option>
           </select>        
           <input type="text" name="keyword">
           <input type="submit" value="검색">
        </td>
     </tr>
   </table>
</form>
<br>
<form action="${pageContext.request.contextPath}/deleteBook.do" >
	<table class="tableb">
	<tr><td>bookno</td><td>title</td><td>publisher</td><td>price</td> 
	     <td> <input type="submit" value="삭제" onclick="return f1()"> </td> 
	 </tr>
	
	<c:forEach var="data" items="${list}">
	      <tr>
	          <td>${data.bookno }</td>
	          <td><a href="viewBook.do?bookno=${data.bookno }">  ${data.title } </a>  </td>
	          <td>${data.publisher }</td>
	          <td>${data.price }</td>
	          <td><input type="checkbox" name="bookno" value="${data.bookno }">  </td>
	      </tr>
	</c:forEach>
	
	</table>

</form>


</section>
</div>
<%@ include file="common/footer.jsp" %>

</body>
</html>


<!--  viewBook.do -->


