function changeBlue(){
    let parent = document.getElementById("parent-1");
    setTimeout(()=>{
        console.log("Please wait....");
        parent.classList.add("color-bluegradient");
    }, 3000);
    console.log("Done: The background color is now changing to blue. ");
}

function changeGreen(){
    let parent = document.getElementById("parent-2");
    setTimeout(()=>{
        console.log("Please wait....");
        parent.classList.add("color-greengradient");
    }, 3000);
    console.log("Done: The background color is now changing to green. ");
}