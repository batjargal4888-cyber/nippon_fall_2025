// DOM
const outputDiv = document.getElementById('output');
console.log(outputDiv);

// button сонгох гэхдээ querySelector ашиглах
const clickButton = document.querySelector('#input button');
console.log(clickButton);

clickButton.addEventListener('click', function(){
    console.log('button is clicked');
    // button дарагдах үед button is clicked
    // гэдэг text-харуулна уу. HTML дээр
    outputDiv.innerHTML = '<em>Button is clicked</em>';
    // innerHTML-ийн vs textContent
});

// callback

const hoverText = document.getElementById('hover-text');
const focusInput = document.getElementById('focus-input');

// hover хийхэд hover-text дээрх өнгө нь улаан болох ёстой

hoverText.addEventListener('mouseover', function(){
    hoverText.style.color = 'red';
});

hoverText.addEventListener('mouseleave', function(){
    hoverText.style.color = 'black';
});

focusInput.addEventListener('focus', function(){
    focusInput.classList.add('on-focus');
});

focusInput.addEventListener('blur', function(){
    focusInput.classList.remove('on-focus');
    
});