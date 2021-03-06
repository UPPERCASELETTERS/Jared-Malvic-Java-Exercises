<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="pageTitle" value="Tile View"/>
<%@ include file="common/header.jspf" %>
<div class="productLine">
				<div class="listImage">
					<c:url var="productLink" value="productDetail?productId=${product.productId }"/>
					<a href="${productLink}"><img src="img/${product.imageName}" class="productListImage"/></a>
					
				</div>
				
				<div id="productDetails">	
					<br><br><br><br><strong><a href="${productLink}"><c:out value="${product.name}" /></a></strong> 
					<br>by <c:out value="${product.manufacturer}" />
					<br><div class="quantity"><c:if test="${product.remainingStock < 5}">
					<c:out value="Only ${product.remainingStock} Left!" /></c:if>
					</div>
					<div class="price">$<c:out value="${product.price}" /></div>
					<c:if test="${product.topSeller == true}">
         			<div class ="bestSeller"> <c:out value="BEST SELLER!"/></div></c:if>
					<br><strong>Weight </strong><c:out value="${product.weightInLbs}"/> lbs
					<br><fmt:formatNumber value="${product.averageRating}" maxFractionDigits="0" var="formattedRating" />
					<img src="img/${formattedRating}-star.png" class="rating" />		
				</div>
				
				<div class="description">
					<strong>Description: </strong><c:out value="${product.description}"/>
				</div>
				
			</div>
<%@ include file="common/footer.jspf" %>