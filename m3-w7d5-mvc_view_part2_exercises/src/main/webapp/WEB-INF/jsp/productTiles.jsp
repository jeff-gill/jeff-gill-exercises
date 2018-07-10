<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/header.jsp" />
<section id="main-content">
	<h1 style="font-size: 21px" align=center>Toy Department</h1>
	<c:forEach var="product" items="${productList}">
		<div id="tiles">
			<a> <img style="width: 200px" alt="toy-balls"
				src="img/${product.imageName}">
			</a>
			<div>
				<a> <b>${product.name}</b> <c:choose>
						<c:when test="${product.topSeller == true}">
							<c:set var="bestSeller" value="BEST SELLER!" />
						</c:when>
						<c:otherwise>
							<c:set var="bestSeller" value="" />
						</c:otherwise>
					</c:choose> <b><font size="2px" color="red"> ${bestSeller}</font></b>
				</a>
			</div>
			<a>by ${product.manufacturer}</a> <a><font size="4.5px"
				color="red">$${product.price}</font> </a> <a><br /> <b>Weight</b>
				${product.weightInLbs} Lbs </a> <a> <fmt:formatNumber var="rating"
					type="number" maxFractionDigits="0"
					value="${product.averageRating}" /> <img style="width: 150px"
				src="img/${rating}-star.png" />
		</div>

	</c:forEach>
</section>

</body>
</html>