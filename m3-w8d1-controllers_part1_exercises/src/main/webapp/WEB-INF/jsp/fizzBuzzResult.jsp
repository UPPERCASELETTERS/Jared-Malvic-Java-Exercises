<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
	<head>
		<title></title>
	</head>
	<body>
	<h2>Fizz Buzz: Revisited</h2>
	Divisble by: <c:out value="${fizzBuzzed.divis1}"/><br>
	Divisble by: <c:out value="${fizzBuzzed.divis2}"/><br>
	Divisble by both: <c:out value="${fizzBuzzed.divis1}"/> and <c:out value="${fizzBuzzed.divis2}"/>
	<br><br>
	Alternative Fizz: <c:out value="${fizzBuzzed.fizz}"/><br>
	Alternative Buzz: <c:out value="${fizzBuzzed.buzz}"/><br>
	
	<c:out value="${fizzBuzzed.number1}"/>: <c:out value="${fizzBuzzed.viewNumber(fizzBuzzed.number1)}"/><br>
	<c:out value="${fizzBuzzed.number2}"/>: <c:out value="${fizzBuzzed.viewNumber(fizzBuzzed.number2)}"/><br>
	<c:out value="${fizzBuzzed.number3}"/>: <c:out value="${fizzBuzzed.viewNumber(fizzBuzzed.number3)}"/><br>
	<c:out value="${fizzBuzzed.number4}"/>: <c:out value="${fizzBuzzed.viewNumber(fizzBuzzed.number4)}"/><br>
	<c:out value="${fizzBuzzed.number5}"/>: <c:out value="${fizzBuzzed.viewNumber(fizzBuzzed.number5)}"/><br>