<%--
  Created by IntelliJ IDEA.
  User: db
  Date: 5/27/21
  Time: 9:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="css/styles.css">
    <title>Codeup</title>
</head>
<body>
<!-- Instance method-->
<%!
    int counter = 0;
%>

<%
    counter ++;

%>

    <h1>Hello, Marco</h1>

    This page has been visited <%= counter %> times since server started.
</body>
</html>
