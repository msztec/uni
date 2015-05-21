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
		<s:message code="addNewCar" />
	</h1>

	<f:form modelAttribute="car" method="POST" acceptCharset="UTF-8">
		<table border="1">
			<tr>
				<td>Brand</td><td><f:input path="brand" /></td><td><f:errors path="brand" /></td>
			</tr>
			<tr>
				<td>Model</td><td><f:input path="model" /></td><td><f:errors path="model" /></td>
			</tr>
			<tr>
				<td>Year</td><td><f:input path="productionYear" /></td><td><f:errors path="productionYear" /></td>
			</tr>
		</table>
		<input type="submit" value="<s:message code="submitButton"/>" />
		<f:errors path=""/>
	</f:form>

</body>
</html>