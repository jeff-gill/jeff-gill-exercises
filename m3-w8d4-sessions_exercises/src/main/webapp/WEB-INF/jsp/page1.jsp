<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp" />

<section>

	<p><b>What is your favorite color?</b>
	<form method="POST" action="page2">

		<div class="formInputGroup">
			<input type="text" name="color" id="color"
				placeholder="Favorite Color" size="15" />
		</div>
		<div>
			<p><input class="formSubmitButton" type="submit" value="Next >>>" /></p>
		</div>
	</form>

</section>


</body>
</html>
