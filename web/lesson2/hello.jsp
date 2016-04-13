<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 13.04.16
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
</body>
</html>
