function sumDouble (x, y) {
    if(x === y) {
        return 2 * (x + y);
    } else {
        return x + y;
    }
}

function hasTeen (num1, num2, num3) {
    var num1;
    var num2;
    var num3; 

    if (num1 >= 13 && num1 <= 19) {
    return true;
    }
    if (num2 >= 13 && num2 <= 19) {
    return true;
    }
    if (num3 >= 13 && num3 <= 19) {
    return true;
    }
    return false;
}

function lastDigit (num1, num2) {
    var num1 = new String(num1);
    var num2 = new String(num2);
    
    if (num1.substring(num1.length-1) == num2.substring(num2.length-1)) {
    return true;
    }
    return false;
}

function seeColor (string1) {
    var string1;

    if(string1.substring(0,3) == "red") {
        return "red";
    } else if (string1.substring(0,4) == "blue") {
        return "blue";
    } else {
        return "";
    }
}

function middleThree (string1) {
    var string1;

    if(string1.length == 3) {
        return string1;
    } else {
        return string1.substring((string1.length / 2)-1, (string1.length / 2)+2);
    }
} 

function frontAgain (string1) {
    var string1;

     if(string1.length == 2) {
        return true;
     } else if (string1.substring(0,2) == string1.substring(string1.length-2)) {
         return true;
     } else {
         return false;
     }
}

function alarmClock (day, vacation) {
    var day;
    var vacation;

    if((day == 0 || day == 7) && vacation) {
        return "off";
    }
    if((day != 0 || day != 7) && vacation) {
        return "10:00";
    }
    if((day == 0 || day == 7) && !vacation) {
        return "10:00";
    }
    if((day != 0 || day != 7) && !vacation) {
        return "7:00";
    }
}

function makeMiddle (numbers) {
    var numbers;
    var newNumbers = [];

    if(numbers.length <=1 || numbers.length % 2 == 1){
        return [];
    }

    newNumbers[0] = numbers[numbers.length/2-1];
    newNumbers[1] = numbers[numbers.length/2];

    return newNumbers;
}

function oddOnly (numbers) {
    var numbers;
    var odds = [];

    for (num of numbers) {
        if (num % 2 == 1) {
            odds.push(num);
        }
    }
    return odds;
}

function weave (first, second) {
    var first;
    var second;
    var largest;
    var numbers = [];

    if (first.length >= second.length) {
        largest = first.length;
    } else {
        largest = second.length;
    }

    for (i=0; i<largest; i++) {
        if (!isNaN(first[i])) {
            numbers.push(first[i]);
        }
        if (!isNaN(second[i])) {
            numbers.push(second[i]);
        }
    }
    return numbers;
}

function cigarParty (cigars, weekend) {
    if (cigars >= 40 && weekend){
        return true;
    } else if (cigars >= 40 && cigars <= 60 && !weekend){
        return true;
    } else {
        return false;
    }
}

function stringSplosion (string1) {
    var string1;
    var stop = string1.length;
    var final = "";

    for(i=1; i<=stop; i++) {
        final = final + string1.substring(0, i);
    }
    return final;
}

function fizzBuzz (number) {
    var number;

    if (number % 15 == 0) {
        return "FizzBuzz";
    } else if (number % 5 == 0) {
        return "Buzz";
    } else if (number % 3 == 0) {
        return "Fizz";
    } else {
        return number;
    }
}

function countValues (number) {
    var number;
    var count = {};

    for (i=0; i < number.length; i++) {
        if (count[number[i]] === undefined) {
            count[number[i]] = 0;
        }
        count[number[i]]++;
    }
     return count;
}

function reverseArray (numbers) {
    var numbers;
    var newNumbers = [];

    while (numbers.length >=1) {
    newNumbers.push(numbers.pop());
    }
    return newNumbers;
}

function blackJack (first, second) {
    var first;
    var second;

    if (first > second && first <=21) {
        return first;
    } else if (second > first && second <=21) {
        return second;
    } else if (first > 21 && second > 21) {
        return 0;
    } else if (second > 21) {
        return first;
    } else {
        second;
    }
}