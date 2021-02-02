<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bookList</title>
<link rel="stylesheet" href="./css/table.css">

</head>
<body>
<h3> Book List</h3>
<table class="tableb">
<tr><td>bookno</td><td>title</td><td>publisher</td><td>price</td></tr>

<c:forEach var="data" items="${list}">
      <tr>
          <td>${data.bookno }</td>
          <td>${data.title }</td>
          <td>${data.publisher }</td>
          <td>${data.price }</td>
      </tr>
</c:forEach>

</table>

<a href="./bookForm.html"> 도 서 등 록 폼</a>
</body>
</html>





