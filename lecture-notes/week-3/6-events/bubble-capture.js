//event = something that the browser does or the user does
//ex. onclick, onchange, onload, onmouseover, etc.
//event propagation = the order at which events are triggered in the DOM
let parent1 = document.getElementById("parent-1");
let parent2 = document.getElementById("parent-2");
let child1 = document.getElementById("child-1");
let child2 = document.getElementById("child-2");

//this is an event listener (aka event handler)
//Event handlers can be used to manage the actions that occur during a given event

//by default, capturing is set to false on eventListeners
parent1.addEventListener('click', () => {
    console.log("I am the PARENT");
});

child1.addEventListener('click', () => {
    console.log("I am the CHILD");
});

//to change it to capturing, set to TRUE in eventlistener
parent2.addEventListener('click', () => {
    console.log("I am the PARENT");
}, true);

child2.addEventListener('click', () => {
    console.log("I am the CHILD");
}, true);

/*
In summary,
when bubbling,
if p clicked => only parent triggers
if strong clicked => child triggers then parent triggered
ex. bubbles rise up from the ocean floor to the surface

when capturing,
if p clicked => only parent triggers
if strong clicked => parent triggers first then child triggers
ex. throwing a mousetrap on top of a mouse that is eating cheese
*/