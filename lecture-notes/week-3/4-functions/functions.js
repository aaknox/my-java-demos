var num1 = 5;
var num2 = "45";

//Functions allow us to have reusable code in JS
//ways to make functions
//1: function keyword
function add(n1, n2){
    var sum;
    //console.log(Number.isInteger(n1) === Number.isInteger(n2));
    //if both are numbers, do the straight math
    //== doesn't do type checking, while === does
    if(Number.isInteger(n1) === Number.isInteger(n2)){
        sum = n1 + n2;
    }else{
        //if at least one of them is a string; convert to num and add
        sum = parseInt(n1) + parseInt(n2);
        //console.log(sum);
    }
    return sum;
}

//2. anonymous function
var multiply = function(n1, n2){ return parseInt(n1) * parseInt(n2)};

//3. arrow functions
var square = (n) => {
    return n * n;
};

//4. callback functions
function alertFunc(n) { 
    //console.log(n); 
    alert (`Your answer is: ${n * 2}!`); 
};
function callbackFunc(number, callback){
    //here it calls another function
    callback(number);
    return number;
}

//5. closures
function complexCalc(n){
    var secretNumber = n;

    //example of a closure
    function crazyMath() {
        //NOTE: here, crazyMath still remembers the value of secretNumber, despite it moving scope levels
        console.log("Your secret number is: " + secretNumber);
        console.log(`Your secret math answer is: ${secretNumber * secretNumber - 1 + 14 / 9}`);
    }

    return crazyMath;
}

/* Functions can be invoked/called by:
    a. called in JS (1)
    b. automatically (aka self-invoking) (2 & 3)
    c. when an event occurs (to be shown later)
*/

//invocation of (1)
var results = add(num1, num2);
document.getElementById("example1").innerHTML = `Regular Function call: ${results}`; //shows 545 instead of 50

//invocation of (2)
document.getElementById("example2").innerHTML = `Anonymous Function call: ${multiply(5, 4)}`;

//invocation of (3)
document.getElementById("example3").innerHTML = `Arrow Function call: ${square(5)}`;

//invocation of (4)
document.getElementById("example4").innerHTML = `Callback Function call: ${callbackFunc(7, alertFunc)}`;

//invocation of (5)
let s = 24;
let myMath = complexCalc(s);
myMath(); //invocation here
//displaying what we used
document.getElementById("example5").innerHTML = `Closure call using: ${s}`;