<%--
  Created by IntelliJ IDEA.
  User: syed
  Date: 30-06-2019
  Time: 11:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    First Name <form:input path="firstName"/>
    <br>
    Last Name <form:input path="lastName"/>
    <br>
    Age <form:input path="age"/>
    <br>
    Country
    <form:select path="country">
        <form:options items="${student.countries}"/>
    </form:select>
    <br>
    Favourite Language
    <form:radiobutton path="favouriteLanguage" label="Java" value="java"/>
    <form:radiobutton path="favouriteLanguage" label="Python" value="Python"/>
    <br>
    Operating System
    <form:checkbox path="operatingSystems" label="Windows" value="Windows"/>
    <form:checkbox path="operatingSystems" label="Linux" value="Linux"/>
    <form:checkbox path="operatingSystems" label="Mac" value="Mac"/>
    <br>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
