<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 14.04.16
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Twitter</title>
</head>
<body>

<form action="/lesson2/twitter" method="post">
    Ваш твит: <input name="tweet" type="text">
    <input type="submit">
</form>

<c:if test="${tweets.isEmpty()}">
    <p>Sorry!! :^(</p>
</c:if>

<c:forEach items="${tweets}" var="item">
    <p>${item.message} ${item.createdAt} <a href="#">Удалить</a> </p>
</c:forEach>



</body>
</html>
