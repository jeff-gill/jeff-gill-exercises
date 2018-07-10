<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/header.jsp" />
<section id="main-content">
	<h1 style="font-size: 21px" align=center>Toy Department</h1>
	
	<div id="tiles">
	<c:forEach var="product" items="${productList}" step="1">
		<div class = "tile-items">
			<div class="tile-pic">
				<a
					href="<c:url value="productDetail?productId=${product.productId}"/> ">
					<img style="width: 200px""alt="toy-pictures" src="img/${product.imageName}">
				</a>
			</div>
			<div>
				<a
					href="<c:url value="productDetail?productId=${product.productId}"/> ">
					<b>${product.name}</b>
				</a>
				<c:choose>
					<c:when test="${product.topSeller == true}">
						<c:set var="bestSeller" value="BEST SELLER!" />
					</c:when>
					<c:otherwise>
						<c:set var="bestSeller" value="" />
					</c:otherwise>
				</c:choose>
				<b><font size="2px" color="red"> ${bestSeller}</font></b>

			</div>
			<div>
				<a>by ${product.manufacturer}</a> <br><a><font size="4.5px"
					color="red">$${product.price}</font> </a> <a><br /> <b>Weight</b>
					${product.weightInLbs} Lbs </a><br> <a> <fmt:formatNumber var="rating"
						type="number" maxFractionDigits="0"
						value="${product.averageRating}" /> <img style="width: 150px"
					src="img/${rating}-star.png" />
			</div>
		</div>

	</c:forEach>
	</div>
</section>

</body>
</html>