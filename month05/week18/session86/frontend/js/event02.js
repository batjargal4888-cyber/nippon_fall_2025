// 

const buttons = document.querySelectorAll(".button-group button");
console.log(buttons);
const result = document.getElementById("result");

const firstButton = buttons[0];
const secondButton = buttons[1];
const thirdButton = buttons[2];
const fourthButton = buttons[3];

// firstButton.addEventListener('click', function(){
//     alert('first button clicked');
// });

buttons.forEach((button) => {
    button.addEventListener('click', function(e){
        // console.log(e.target); // <button>
        console.log(`button ${e.target.textContent} is clicked`);   
    });
});