<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 21.04.16
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sessions</title>
</head>
<body>

<p>${sessionCreated}</p>

<h3>Добавить into session </h3>

<form action="/lesson3/sessions" method="POST">
    <input type="text" name="sName" placeholder="имя"/>
    <input type="text" name="sValue" placeholder="значение"/>
    <input type="submit">
</form>


<h3>Посмотреть все session </h3>

<c:forEach var="item" items="${sessionScope.map}">

    <p>${item.key} = ${item.value}</p>

</c:forEach>

</body>
</html>
