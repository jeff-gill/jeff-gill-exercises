function sumDouble(x, y) {
    let sum = x + y;
    if (x === y) {
        sum *= 2;
    }
    return sum;
}

function hasTeen (x, y, z) {
    if((x >= 13 && x <= 19) || (y >= 13 && y <= 19) || (z >=13 && z <= 19)) {

return true;
}
return false;
}

function lastDigit (x, y){
    var xOnesOnly = String(x).substr(-1);
    var yOnesOnly = String(y).substr(-1);
    if(xOnesOnly == yOnesOnly)   { 
    return true;
    }
    return false
    }
   
function seeColor (x){
    var startRed = x.indexOf('red');
    var startBlue = x.indexOf('blue');
    if (startBlue == '0') {
    return 'blue';
}
    if (startRed == '0') {
        return 'red';
}
        return "";
}

function middleThree (x) {
    var middle = x.substring((x.length / 2) -1, (x.length / 2) +2);
    return middle;
}

function frontAgain (x) {
    var start = x.substring(x.length - x.length, x.length - (x.length -2));
    var end = x.substring(x.length - 2);

    if(start == end) {
        return true;
    }
        return false;

    }

function alarmClock (x, y) {
    let myArray = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday'];
    if ((x == 0 || x == 6) && y == true) {
        return myArray[x] + ' off';
    }
    if ((x == 0 || x == 6) && y == false) {
        return myArray[x] + ' 10:00';
    }
    if ((x > 0 || x < 6)  && y == true) {
        return myArray[x] + ' 10:00'; 
    }
    return myArray[x] + ' 7:00';
}
    
function makeMiddle (x) {
    if(x.length > 0 && x.length %2 == 0) {
    middle = x.slice((x.length/2)-1,(x.length/2)+1);

    return middle;
}
return [];
}

function oddOnly (x) {
    var myArray = x;

for (var i = 0; i < myArray.length; i++) {
    if ((myArray[i] % 2) == 0) {
        myArray.splice(i, 1);
        i = i-1;
    }
}
return myArray;
}

function weave () {
    var arr1 = [0, 1, 2];
    var arr2 = [3, 5, 7];
    var primes=[];
    var primes = arr1.concat(arr2);
}


function cigarParty (x, y) {
   
    if (x >= 40 && y == true) {
        return true;
    }
    if (x >= 40 && x <= 60 && y == false) {
        return true;
    } 
    return false;
}

// function stringSplosion (x) {

// }

function fizzBuzz (x) {
    if (x % 3 == 0  && x % 5 == 0) {
        return 'FizzBuzz';
    }
    if (x % 3 == 0) {
        return 'Fizz';
    }
    if (x % 5 == 0) {
    return 'Buzz';
    }
return x;
}

// function countValues (x) {

// }

//function reverseArray (x) {

// }

function blackJack (x, y) {
    if((21 - x) < 0 && (21 - y) < 0) {
        return 0;
    }
    if ((21 - y) < 0) {
        return x;
    }

    if ((21 - x) < 0) {
        return y;
    }
    if ((21 - x) < (21 - y)) {
    return x;
}
if ((21 - y) < (21 -x)) {
    return y;
}
return 0;
}