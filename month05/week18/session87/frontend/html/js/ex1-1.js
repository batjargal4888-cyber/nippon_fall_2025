// select all color buttons & the display text
const buttons = document.querySelectorAll('button');
const currentColorText = document.getElementById('currentColor');

// add click event to each button
buttons.forEach(button => {
    button.addEventListener('click', function(e) {
        
        // get color value from data attribute
        const selectedColor = button.dataset.color;

        // get button text as color name
        const colorName = button.textContent;

        // change page background color
        document.body.style.backgroundColor = selectedColor;

        // update current background color text
        currentColorText.textContent = `Одоогийн өнгө: ${colorName}`;
    });
});