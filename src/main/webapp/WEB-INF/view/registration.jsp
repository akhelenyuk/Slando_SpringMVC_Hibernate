<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>Registration page</title>
</head>
<body>
<h1>Register new user</h1>

<form:form action="/savenewuser" method="post" modelAttribute="user">
    Name:  <br>
    Last name: <br>
    Login: <form:input path="login"/> <br>
    Password: <form:password path="password"/> <br>
    Confirm password: <br><br>

    <input type="submit" value="register">
</form:form>
</body>
</html>
