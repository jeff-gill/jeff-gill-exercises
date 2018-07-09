<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>

<html>
<head>
<meta name="viewport" content="width=device-width" />
<title>Product List View</title>
<link rel="stylesheet" href="css/site.css" />
</head>
<body>
	<header>
		<h1>MVC Exercises - Views Part 2: Models</h1>
	</header>
	<nav>
		<ul>
			<li><a style="font-size: 14px"
				href="http://localhost:8080/mvc-views-part2-exercises/productList">List
					Layout</a></li>
			<li><a style="font-size: 14px"
				href="http://localhost:8080/mvc-views-part2-exercises/productTiles">Tile
					Layout</a></li>
			<li><a style="font-size: 14px"
				href="http://localhost:8080/mvc-views-part2-exercises/productTable">Table
					Layout</a></li>
		</ul>
	</nav>
	<section id="product-list">
		<h1 style="font-size: 21px" align=center>Toy Department</h1>
		<div class="pix">
			<c:forEach var="product" items="${productList}">
				<div class="product-group">
					<a> <img style="width: 13em" alt="toy-balls"
						src="img/${product.imageName}">
					</a>
				</div>
			</c:forEach>
		</div>
		<div class="deets">
			<c:forEach var="product" items="${productList}">
				<div class="product-info">
					<div>
						<b>${product.name}</b>
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
					<div>by ${product.manufacturer}</div>
					<div>
						<font size="4.5px" color="red">$${product.price}</font>
					</div>
					<div>
						<b>Weight</b>${product.weightInLbs} Lbs
					</div>
					<div>
						<fmt:formatNumber var="rating" type="number" maxFractionDigits="0"
							value="${product.averageRating}" />
						<img style="width: 150px" src="img/${rating}-star.png" />
					</div>
				</div>
			</c:forEach>
		</div>
	</section>

</body>
</html>