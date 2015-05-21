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
<h1>${welcomeMsg}</h1>
<h2><c:out value="${welcomeMsg}"/></h2>
<ul>
	<li><a href="/list/people"><s:message code="listOfPersons"/></a></li>
		<li><a href="add/person"><s:message code="addNewPerson"/></a></li>
	<br />
	<li><a href="list/car"><s:message code="listOfCars"/></a></li>
		<li><a href="add/car"><s:message code="addNewCar"/></a></li>
	<br />
</ul>
</body>
</html>