<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Idea</title>
</head>
<body>
<h1>Idea ${idea.id}</h1>
<table>
    <tr>
        <td><i>Name: </i></td>
        <td>${idea.name}</td>
    </tr>
    <tr>
        <td><i>Author: </i></td>
        <td><a href="/users/${idea.author.id}">${idea.author.username}</a></td>
    </tr>
    <tr>
        <td><i>About: </i></td>
        <td>${idea.about}</td>
    </tr>
    <tr>
        <td><i>Status: </i></td>
        <td>${idea.status}</td>
    </tr>
</table>
<a href="/">home</a>

</body>
</html>