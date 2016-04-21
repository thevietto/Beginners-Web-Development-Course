<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 21.04.16
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Cookies</title>
</head>
<body>

<h3>Добавить куку:</h3>

<form action="/lesson3/cookies" method="POST">
    <input type="text" name="cName" placeholder="имя"/>
    <input type="text" name="cValue" placeholder="значение"/>
    <input type="submit">
</form>


<h3>Посмотреть все куки: </h3>

<c:forEach var="item" items="${cookie.values()}">

    <p>${item.name} = ${item.value}</p>

</c:forEach>

</body>
</html>
