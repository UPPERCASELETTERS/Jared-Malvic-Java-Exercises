/// <reference path="../jquery-3.1.1.js" />
//Locate all <div> elements and add the 'president' class.
function presentialDivs() {
	$('div#presidents > div').addClass('president');
}

//Locate George Washington and add the 'founding-father' class
function georgeWashington() {
	$('div#george-washington').addClass('founding-father');
}

//Locate all Republican presidents and add the 'red' class.
function republicanPresidents() {
	$('div.Republican').addClass('red');

}

//Locate all Democrat presidents and add the 'blue' class.
function democratPresidents() {
	$('div.Democratic').addClass('blue');

}

//Locate all Federalist presidents and add the 'gold' class.
function otherPresidents() {
	$('div#presidents > div').not('div.Republican, div.Democratic').addClass('gold');

}

//Locate all presidents named 'James' and add the 'james' class.
function presidentsNamedJames() {
	$('h3:contains("James")').addClass('james');

}

//Locate each president serving at the beginning of each century and add the 'beginningOfCentury' class.
function turnOfTheCenturyPresidents() {
	$('h2 + div').addClass('beginningOfCentury');
}

//Locate each president serving at the end of the century and add the 'endOfCentury' class.
function endOfTheCenturyPresidents() {
	$('h2').prev().addClass('endOfCentury');
	$('div#presidents div').last().addClass('endOfCentury');

}

//Locate all presidents serving in the 1900s who appear on currency and add the 'appearOnCurrency' class.
function currencyPresidents() {
	$('h2').slice(2,3).addClass('1900');
	$('h2[class="1900"]~div.currency').addClass('appearOnCurrency')
	$('h2.1900').removeClass('1900');
}