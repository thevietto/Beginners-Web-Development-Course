<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 13.04.16
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>

<h1>Тестим JSP</h1>

<% if (request.getParameter("name") != null) { %>
<p>Привет, <%= request.getParameter("name") %>
</p>
<%} else {%>
<p>Привет, аноним!</p>
<% } %>

<c:if test="${param.name != null}">
    <p>Привет из JSTL, <c:out value="${param.name}"/></p>
</c:if>

<c:choose>
    <c:when test="${param.name != null}">
        <p>Привет из JSTL, <c:out value="${param.name}"/></p>
    </c:when>
    <c:otherwise>
        <p>Привет, аноним!</p>
    </c:otherwise>
</c:choose>

</body>
</html>
