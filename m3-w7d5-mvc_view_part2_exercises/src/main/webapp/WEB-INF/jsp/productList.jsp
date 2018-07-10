<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/header.jsp" />

<section id="product-list">
	<h1 style="font-size: 21px" align=center>Toy Department</h1>
	<div class="container">
		<c:forEach var="product" items="${productList}">
			<div class="item-containers">
			<div class="pix">

				<a
					href="<c:url value="productDetail?productId=${product.productId}"/> ">
					<img style="width: 13em" alt="toy-balls"
					src="img/${product.imageName}">
				</a>
			</div>
			<div class="deets">
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
				<a><b><font size="2px" color="red"> ${bestSeller}</font></b></a>

				<div>by ${product.manufacturer}</div>
				<div>
					<font size="4.5px" color="red">$${product.price}</font>
				</div>
				<div>
					<b>Weight</b>${product.weightInLbs} Lbs
				</div>
				<div>
					<div id="deets-rating">
						<fmt:formatNumber var="rating" type="number" maxFractionDigits="0"
							value="${product.averageRating}" />
					</div>
					<img style="width: 150px" src="img/${rating}-star.png" /><br>
					<br>
				</div>

</div>
			</div>
		</c:forEach>
	</div>
</section>

</body>
</html>