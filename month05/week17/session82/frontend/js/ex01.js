// Бөглөх
let age = 18;

// 1. Насанд хүрсэн эсэх шалгах
if (age >= 18) {
    console.log("Насанд хүрсэн.");
} else {
    console.log("Насанд хүрээгүй.");
}

// 2. Тэгш тоо эсэх
let number = 10;
if (number % 2 === 0) {
    console.log(number + " бол тэгш тоо.");
} else {
    console.log(number + " бол сондгой тоо.")
}

// 3. String хоосон эсэх
let userName = "Бат";
if (userName.length > 0) {
    console.log("Нэр: " + userName);
} else {
    console.log('');
}

// 4. Array элемент байгаа эсэх
let fruits = ["apple", "banana"];
if (fruits.length !== 0) {
    console.log("Жимс байна: " + fruits.length);
}

console.log('2' == 2); // true
console.log('2' === 2); // false
console.log(2 === 2); // true