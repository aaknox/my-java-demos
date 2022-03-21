//Topic: DOM Manipulation -- DIY Exercise
//let listItems = document.getElementsByClassName('my-item');
//Q: So how do I change the background color for all the even-numbered items in my list?
//Solution 1
// for (let index = 0; index < listItems.length; index++) {
//     const element = listItems[index];

//     //if index is even, turn yellow; otherwise stay white
//     if(index % 2 == 0){
//         element.style.backgroundColor = "blue";
//     }
// }

//Solution 2
//let count = 0;
//DOM has tree-like structure to all HTML elements in the form of nodes
//console.log(listItems);

// for (let element of listItems) {
//     if(count % 2 == 0){
//         element.style.backgroundColor = "yellow";
//     }
//     count++;
// }

//Solution 3
//let's turn this into an array
// let count = 0;
// let listArr = Object.values(listItems);
// console.log(listArr);
// listArr.forEach(element => {
//     console.log(count);
//     if(count % 2 == 0){
//         element.style.backgroundColor = "red";
//     }
//     count++;
// });