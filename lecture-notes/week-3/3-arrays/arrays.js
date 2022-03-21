//1. Declarations of an array
let parentDiv = document.getElementById("example");
const dbzCharacters = ["Goku", "Vegata", "Piccolo", "Krillan", "Yamcha"];

//2. Accessing an element from an array
let ele = document.createElement('h2');
//by bracket notation
ele.innerHTML = `Accessing an element from array: ${dbzCharacters[1]}`;
parentDiv.append(ele);

let line = document.createElement("hr");
parentDiv.append(line);

//3. Iterating through an array
let header = document.createElement("h2");
header.innerHTML = "Full DBZ Character List:"
parentDiv.append(header);

let ele2 = document.createElement('div');

//Solution 1 - For loop
// for (let i = 0; i < dbzCharacters.length; i++) {
//     var target = document.createElement("p");
//     target.innerHTML = dbzCharacters[i];
//     ele2.append(target);
// }

//Solution 2 - Foreach loop
dbzCharacters.forEach(element => {
    var target = document.createElement("p");
    //NOTE: you don't have access to the index number when using foreach loop
    target.innerHTML = element;
    ele2.append(target);
});

parentDiv.append(ele2);