<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />

<c:url value="/readReviewsPage" var="formAction" />
<form method="POST" action="${formAction}">
	<p>
		<label for="username">Your Username: </label> <input type="text"
			id="username" name="username" size="15"/> (max. 15 characters)
	</p>
	<p>
		<label for=rating>Your Star(s) Rating:</label> <input type="text"
			id="rating" name="rating" size="5" style="text-align:center"/> (enter 1 - 5)
	</p>
	<p>
		<label for="reviewTitle">Your review title:</label> <input type="text"
			id="reviewTitle" name="reviewTitle" maxlength="30"/ size="32"> (max. 20 characters)
	</p>
	<p>
		<label for="reviewBody"> Please provide your review: </label> <input
			type="text" id="reviewBody" name="reviewBody" maxlength="200" size="50" /> (max. 200 characters)
	</p>

	<input type="submit" value="Post your review!" />
</form>
</body>
</html>