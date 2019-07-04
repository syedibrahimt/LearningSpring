<%--
  Created by IntelliJ IDEA.
  User: syed
  Date: 30-06-2019
  Time: 11:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Welcome page</title>
</head>
<body>
    <h1>Welcome ${student.firstName}</h1>
    <h2>First name: ${student.firstName}</h2>
    <h2>Last name: ${student.lastName}</h2>
    <h2>Age: ${student.age}</h2>
    <h2>Country: ${student.country}</h2>
    <h2>favouriteLanguage: ${student.favouriteLanguage}</h2>
    <h2>operatingSystems</h2>
    <ul>
        <c:forEach var="temp" items="${student.operatingSystems}">
            <li>${temp}</li>
        </c:forEach>
    </ul>
</body>
</html>
