<%@ page import="com.starter.entities.enums.Statuses" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>ideas</title>
</head>
<body>
<h1>Ideas count is : ${ideas.size()}</h1>

<table style="border-style: solid">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Author</td>
        <td>About</td>
        <td>Status</td>
    </tr>
    <c:forEach var="idea" items="${ideas}">
        <tr>
            <td>${idea.id}</td>
            <td><a href="/users/${idea.id}">${idea.name}</a></td>
            <td><a href="/users/${idea.author.id}">${idea.author.login}</a></td>
            <td>${idea.about}</td>
            <td>${idea.status}</td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="/">home</a>
</body>
</html>