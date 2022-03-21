//1. Declaration of variables
var num = 10;
var str = "10";
var bool = false;
var nullData = null;
var undefinedData = "";
//Symbols allow us to create “hidden” properties of an object, that no other part of code can accidentally access or overwrite.
//aka encapsulation in JS
var id = Symbol("id");
var Person = {
    firstName: "John",
    lastName: "Doe",
    toDos: ["eat", "sleep", "work", "exercise"],
    sayHi: (fname) => {
        //example of string interpolation
        return `Hello ${fname}!`;
    },
    [id]: 123
};

//2. Display of our datatype to the user
let numEx = document.getElementById("num-ex");
let strEx = document.getElementById("str-ex");
let boolEx = document.getElementById("bool-ex");
let nullEx = document.getElementById("null-ex");
let undEx = document.getElementById("und-ex");
let objEx = document.getElementById("obj-ex");
let symEx = document.getElementById("sym-ex");

numEx.innerHTML = num;
strEx.innerHTML = str;
//boolEx.innerHTML = bool;
//nullEx.innerHTML = nullData; //nothing shows
//undEx.innerHTML = undefinedData; //nothing shows again

//objEx.innerHTML = Person; //shows [object Object]
//to show an object as a string, we must turn it into JSON
//javascript object notation
objEx.innerHTML = JSON.stringify(Person) + ', "sayHi()": ' + `"${Person.sayHi(Person.firstName)}"`;

//AK - show error first with this:
//symEx.innerHTML = id;
//AK - convert to string to remove error
//symEx.innerHTML = id.toString(); //shows Symbol(id)
//so how do we access our id that we save in Person object?
//symEx.innerHTML = id.description; //close but no
//symEx.innerHTML = Person.id; //closer -- shows undefined
symEx.innerHTML = Person[id];

//3. Any conditional logic
//example of a conditional statement in JS
//this statement is possibly because of the way JS handles truthy/falsey values
//truthy = 19, "hi", true, etc.
//falsey = false, 0, -0, "", null, undefined, NaN
if(boolEx){
    boolEx.innerHTML = "I am a true value :)";
} else{
    boolEx.innerHTML = "I am a false value :(";
}

if(!nullData){
    nullEx.innerHTML = "no value is home for this variable";
}

if(!undefinedData){
    undEx.innerHTML = "Sorry, I'm declared but not defined!";
}

//[END OF DEMO]