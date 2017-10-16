<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="pageTitle" value="Tile View"/>
<%@ include file="common/header.jspf" %>

	<div class="flexContainerTile">
		<c:forEach items="${products}" var="product">
			<div class="productTile">
				
				<div class="tilePic">
					<c:url var="productLink" value="productDetail?productId=${product.productId }"/>
					<a href="${productLink}"><img src="img/${product.imageName}" class="productTileImage"/></a>
					<c:if test="${product.topSeller == true}">
         			<div class ="bestSeller"><c:out value="BEST SELLER!"/></div></c:if> 
				</div>
					
				<div class="tileTitles">
						<div class = "tileName"><a href="${productLink}"><c:out value="${product.name}" /></a></div>
							by <c:out value="${product.manufacturer}" />
								<c:if test="${product.remainingStock < 5}">
									<div class="quantity"><c:out value="Only ${product.remainingStock} Left!" /></div>
								</c:if>
				</div>
					
				<div class="tileDetails">
					<br><div class="price">$<c:out value="${product.price}" /></div>
						
						<strong>Weight </strong><c:out value="${product.weightInLbs}"/> lbs
							<br><fmt:formatNumber value="${product.averageRating}"
								maxFractionDigits="0" var="formattedRating" />
							<img src="img/${formattedRating}-star.png" class="rating" />
				</div>
				
			</div>
		</c:forEach>
	</div>
		
<%@ include file="common/footer.jspf" %>