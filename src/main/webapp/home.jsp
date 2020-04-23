<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:useBean id="bean" class="com.tyss.servletassignment.dto.UserBean"
	scope="session"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<a href='./update.jsp'>Edit</a>
	<a href='./logout'>Logout</a>
	<h1>Welcome <%=bean.getName() %></h1>
	<a href='./search'>View Users</a>
</body>
</html>
