<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="Clockr - View"/>
<%@include file="common/header.jspf" %>

<h2>You're Clocked In</h2>

<c:out value="${tempTC.id}"/>


<%@include file="common/footer.jspf" %>
