<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
	<head>
		<title></title>
	</head>
	<body>
		<c:url var="formAction" value="/orderedResult"/>
		<form method="GET" action="${formAction}">
			<h2>Enter Name</h2>
			
			<div>
				<label for="firstName">First Name</label>
				<input type="text" name="firstName" id="firstName">
			</div>
			
			<div>
				<label for="middle">Middle Initial</label>
				<input type="text" name="middle" id="middle">
			</div>
			
			<div>
				<label for="lastName">Last Name</label>
				<input type="text" name="lastName" id="lastName">
			</div>
			
			<h2>Choose Order</h2>
			
			<div>
				<input type="radio" name="order" value="FML"> First MI Last
			</div>
			
			<div>
				<input type="radio" name="order" value="FN"> First Name
			</div>
			
			<div>
				<input type="radio" name="order" value="LFM"> Last, First MI
			</div>
			
			<div>
				<input type="radio" name="order" value="LF"> Last, First
			</div>
			<input type="submit">
			
		</form>
	</body>
</html>