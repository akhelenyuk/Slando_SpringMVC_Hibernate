<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>Registration page</title>
</head>
<body>
<h1>Registration</h1>

<form:form action="/registerNewUser" method="post" modelAttribute="user">
    Login: <form:input path="login"/>
    Password: <form:password path="password"/>

    <input type="submit" value="register">
</form:form>
</body>
</html>
