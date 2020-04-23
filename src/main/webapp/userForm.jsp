<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User Form</title>
</head>
<body>
<a href = 'login.jsp'>Login</a>
	<form action='./register' method="post" style="margin-top: 200px; margin-left: 550px;">
		<table>
			<tr>
			<th><h2>Add New User</h2></th>
			</tr>
			<tr>
				<td>Id:</td>
				<td><input name="id" type="number" placeholder="Enter ID"></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input name="name" type="text"
					placeholder="Enter your name"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input name="password" type="password"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input name="email" type="email"
					placeholder="Enter your email"></td>
			</tr>
			<tr>
				<td>Sex:</td>
				<td>Male <input name="sex" type="radio" value="Male">
				Female <input name="sex" type="radio" value="Female"></td>
			</tr>
			<tr>
				<td>Country:</td>
				<td><select id="country" name="country">
						<option value="India">India</option>
						<option value="Belgium">Belgium</option>
						<option value="Colombia">Colombia</option>
						<option value="Cuba">Cuba</option>
				</select></td>
			</tr>
			<tr>
				<td><input name="submit" type="submit" value="Add User"></td>
			</tr>
		</table>
	</form>
</body>
</html>