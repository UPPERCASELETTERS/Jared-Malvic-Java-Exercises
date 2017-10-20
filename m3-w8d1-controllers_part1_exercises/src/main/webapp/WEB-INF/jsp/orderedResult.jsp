<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
	<head>
		<title></title>
	</head>
	<body>
		<h2>Ordered Name</h2>
		First Name: <c:out value="${param.firstName}"/><br>
		Middle Initial: <c:out value="${param.middle}"/><br>
		Last Name: <c:out value="${param.lastName}"/>
		
		<c:if test="${param.order=='FML'}">
			<div>
				<c:out value="${param.firstName}"/> <c:out value="${param.middle}"/>. <c:out value="${param.lastName}"/>
			</div>
		</c:if>
		
		<c:if test="${param.order=='FL'}">
			<div>
				<c:out value="${param.firstName}"/>, <c:out value="${param.lastName}"/>
			</div>
		</c:if>
		
		<c:if test="${param.order=='LFM'}">
			<div>
				<c:out value="${param.lastName}"/>, <c:out value="${param.firstName}"/> <c:out value="${param.middle}"/>
			</div>
		</c:if>
		
		<c:if test="${param.order=='LF'}">
			<div>
				<c:out value="${param.lastName}"/>, <c:out value="${param.firstName}"/>
			</div>
		</c:if>
	</body>
</html>