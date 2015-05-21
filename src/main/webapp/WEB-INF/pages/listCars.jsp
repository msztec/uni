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
	<h1><s:message code="listOfCars"/></h1>
	<table border="1">
		<tr>
			<th>Brand</th>
			<th>Model</th>
			<th>Year</th>
		</tr>
		<c:forEach items="${cars}" var="car">
			<tr>
				<td>${car.brand}</td>
				<td>${car.model}</td>
				<td>${car.productionYear}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>