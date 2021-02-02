<%@page import="vo.BookVO"%>
<%@page import="java.util.List"%>
<%@page import="dao.BookDAO"%>
<%@page import="service.BookServiceImpl"%>
<%@page import="service.BookService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<tr><td>bookno</td><td>title</td><td>publisher</td></tr>
<%
    BookDAO dao = new BookDAO();
    BookService service = new BookServiceImpl(dao);
    
    List<BookVO> list = service.bookList();
    
    for(BookVO data :list){
%>

      <tr>
          <td><%= data.getBookno() %>    </td>
          <td><%= data.getTitle() %></td>
          <td><%= data.getPublisher() %></td>
      </tr>

<% } %>

</table>
</body>
</html>





