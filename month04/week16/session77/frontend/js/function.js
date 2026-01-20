console.log('js functions');
// public int add(int a, int b) {
//      return a + b;
// }

// function definition
function add(a, b) {
    return a + b;
}
const result = add(5, 6);
console.log(result);

// function multiplication
function multiplication(a, b) {
    return a * b;
}
const result2 = multiplication(5, 6);
console.log(result2);

// function subtraction
function subtraction(a, b) {
    return a - b;
}
const result3 = subtraction(5, 6);
console.log(result3);

// function division
function division(a, b) {
    return a / b;
}
const result4 = division(5, 6);
console.log(result4);

// function modulo - %
function modulo(a, b) {
    return a % b;
}
const result5 = modulo(5, 6);
console.log(result5);

// Ex
// TODO - Ex01 greet function
function greet(name) {
    return "Hello, " + name + "!";
}
// calling the function
let message = greet("Batja"); // Hello, Batja!
console.log(message);

// TODO - Ex02 calculate rectangle area function

function rectangleArea(a, b) {
    return a * b;
}
const result6 = rectangleArea(5, 6);
console.log(result6);

// TODO - Ex03 print the following texts
function createGreeting(name, age) {
    return "Hello, " + name + "!" + " You are " + age + " years old.";
}
const result7 = createGreeting("John", 25); // should return "Hello, John! You are 25 years old."
console.log(result7);

// TODO - Ex04 average gedeg function 30 toonii dundaj utgiig oldog bolgono uu.
function average(num1, num2, num3) {
    return (num1 + num2 + num3) / 3;
}
let result8 = average(10, 20, 30); // should return 20
console.log(result8);

// TODO = Ex05 
// Test:
function double(a) {
    return 2 * a;
}
console.log(double(5)); // should return 10
console.log(double(7)); // should return 14