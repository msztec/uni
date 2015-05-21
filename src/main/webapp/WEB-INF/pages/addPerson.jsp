<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html; UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC</title>
</head>
<body>
	<h1>
		<s:message code="addNewPerson" />
	</h1>

	<f:form modelAttribute="person" method="POST" acceptCharset="UTF-8">
		<table border="1">
			<tr>
				<td>Name</td><td><f:input path="name" /></td><td><f:errors path="name" /></td>
			</tr>
			<tr>
				<td>Surname</td><td><f:input path="surname" /></td><td><f:errors path="surname" /></td>
			</tr>
			<tr>
				<td>Age</td><td><f:input path="age" /></td><td><f:errors path="age" /></td>
			</tr>
			<tr>
				<td>City</td><td><f:input path="address.city" /></td><td><f:errors path="address.city" /></td>
			</tr>
			<tr>
				<td>Street</td><td><f:input path="address.street" /></td><td><f:errors path="address.street" /></td>
			</tr>
			<tr>
				<td>Postal code</td><td><f:input path="address.postalCode" /></td><td><f:errors path="address.postalCode" /></td>
			</tr>
		</table>
		<input type="submit" value="<s:message code="submitButton"/>" />
		<f:errors path=""/>
	</f:form>

</body>
</html>