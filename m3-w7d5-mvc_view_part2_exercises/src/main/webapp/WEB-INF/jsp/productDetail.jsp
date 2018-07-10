<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/header.jsp" />

<section id="main-content">

	<div id="detail-container">

		<div id="detail-pix">

			<a> <img style="width: 400px" alt="toy-balls"
				src="img/${product.imageName}">
			</a>
		</div>
		<div id="detail-deets">
			<div class="name-deets">
				<a> <b>${product.name}</b>
				</a> <a> <c:choose>
						<c:when test="${product.topSeller == true}">
							<c:set var="bestSeller" value="BEST SELLER!" />
						</c:when>
						<c:otherwise>
							<c:set var="bestSeller" value="" />
						</c:otherwise>
					</c:choose> <a><b><font size="2px" color="red">  ${bestSeller}</font></b></a>
				</a>
			</div>
			<div>
				<div>by ${product.manufacturer}</div>
				<div id="deets-rating">
					<fmt:formatNumber var="rating" type="number" maxFractionDigits="0"
						value="${product.averageRating}" />
				</div>
				<img style="width: 150px" src="img/${rating}-star.png" /><br>
				<br>
			</div>

			<div>
				<font size="4.5px" color="red">$${product.price}</font>
			</div>
			<div>
				<b>Weight</b>${product.weightInLbs} Lbs
			</div><br><br>
			<div class="desc-deets">
				<b>Description: </b>${product.description}
			</div><br><br><br>

		</div>
	</div>
</section>
