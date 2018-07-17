<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />

<section>

	<p><b>What is your favorite FOOD?</b>
	<form method="POST" action="page3">

		<div class="formInputGroup">
			<input type="text" name="food" id="food"
				placeholder="Favorite Food" size="30" />
		</div>
		<div>
			<p><input class="formSubmitButton" type="submit" value="Next >>>" /></p>
		</div>
	</form>

</section>


</body>
</html>
