<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Actors List" />

<%@include file="common/header.jspf"%>


<section>
<form method="GET" action="${formAction}">
	<div class="actorContainer">
		<div class="lastNameInput">
			<input type="text" name="lastName" id="lastName"
				placeholder="Search Last Name" />
		</div>
		<input class="formSubmitButton" type="submit" value="Submit" />
	</div>
</form>

<table class="table">
	<tr>
		<th>Name</th>
	</tr>
	<c:forEach items="${actorsList}" var="actor">
		<tr>
			<td>${filmRow.firstName} ${filmRow.lastName}</td>
		</tr>
	</c:forEach>
</table>
</section>


<%@include file="common/footer.jspf"%>



