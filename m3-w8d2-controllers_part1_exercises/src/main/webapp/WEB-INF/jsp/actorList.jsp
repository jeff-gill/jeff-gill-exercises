<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Actors List" />

<%@include file="common/header.jspf"%>

<c:url var="formAction" value= "/searchActorList" />
<section>
<form method="GET" action="${formAction}">
	<div class="actorContainer">
		<div class="lastNameInput">
			<input type="text" name="lastName" id="lastName"
				placeholder="Last name contains" />
		</div>
		<input class="formSubmitButton" type="submit" value="Submit" />
	</div>
</form>

<table class="table">
	<tr>
		<th>Name</th>
	</tr>
	<c:forEach items="${actors}" var="actor">
		<tr>
			<td>${actor.firstName} ${actor.lastName}</td>
		</tr>
	</c:forEach>
</table>
</section>


<%@include file="common/footer.jspf"%>



