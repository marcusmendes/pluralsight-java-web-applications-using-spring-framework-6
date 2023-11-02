<%@ page contentType="text/html; UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Registration</title>
   </head>
   <body>
        <h1>Registration</h1>
        <form:form modelAttribute="registration">
            <table>
                <tr>
                    <td><form:label path="name"><spring:message code="name" /></form:label></td>
                    <td><form:input path="name" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Register" />
                    </td>
                </tr>
            </table>
        </form:form>
   </body>
</html>