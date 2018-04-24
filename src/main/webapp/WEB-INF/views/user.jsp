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
        <td>${user.login}</td>
    </tr>
    <tr>
        <td><i>Password: </i></td>
        <td>${user.psw}</td>
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
</body>
</html>