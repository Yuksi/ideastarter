<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>users</title>
</head>
<body>
<h1>Users count is : ${users.size()}</h1>

<table style="border-style: solid">
    <tr>
        <td>ID</td>
        <td>Login</td>
        <td>Password</td>
        <td>Name</td>
        <td>Email</td>
        <td>About</td>
        <td>Role</td>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.id}</td>
            <td><a href="/users/${user.id}">${user.login}</a></td>
            <td>${user.password}</td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.about}</td>
            <td>${user.role}</td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="/">home</a>
</body>
</html>