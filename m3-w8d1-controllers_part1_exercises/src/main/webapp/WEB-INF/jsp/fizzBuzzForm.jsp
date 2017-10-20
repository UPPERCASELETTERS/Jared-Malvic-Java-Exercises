<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
	<head>
		<title></title>
	</head>
	<body>
		<c:url var="formAction" value="/fizzBuzzResult"/>
		<form method="GET" action="${formAction}">
			<h2>Fizz Buzz: Revisited</h2>
			
			<div>
				<label for="divis1">Divisible By: </label>
				<input type="number" name="divis1" id="divis1">
			</div>
			
			<div>
				<label for="divis2">Divisible By: </label>
				<input type="number" name="divis2" id="divis2">
			</div>
			
			<div>
				<label for="fizz">Alternative Fizz: </label>
				<input type="text" name="fizz" id="fizz">
			</div>
			
			<div>
				<label for="buzz">Alternative Buzz: </label>
				<input type="text" name="buzz" id="buzz">
			</div>
			
			<br>
			
			<div>
				<label for="number1">Number 1</label>
				<input type="number" name="number1" id="number1">
			</div>
			
			<div>
				<label for="number2">Number 2</label>
				<input type="number" name="number2" id="number2">
			</div>
			
			<div>
				<label for="number3">Number 3</label>
				<input type="number" name="number3" id="number3">
			</div>
			
			<div>
				<label for="number4">Number 4</label>
				<input type="number" name="number4" id="number4">
			</div>
			
			<div>
				<label for="number5">Number 5</label>
				<input type="number" name="number5" id="number5">
			</div>
						
			<input type="submit">
			
		</form>
	</body>
</html>