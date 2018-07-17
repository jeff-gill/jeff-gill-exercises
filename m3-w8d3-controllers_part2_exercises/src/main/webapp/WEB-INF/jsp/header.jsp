<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
 <title>Squirrel Cigar Parties</title>
    <c:url value="/css/site.css" var="cssHref" />
    <link rel="stylesheet" href="${cssHref}">
</head>
<body>
	<c:url value="/homePage" var="homePageHref" />
	<c:url value="/img/forDummies.png" var="coverPhoto" />
	<a href="${homePageHref}"> 
	<img src="${coverPhoto}"
		alt="SquirrelCigarParties" />
	</a>
