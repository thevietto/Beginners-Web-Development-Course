<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 14.04.16
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>JSTL</title>
</head>
<body>
<c:if test="${messageList.isEmpty()}">
    <p>Sorry :( there is no messages yet</p>
</c:if>
<c:forEach var="item" items="${messageList}">
    <p>${item}</p>
</c:forEach>

<form action="/lesson2/jstl" method="post">
    Ваше сообщение: <input type="text" name="message">
</form>

</body>
</html>
