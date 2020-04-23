<%@page import="com.tyss.servletassignment.dto.UserBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Users</title>
</head>
<body>
	<a href='./home'>Home</a>
	<a href='./logout' style='float: right;'>Logout</a>

	<div align="center">
		<h2>Users List</h2>
		<%
			List<UserBean> beans = (List)request.getAttribute("beans");
		%>
		<%
			if (beans != null && !beans.isEmpty()) {
		%>

		<table border="1" style="cellpadding: 5">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Password</th>
				<th>Email</th>
				<th>Sex</th>
				<th>Country</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			<%
				for (UserBean bean : beans) {
			%>
			<tr>
				<td><%=bean.getId()%></td>
				<td><%=bean.getName()%></td>
				<td><%=bean.getPassword()%></td>
				<td><%=bean.getEmail()%></td>
				<td><%=bean.getSex()%></td>
				<td><%=bean.getCountry()%></td>
				<td><a href='./update.jsp'>Edit</a></td>
				<td><a href='./delete.jsp'>Delete</a></td>
			</tr>
			<%
				}
			%>
		</table>
		<%
			} else {
		%>
		<h1>No data found</h1>
		<%
			}
		%>
	</div>
</body>
</html>
