<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="pageTitle" value="Clockr - Home"/>
<%@include file="common/header.jspf" %>

<h2>Welcome to Clockr</h2>

<p>
	<strong>Here's how to get started:</strong>
	<br>
	1) Login above with your previously used email which is used as your user name.<br>
	2) After a successful login, you'll be presented with all of your previous "time cards." (Each time card contains your user name, project, clock in/out, and notes).<br>
	3) Clock-in!<br>
	4) Clock-out! (You may add the project you worked on plus any notes you may want to add).<br>
	5) You're done!
	

</p>

			

<%@include file="common/footer.jspf" %>
