<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:import url="/WEB-INF/jsp/header.jsp" />
	<section id="main-content">
		<h1 style="font-size: 21px" align=center>Toy Department</h1>
		<table>
			<tr>
			<td id ="left-column"> </td>
				<c:forEach var="product" items="${productList}">
					<td><img style="width: 8em" src="img/${product.imageName}"></td>

				</c:forEach>
			</tr>
			<tr id="text-box">
			<td id ="left-column"></td>
				<c:forEach var="product" items="${productList}">
					<td><c:choose>
							<c:when test="${product.topSeller == true}">
								<c:set var="bestSeller" value="BEST SELLER!" />
							</c:when>
							<c:otherwise>
								<c:set var="bestSeller" value="" />
							</c:otherwise>
						</c:choose> <b><font size="2px" color="red"> ${bestSeller}</font></b></td>
				</c:forEach>
				
			</tr>
			<tr id ="left-column">
				<td> Name </td>
				<c:forEach var="product" items="${productList}">
					<td id="product-name" style="background-color: lightgray" align="center" >${product.name}</td>

				</c:forEach>
			</tr>
			<tr>
			<td id ="left-column"> Rating </td>
				<c:forEach var="product" items="${productList}">
					<td><fmt:formatNumber var="rating" type="number"
							maxFractionDigits="0" value="${product.averageRating}" /> <img
						style="width: 150px" src="img/${rating}-star.png" /></td>
				</c:forEach>
			</tr>
			<tr id="product-mfg" >
				<td id ="left-column"> Mfg. </td>
				<c:forEach var="product" items="${productList}">
					<td style="background-color: lightgray" align="center" >by ${product.manufacturer}</td>
				</c:forEach>
			</tr>
			<tr>
			<td id ="left-column"> Price </td>
				<c:forEach var="product" items="${productList}">
					<td><font color="red"><b> $${product.price}</b></font></td>
				</c:forEach>
			</tr>
			<tr>
			<td id ="left-column"> wt. (in lbs) </td>
				<c:forEach var="product" items="${productList}">
					<td id="product-weight" style="background-color: lightgray" align="center" >${product.weightInLbs} lbs</td>
				</c:forEach>
			</tr>
		</table>
	</section>

</body>
</html>

<%-- 
<table>
			<
			<tr>
				
			</tr>
		</table>
		<table>
			<tr>
				<td>
						by ${product.manufacturer}
				</td>
			</tr>
		</table>
		<table>
			<tr>
				<td>
					<div class="price">
						<a><font size="4.5px" color="red">$${product.price}</font> </a>
						<div class="weightInLbs">
							<a><b>Weight</b> ${product.weightInLbs} Lbs </a>

						</div>
					</div>
				</td>
			</tr> --%>
