<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Home page</title>
    <style type="text/css">
        .error {
            color: red;
            position: fixed;
            text-align: left;
            margin-left: 30px;
        }
    </style>
</head>
<body>
    <h1 align="center">LOVE CALCULATOR</h1>
    <hr />
    <form:form action="process-homepage" method="post" modelAttribute="userInfo">
        <div align="center">
            <p>
                <label for="yn">Your Name: </label>
                <form:input id="yn" path="userName" />
                <form:errors path="userName" cssClass="error" />
            </p>
            <p>
                <label for="cn">Crush Name: </label>
                <form:input id="cn" path="crushName" />
                <form:errors path="crushName" cssClass="error" />
            </p>
            <p>
                <form:checkbox path="tandc" id="check"/>
                <Label>I am agreeing that this is for fun</Label>
                <form:errors path="tandc" cssClass="error"/>
            </p>
            <input type="submit" value="calculate" />
        </div>
    </form:form>
</body>
</html>
