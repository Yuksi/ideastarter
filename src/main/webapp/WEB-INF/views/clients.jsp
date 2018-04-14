<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>clients</title>
</head>
<body>
<h1>Clients count is : ${clients.size()}</h1>

<table style="border-style: solid">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Address</td>
        <td>Age</td>
    </tr>
    <c:forEach var="client" items="${clients}">
        <tr>
            <td>${client.id}</td>
            <td><a href="/clients/${client.id}/accounts">${client.name}</a></td>
            <td>${client.address}</td>
            <td>${client.age}</td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="add-client">New client</a>
<a href="/">home</a>
</body>
</html>