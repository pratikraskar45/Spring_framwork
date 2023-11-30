<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="save" modelAttribute="employe">
Id:<form:input path="id"/>
name:<form:input path="name"/>
phone:<form:input path="phone"/>
salary:<form:input path="salary"/>

<input type="submit">


</form:form>
</body>
</html>