<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="pageTitle" value="Register"/>
<%@include file="common/header.jspf" %>

<h2>Login</h2>

			<c:url var="registerUrl" value="/register"/>
			<form:form method="POST" action="${registerUrl}" modelAttribute="register">
			
				<div>
					<label for="firstName">First Name</label>
					<form:input path="firstName"/>
					<form:errors path="firstName" cssClass="error"/>
					*
				</div>
				
				<div>
					<label for="lastName">Last Name</label>
					<form:input path="lastName"/>
					<form:errors path="lastName" cssClass="error"/>
					*
				</div>
				
				<div>
					<label for="email">Email</label>
					<form:input path="email"/>
					<form:errors path="email" cssClass="error"/>
					*
				</div>
				
				<div>
					<label for="emailConfirm">Email Confirmation</label>
					<form:input path="emailConfirm"/>
					<form:errors path="emailConfirm" cssClass="error"/>
					*
				</div>
				
				<div>
					<label for="password">Password</label>
					<form:input path="password"/>
					<form:errors path="password" cssClass="error"/>
					*
				</div>
				
				<div>
					<label for="passwordConfirm">Password Confirmation</label>
					<form:input path="passwordConfirm"/>
					<form:errors path="passwordConfirm" cssClass="error"/>
					*
				</div>
				
				<div>
					<label for="date">Birth Date</label>
					<form:input path="date"/>
					<form:errors path="date" cssClass="error"/>
					*
				</div>
				
				<div>
					<label for="tickets">Tickets</label>
					<form:input path="tickets"/>
					<form:errors path="tickets" cssClass="error"/>
					*
				</div>
				
				
				<br>
				<div>
					<input type="submit" value="Login"/>
				</div>
			</form:form>


<%@include file="common/footer.jspf" %>