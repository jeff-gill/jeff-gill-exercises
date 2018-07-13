<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Film List" />

<%@include file="common/header.jspf"%>



<section>
<form method="GET" action="${formAction}">
	<div class="filmContainer">
		<div class="minLengthInput">
			<input type="text" name="minLength" id="minLength"
				placeholder="Search Minimum Length" />
		</div>

		<div class="maxLengthInput">
			<input type="text" name="maxLength" id="maxLength"
				placeholder="Search Maximum Length" />
		</div>
		<%-- <select name="genreChoice" value="${option}">
					<option value="${filmRow.category}">${filmRow.category}</option>
					
				</select> --%>
		<input class="formSubmitButton" type="submit" value="Submit" />
	</div>
</form>

<table class="table">
	<tr>
		<th>Name</th>
	</tr>
	<c:forEach items="${actors}" var="actor">
		<tr>
			<!-- What do we print here for each actor? -->
		</tr>
	</c:forEach>
</table>
</section>


<%@include file="common/footer.jspf"%>



