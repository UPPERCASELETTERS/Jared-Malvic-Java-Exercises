<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="pageTitle" value="Clockr - Login"/>
<%@include file="common/header.jspf" %>

<c:url var="viewUrl" value="/view"/>
			<form method="GET" action="${viewUrl}">
			<br>	
				<div>
					<label for="username">Email</label>
					<input type="text" name="username" id="username"/>
					*
				</div>
				
			<br>
				<div>
					<input type="submit" value="View Time Cards"/>
				</div>
			</form>
			
<%@include file="common/footer.jspf" %>