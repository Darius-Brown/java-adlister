<%--
  Created by IntelliJ IDEA.
  User: db
  Date: 5/28/21
  Time: 11:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Guess Controller</title>
</head>
<body>
<h1>pick a number between 1 and 3</h1>
<form method="post" action="http://localhost:8080/guess">
    <input type="text" id="userGuess" placeholder="Pick a number between 1 & 3" name="userGuess" required>
    <button type="submit" id="submit">Submit</button>
</form>
<p>${param.userGuess}</p>
<c:choose>
    <c:when test="${param.userGuess.equals(3)}">
        <jsp:forward page="http://localhost:8080/correct" />
    </c:when>
    <c:when test="${param.userGuess.equals(2)}">
        <jsp:forward page="http://localhost:8080/incorrect" />
    </c:when>
    <c:otherwise>

    </c:otherwise>
</c:choose>
</body>
</html>
