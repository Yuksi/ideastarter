<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User</title>
</head>
<body>
<h1>User ${user.id}</h1>
<table>
    <tr>
        <td><i>Login: </i></td>
        <td>${user.username}</td>
    </tr>
    <tr>
        <td><i>Password: </i></td>
        <td>${user.password}</td>
    </tr>
    <tr>
        <td><i>Name: </i></td>
        <td>${user.name}</td>
    </tr>
    <tr>
        <td><i>Email: </i></td>
        <td>${user.email}</td>
    </tr>
    <tr>
        <td><i>About: </i></td>
        <td>${user.about}</td>
    </tr>
    <tr>
        <td><i>Ideas: </i></td>
        <td><a href="/users/${user.id}/ideas">My ideas</a></td>
    </tr>
</table>
<a href="/users/${user.id}/add-idea">New idea</a>

<a href="/">home</a>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>