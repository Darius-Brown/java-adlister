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
</head>
<body>

<div>
    <form method="post" action="/login.jsp">
    <label for="username">Username : </label>
    <input type="text" id="username" placeholder="Enter Username" name="username" required>
    <label for="password">Password : </label>
    <input type="password" id="password" placeholder="Enter Password" name="password" required>
    <button type="submit">Login</button>
    </form>
</div>
<div>
    <p>username: ${param.username}</p>
    <p>password: ${param.password}</p>

</div>

</body>
</html>