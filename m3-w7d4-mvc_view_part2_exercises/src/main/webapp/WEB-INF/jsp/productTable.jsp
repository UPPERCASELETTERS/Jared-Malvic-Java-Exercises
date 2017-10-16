<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="pageTitle" value="Table View"/>
<%@ include file="common/header.jspf" %>
   
        <div class="tableContainer">
         <table id="productTable">
         	<tr>
         		<th>&nbsp;</th>
         		<c:forEach items="${products}" var="product">
         		<c:url var="productLink" value="productDetail?productId=${product.productId }"/>
         			<td><a href="${productLink}"><img src="img/${product.imageName}" class="productTableImage"/></a>
         			<c:if test="${product.topSeller == true}">
         			<br><div class ="bestSeller"><c:out value="BEST SELLER!"/></div></c:if></td>
         		</c:forEach>
         	</tr>
			<tr class="gray">
				<th>Name</th>
				<c:forEach items="${products}" var="product">
					<td><a href="${productLink}"><c:out value="${product.name}" /></a></td>
				</c:forEach>
			</tr>
			<tr>
				<th>Rating</th>
				<c:forEach items="${products}" var="recipe">
					<td>
						<fmt:formatNumber value="${recipe.averageRating}" maxFractionDigits="0" var="formattedRating"/>
						<img src="img/${formattedRating}-star.png" class="rating"/>
					</td>
				</c:forEach>
			</tr>
			<tr  class="gray">
				<th>Mfr</th>
				<c:forEach items="${products}" var="product">
					<td><c:out value="${product.manufacturer}" /></td>
				</c:forEach>
			</tr>
			<tr>
				<th>Price</th>
				<c:forEach items="${products}" var="product">
					<td><c:out value="${product.price}" /></td>
				</c:forEach>
			</tr>
			<tr  class="gray">
				<th>Wt. (lbs)</th>
				<c:forEach items="${products}" var="product">
					<td><c:out value="${product.weightInLbs}" /></td>
				</c:forEach>
			</tr>
		</table>
	</div>
      
<%@ include file="common/footer.jspf" %>