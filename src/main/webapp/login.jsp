<%--
  Created by IntelliJ IDEA.
  User: db
  Date: 5/27/21
  Time: 2:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<div>
    <form method="post" action="/login.jsp" class="center space">
    <label for="username">Username : </label>
    <input type="text" id="username" placeholder="Enter Username" name="username" required>
    <label for="password" class="ml">Password : </label>
    <input type="password" id="password" placeholder="Enter Password" name="password" required>
    <button type="submit">Login</button>
    </form>
</div>
<div class="center space">
    <p class="space">username: ${param.username}</p>
    <p class="space">password: ${param.password}</p>
 <%
     request.setAttribute("pwd", "password");
     request.setAttribute("usr", "admin");
 %>

    <c:choose>
        <c:when test="${param.username.equals(usr) && param.password.equals(pwd)}">
            <jsp:forward page="profile.jsp" />
        </c:when>
        <c:otherwise>
    <%--        <% response.sendRedirect("http://localhost:8080/login.jsp"); %>   --%>
        </c:otherwise>
    </c:choose>
</div>

</body>
</html>