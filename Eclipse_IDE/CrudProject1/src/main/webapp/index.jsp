<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align='center'>
<h1>Register form</h1>

<form action="regC"method="Get">

<table>

<tr>
<td>Name</td><td><input type="text"name="user"/></td>
</tr>
<tr>
<td>mail</td><td><input type="text"name="mail"/></td>
</tr>
<tr>
<td>phone</td><td><input type="text"name="phone"/></td>
</tr>
<tr>
<td>city</td><td><input type="text"name="city"/></td>

</tr>
<tr>
<td><input type="submit"value="register"/></td>

</tr>


</table>



</form>
</div>
<br/><br/><br/>
<div align="center">
<form action = "display">
<button type="submit">Show Data</button>
</form>
</div>

</body>
</html>