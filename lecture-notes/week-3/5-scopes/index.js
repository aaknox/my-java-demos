//scopes of js:
//1. global = anywhere
//2. local = inside of something:
//  a. function = accessible within the function
//  b. lexical = a variable defined outside a function can be accessible inside another function defined after the variable declaration
//  c. block = inside of a conditional statement/expression

var name1 = "Bob"; //global scope
console.log(name1 + " is everywhere!");

//let name2 = "John"; //lexical scope variable

//sayHi function declaration hoisted here 
sayHi();

//block scope example
function sayHi(){
    /* Hoisting:
        when the variable/function is being used before it is even declared, 
        the interpreter will hoist - or move - to the top of the scope in which they are declared
    */
    //variable name3 declaration hoisted here
    //name3 = "Sammie"; //without this, name3 only exist within the if-block
    if(name3 === 'Sammie'){
        var name3 = "Samuel"; //changing to const will require an initialization at the point of declaration
        console.log("Hi, " + name3); //prints 'Hi, Samuel' bc of the block scope of name3
    }else{
        //in else block, name3 is undefined
        console.log(`Hello ` + name3); //shows undefined
    }
}

//lexical scope vs function scope example
//came with ES6
function eatLunch(){
    var name2 = "Joe"; //function scope variable
    console.log(name2 + " is eating a sandwich.");
}

//console.log(name2); //get a referenceError because this variable doesn't exist outside of eatLunch function

eatLunch(); //prints "Joe" with new let variable / prints "John" without new let variable