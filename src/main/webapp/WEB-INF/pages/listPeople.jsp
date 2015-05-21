<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Spring MVC</title>
</head>
<body>
<h1><s:message code="listOfPersons"/></h1>
<table border="1">
  <tr>
    <th>Name</th>
    <th>Surname</th>
    <th>Age</th>
    <th>Address</th>
  </tr>
  <c:forEach items="${persons}" var="person">
    <tr>
      <td>${person.name}</td>
      <td>${person.surname}</td>
      <td>${person.age}</td>
      <td>${person.address.city}<br />${person.address.street}<br />${person.address.postalCode}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>