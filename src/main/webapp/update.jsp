<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>
<body>
<h4>Update user information</h4>
	<a href='home.jsp'>HOME</a>
	<aside style="float: right">
		<a href='./logout'> LOGOUT </a>
	</aside>
	<form action='./update' method="post" style="margin-top: 150px; margin-left: 500px;">
		<table>
			
			<tr>
				<td>Id:</td>
				<td><input name="id" type="number" placeholder="Enter Id"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input name="password" type="password" placeholder="Enter Password"></td>
			</tr>
			<tr>
				<td><input name="submit" type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>