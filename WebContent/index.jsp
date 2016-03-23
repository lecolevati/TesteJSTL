<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form action="chamaservlet" method="post">
			<input type="submit" name="Enviar" value="Enviar">
		</form>
	</div>

	<c:set var="var" value="${nomeVariavel }" />
	<c:if test="${not empty requestScope[var]}">
		<div align="center">
			
			<c:out value="${nomeVariavel }" />
			<br />
			<c:forEach items="${requestScope[var]}" var="x">
				<c:out value="${x }" />
				<br />
			</c:forEach>
		</div>
	</c:if>
</body>
</html>