<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>Exercise 2 - Fibonacci 25</title>
<style>
li {
	list-style-type: none;
}
</style>
</head>
<body>
	<h1>Exercise 2 - Fibonacci 25</h1>
	<ul>
		<c:set var="current" value="0" />
		<c:set var="last" value="1" />
		<c:forEach begin="1" end="25" var="number">
				<c:set var="temp" value="${current}" />
				<c:set var="current" value="${current + last}" />
				<c:set var="last" value="${temp}" />
				<li>${current}</li>

		
		</c:forEach>

	</ul>
</body>
</html>