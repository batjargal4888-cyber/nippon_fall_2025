// for loop ashiglan render hiih

const numbers = [10, 5, 10, 5, 6, 7];

const forLoop = document.getElementById('for-loop');
const arrayLoop = document.getElementById('array-loop');

// 1. console deer buh toonuudiig daraalluulan hewlene uu

for (let i = 0; i < numbers.length; i++) {
    console.log(numbers[i]);
    renderBall(numbers[i], forLoop);
}

// 2. array forEach ashiglan toonuudiig DOM deer zurj haruulah

// 2.a forEach ashiglan array dotor baigaa buh elementuudiig hewleh

function test() {

}

const testArrow = () => {}

numbers.forEach((num) => {
    console.log(num);
});

// 2.b render ball

numbers.forEach((num) => {
    renderBall(num, arrayLoop);
});

function renderBall(num, parentElement) {
    const divElement = document.createElement('div');
    divElement.className = 'ball';
    divElement.textContent = num;
    parentElement.appendChild(divElement);
};