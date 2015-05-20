<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
    <title>SPRING MVC!</title>
</head>
<body>
<h1><s:message code="welcomeMessage"/></h1>
<ul>
    <li><a href="#"><s:message code="listOfPersons"/> </a></li>
    <li><a href="#"><s:message code="addNewPerson"/> </a></li>
</ul>


</body>
</html>
