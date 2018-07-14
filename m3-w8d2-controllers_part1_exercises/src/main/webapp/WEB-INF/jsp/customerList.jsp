<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Customers List"/>

<%@include file="common/header.jspf"%>

<c:url var="formAction" value= "/searchCustomerList" />
<section>
<form method="GET" action="${formAction}">
	<div class="customerContainer">
		<div class="userInput">
			<input type="text" name="userInput" id="userInput"
				placeholder="Search customer..." />
		</div>
		<select name="genreChoice" value="${option}">
					<option value="Sort By">Sort By...</option>
					<option value="lastName">Last Name</option>
					<option value="email">Email</option>
					<option value="active">Active</option>
				</select>
		<input class="formSubmitButton" type="submit" value="Submit" />
	</div>
</form>

<table class="table">
	
	<c:forEach items="${customers}" var="customer">
		<tr>
			<td>${customer.firstName} ${customer.lastName}</td>
			<td>${customer.email}</td>
			<td>${customer.activebool}</td>
		</tr>
	</c:forEach>
</table>
</section> 


<%@include file="common/footer.jspf"%>

