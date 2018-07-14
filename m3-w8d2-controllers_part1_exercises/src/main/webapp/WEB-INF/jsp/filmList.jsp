<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="pageTitle" value="All Film List" />

<%@include file="common/header.jspf"%>


<c:url var="formAction" value= "/searchFilmList" />
<section>
	
<form method="GET" action="${formAction}">
	<div class="filmContainer">
		<div class="minLengthInput">
			<input type="text" name="minLength" id="minLength"
				placeholder="Min. Length in Mins" />
		</div>

		<div class="maxLengthInput">
			<input type="text" name="maxLength" id="maxLength"
				placeholder="Max. Length in Mins" />
		</div>
		<select name="categoryChoice">
					<option value="Choose a Genre">Choose a Genre...</option>
					<c:forEach items="${categories}" var="category">
					<option value="${category}">${category}</option>
					</c:forEach>
				</select>
		<input class="formSubmitButton" type="submit" value="Submit" />
	</div>
</form>

<table class="table">
	<tr>
		<th>Title</th>
		<th>Description</th>
		<th>Release Year</th>
		<th>Length (in mins)</th>
		<th>Rating</th>

	</tr>
	<c:forEach items="${films}" var="film">    <!-- TODO: cannot get <forEach> loop to activate -->
		<tr>
			<td>${film.name}</td>
			<td>${film.description}</td>
			<td>${film.releaseYear}</td>
			<td>${film.length}</td>
			<td>${film.rating}</td>
		</tr>
	</c:forEach>
	
</table>
</section>


<%@include file="common/footer.jspf"%>



