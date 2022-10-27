<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
<div align="center">
<h1> Register Form</h1>
<form action="<%= request.getContextPath() %>/register"method="post">
<table style="width:80%">
<tr>
<td>UserName</td>
<td><input type="text" name="UserName"/></td>
</tr>
<tr>
<td>password</td>
<td><input type="text" name="password"/></td>
</tr>
<tr>
<td>EMail</td>
<td><input type="text" name="EMail"/></td>
</tr>
<tr>
<td>phoneNumber</td>
<td><input type="text" name="phonenumber"/></td>
</tr>
</table>
<input type="button" value="Register">
<input type="submit" value="submit"/> 
</form>
</div>
</body>
</html>