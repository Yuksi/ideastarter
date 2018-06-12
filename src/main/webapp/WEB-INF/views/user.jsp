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
<div class="container">

    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <h2>User ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a>
        </h2>

    </c:if>

</div>
<a href="/">home</a>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>