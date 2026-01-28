// ============================
// Даалгавар 1: Энгийн for loop
// ============================

// 1. 1 - 5 print
for (let i = 1; i <= 5; i++) {
    console.log(i);
}
// output: 1, 2, 3, 4, 5

// 2. 0 - 10 plus by 2
for (let i = 0; i <= 10; i += 2) {
    console.log(i);
}
// output: 0, 2, 4, 6, 8, 10

// 3. 10 - 1 descend
for (let i = 10; i >= 1; i--) {
    console.log(i);
}
// output: 10, 9, 8, 7, 6, 5, 4, 3, 2, 1

// 4. 5x hello print
for (let i = 1; i <= 5; i++) {
    console.log("Hello");
}
// output: (5) Hello

// ===============================
// Даалгавар 2: Array iterate хийх
// ===============================

let fruits = ["Apple", "Banana", "Orange", "Mango"];

// 1. print all elements
for (let i = 0; i < fruits.length; i++) {
    console.log(fruits[i]);
}
// output: Apple, Banana, Orange, Mango

// 2. print with index
for (let i = 0; i < fruits.length; i++) {
    console.log(i + ": " + fruits[i]);
}
// output: 0: Apple, 1: Banana, 2: Orange, 3: mango (index always starts from 0)

// 3. the opposite direction
for (let i = fruits.length - 1; i >= 0; i--) {
    console.log(fruits[i]);
}

// 4. sum of numbers
let numbers = [10, 20, 30, 40, 50];
let sum = 0;

for (let i = 0; i < numbers.length; i++) {
    sum += numbers[i];
}
console.log("Нийлбэр:", sum); // 150

// ==========================
// Даалгавар 3: break ашиглах
// ==========================

let numbers2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

// 1. Эхний тэгш тоо олоод зогсох
for (let i = 0; i < numbers2.length; i++) {
    if (numbers2[i] % 2 === 0) {
        console.log("Эхний тэгш тоо:", numbers2[i]);
        break;
    }
}

// 2. 5-ыг олоод зогсох
for (let i = 0; i < numbers2.length; i++) {
    if (numbers2[i] === 5) {
        console.log("5 олдлоо! Index:", i);
        break;
    }
}

// 3. Хайлт хийх
let names = ["Бат", "Болд", "Сүх", "Дорж"];
let searchName = "Сүх";
let found = false;

for (let i = 0; i < names.length; i++) {
    if (names[i] === searchName) {
        found = true;
        console.log(searchName + " олдлоо! Index: " + i);
        break;
    }
}

if (!found) {
    console.log("Олдсонгүй");
}

// =============================
// Даалгавар 4: continue ашиглах
// =============================

let numbers3 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

// 1. Зөвхөн тэгш тоонуудыг хэвлэх
for (let i = 0; i < numbers3.length; i++) {
    if (numbers3[i] % 2 !== 0) {
        continue;
    }
    console.log(numbers3[i]);
}

// 2. 5-ыг алгасах
for (let i = 0; i < numbers3.length; i++) {
    if (numbers3[i] === 5) {
        continue;
    }
    console.log(numbers3[i]);
}

// 3. Сөрөг тоонуудыг алгасах
let mixed = [1, -2, 3, -4, 5, -6];
let positiveSum = 0;

for (let i = 0; i < mixed.length; i++) {
    if (mixed[i] < 0) {
        continue;
    }
    positiveSum += mixed[i];
}
console.log("Эерэг тоонуудын нийлбэр:", positiveSum); // 9