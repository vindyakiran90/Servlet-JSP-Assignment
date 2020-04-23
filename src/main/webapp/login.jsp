<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<jsp:useBean id="bean" class="com.tyss.servletassignment.dto.UserBean"
	scope="session"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>


	<form action='./login' method="post" style="margin-top:200px; margin-left:550px;">
		<table>
			<tr>
			<td>Email:</td>
			<td><input name="email" type="email" placeholder="Enter your email"></td>
			</tr>		
			<tr>
			<td>Password:</td>
			<td><input name="password" type="password" placeholder="Enter your password"></td>
			</tr>		
			<tr>
			<td><input name="submit" type="submit" value="login"> </td>
			</tr>
			<tr>
			<td><a href="userForm.jsp">Register</a></td>
			</tr>
		</table>
	</form>
</body>
</html>