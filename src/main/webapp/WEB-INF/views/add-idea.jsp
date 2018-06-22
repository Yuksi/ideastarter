<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Add idea</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

<header>
    <div class="container-fluid">
        <div class="col-sm-4"></div>
        <div class="col-sm-4">
            <a href="/"><img class="img-responsive center-block" src="${pageContext.request.contextPath}/resources/images/logo.png"></a>
        </div>
        <div class="col-sm-4">
            <c:if test="${pageContext.request.userPrincipal.name != null}">
                    <form id="logoutForm" method="POST" action="${contextPath}/logout">
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    </form>

                   <p class="text-right">Welcome, ${pageContext.request.userPrincipal.name}! </p>

             </c:if>
        </div>
    </div>
</header>

<div class="panel panel-default">
        <div class="btn-group-justified">
                	<a class="btn btn-link" href="../users">USERS</a>
                    <a class="btn btn-link" href="../ideas">IDEAS</a>
                    <a class="btn btn-link" href="../draft/ideas">DRAFT IDEAS</a>
                    <a class="btn btn-link" href="../published/ideas">PUBLISHED IDEAS</a>
                    <a class="btn btn-link" href="../registration">REGISTRATION</a>
                    <a class="btn btn-link" href="../login">LOGIN</a>
         </div>
    </div>

    <div class="container-fluid">
        <div class="col-sm-4"></div>
        <div class="col-sm-4">
            <div class="panel panel-default">
                <div class="panel-heading">Add your idea</div>
                <f:form method="POST" commandName="idea" action="ideas">
                                    <table>
                                        <tr>
                                            <td>
                                                <i>Name:</i>
                                            </td>
                                            <td>
                                                <f:input path="name"/>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                <i>About:</i>
                                            </td>
                                            <td>
                                                <f:input path="about"/>
                                            </td>
                                        </tr>
                                    </table>
                                    <input type="submit" class="btn btn-info center-block" value="Save Changes">
                                    </f:form>
            </div>

        </div>
<div class="col-sm-4"></div>
    </div>

</body>
</html>