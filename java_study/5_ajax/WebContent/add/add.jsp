<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
int p1 =Integer.parseInt(request.getParameter("p1"));
int p2 =Integer.parseInt(request.getParameter("p2"));

int result = p1 + p2;
%>

{
	"result":<%=result %>,
	"p1":<%=p1 %>,
	"p2":<%=p2 %>
}
