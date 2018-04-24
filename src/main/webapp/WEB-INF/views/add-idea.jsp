<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add idea</title>
</head>
<body>
<h1>New idea</h1>
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
        <tr>
            <td><input type="submit" value="Save Changes"/></td>
        </tr>
    </table>
</f:form>
</body>
</html>