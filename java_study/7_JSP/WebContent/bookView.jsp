<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bookView</title>
<link rel="stylesheet" href="./css/table.css">

<script type="text/javascript">

function bookModify() {
	f.action = "modifyBook.do";
	f.submit();
}

function bookDelete() {
	if(confirm("삭제 할거니 ? ")){
		f.action = "deleteBook.do";
		f.submit();
    }
}

function bookList() {
	f.action = "listBook.do";
	f.submit();
}


</script>

</head>
<body>
<h3> bookView 도서 상세 보기 </h3>

<form name="f" action="" method="post">
   <input type="hidden" name="bookno" value="${book.bookno }">
<table>
   <tr>
      <td>도서번호 </td>
      <td>${book.bookno }</td>
   </tr>
  <tr>
      <td>제목 (title) </td>
      <td>${book.title }</td>
   </tr>
  <tr>
      <td>출판사(publisher)</td>
      <td>${book.publisher }</td>
   </tr>
    <tr>
      <td>가격 (price)</td>
      <td> <input type="text" name="price" id="price" size="30" value="${book.price}"></td>
   </tr>
    <tr>
      <td>출판일자(pubdate)</td>
      <td>${book.pubdate }</td>
   </tr>
</table>
</form>
<table>
  <tr>
    <td>
       <input type="button" value="수정" onclick="bookModify()"> &nbsp;&nbsp;
       <input type="button" value="삭제" onclick="bookDelete()"> &nbsp;&nbsp;
       <input type="button" value="목록" onclick="bookList()">
    </td>
  </tr>
</table>


</body>
</html>