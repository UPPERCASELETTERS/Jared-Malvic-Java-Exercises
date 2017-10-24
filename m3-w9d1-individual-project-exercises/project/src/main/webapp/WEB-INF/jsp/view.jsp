<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="Clockr - View"/>
<%@include file="common/header.jspf" %>

<h2>Your Time Sheets</h2>

<c:url value="/clockIn" var="clockIn"/>
<a href="${clockIn}">Clock-In</a>
<br>
<br>

<c:forEach items="${allTimeCards}" var="card">
	<div class="card">
		<span>User: <c:out value="${card.username }"/> Project: <c:out value="${card.project }"/></span>
		<br>Start: <c:out value="${card.start}"/>
		<br>End: <c:out value="${card.end}"/>
	</div>


</c:forEach>


<%@include file="common/footer.jspf" %>
