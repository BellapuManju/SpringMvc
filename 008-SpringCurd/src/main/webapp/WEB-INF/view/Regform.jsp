<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>registration form</h1>
<form action="./save"  method="post">

<label for="id">Id:</label>
<input type="text" name="id"><br><br>

<label for="name">Name:</label>
<input type="text" name="name"><br><br>

<label for="salary">Salary:</label>
<input type="text" name="salary"><br><br>

<input type="submit" value="enter">

</form>


</body>
</html>