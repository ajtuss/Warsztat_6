<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ajtus
  Date: 31.08.18
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <style>
        div{
            margin: 5px;
        }
    </style>
</head>
<body>
<div>
    <form:form method="post" modelAttribute="user">
        <fieldset>Podaj dane użytkownika</fieldset>
        <div>
            <input type="text" name="username" placeholder="Podaj login">
        </div>
        <div>
            <input type="text" name="email" placeholder="Podaj email">
        </div>
        <div>
            <input type="password" name="password" placeholder="Podaj hasło">
        </div>
        <fieldset>
            <span>
                <input type="reset" value="Wyczyść">
            </span>
            <span>
                <input type="submit" value="Wyślij">
            </span>
        </fieldset>
    </form:form>
</div>
</body>
</html>
