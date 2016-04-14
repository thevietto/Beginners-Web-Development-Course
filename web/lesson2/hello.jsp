<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 14.04.16
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSP</title>
</head>
<body>


<% if (request.getParameter("name") != null) { %>
<p>Привет, <%= request.getParameter("name") %>!</p>
<% } else { %>
<p>ПРивет, аноним!</p>
<% } %>

<c:choose>
    <c:when test="${param.name != null}">
        <p>Привет из JSTL, ${param.name}!</p>
    </c:when>
    <c:otherwise>
        <p>ПРивет, аноним!</p>
    </c:otherwise>
</c:choose>

</body>
</html>
