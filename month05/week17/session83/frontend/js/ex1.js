// ============================
// JavaScript - Дасгал Level 1: For Loop
// ============================

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

// for (initialization; condition; increment) {
//      // code block
// }
// intitialization: эхлэх утга (let i = 0)
// condition: үргэлжлэх нөхцөл (i < 10)
// increment: алхам (i++, i--, i += 2)

// =======================================
// JavaScript - Дасгал Level 1: While Loop
// =======================================

// ==============================
// Даалгавар 1: while loop basics
// ==============================

// 1. 1-ээс 5 хүртэл
let i = 1;
while (i <= 5) {
    console.log(i);
    i++;
}

// 2. 10-аас 1 хүртэл
let count = 10;
while (count >= 1) {
    console.log(count);
    count--;
}

// 3. Тоо 100-аас бага байх үед 2 дахин ихэсгэх
let num = 1;
while (num < 100) {
    console.log(num);
    num = num * 2;
}

// 4. Array iterate
let fruits2 = ["Apple", "Banana", "Orange"];
let index = 0;
while (index < fruits2.length) {
    console.log(fruits2[index]);
    index++;
}

// ============================
// Даалгавар 2: do...while loop
// ============================

// 1. 1-ээс 5 хүртэл
let a = 1;
do {
    console.log(a);
    a++;
} while (a <= 5);

// 2. Дор хаяж 1 удаа ажиллана
let num1 = 10;
do {
    console.log("Num:", num1);
    num1++;
} while (num1 < 5); // false боловч 1 удаа ажилласан

// 3. Тоо таах game simulation
let secretNumber = 7;
let guess = 0;
let attempts = 0;

do {
    guess = Math.floor(Math.random() * 10) + 1; // 1 - 10 random
    attempts++;
    console.log("Таалт:", guess);
} while (guess !== secretNumber);

console.log("Таалаа! " + attempts + " оролдлого");

// =========================
// Даалгавар 3: while vs for
// =========================

// Ижил үр дүн - өөр syntax

// FOR loop
for (let i = 0; i < 5; i++) {
    console.log(i);
}

// WHILE loop (ижил үр дүн)
let b = 0;
while (b < 5) {
    console.log(b);
    b++;
}

// Хэзээ while ашиглах?
// - Хэдэн удаа давтах нь тодорхойгүй үед
// - Нөхцөл нь биелтэл үргэлжлүүлэх үед

// Жишээ: String дотроос тэмдэгт олох
let text = "Hello World";
let pos = 0;
let count2 = 0;

while (pos < text.length) {
    if (text[pos] === 'o') {
        count2++;
    }
    pos++;
}
console.log("'o' тоо:", count2); // 2

// ========================================
// Даалгавар 4: Infinite loop-аас зайлсхийх
// ========================================

// ⚠️ АНХААРУУЛГА: Infinite loop браузерийг царцаана!

// ❌ БУРУУ - Infinite loop
// while (true) {
//     console.log("Forever...");
// }

// ✅ ЗӨВ - Гарах нөхцөлтэй
let count3 = 0;
while (true) {
    console.log(count3);
    count3++;

    if (count3 >= 5) {
        break; // Loop зогсоох
    }
}

// ✅ ЗӨВ - Хязгаартай
let attempts2 = 0;
let maxAttempts = 10;

while (attempts2 < maxAttempts) {
    console.log("Оролдлого:", attempts2 + 1);
    attempts2++;

    // Амжилттай бол гарах
    const randomNumber = Math.random();
    console.log('randomnumber :' , randomNumber);
    if (randomNumber > 0.8) {
        console.log("Амжилттай!");
        break;
    }
}

// ==========================
// Даалгавар 1: Switch basics
// ==========================

// Бөглөх

let day = 6;  // 1=Даваа, 2=Мягмар, ...

switch (day) {
    case 1:
        console.log("Даваа");
        break;
    case 2:
        console.log("Мягмар");
        break;
    case 3:
        console.log("Лхагва");
        break;
    case 4:
        console.log("Пүрэв");
        break;
    case 5:
        console.log("Баасан");
        break;
    default:
        console.log("Амралтын өдөр");
}

// Даалгавар 2: String switch

// Бөглөх

let fruit = "pineapple";
let color;

switch (fruit) {
    case "apple":
    case "cherry":  // Fall-through: ижил үр дүн
        color = "red";
        break;
    case "banana":
    case "pineapple":
        color = "yellow";
        break;
    case "grape":
        color = "purple";
        break;
    default:
        color = "unknown";
}

console.log(fruit + " is " + color);

// Даалгавар 3: Grade calculator

// Бөглөх

let score = 50;
let grade;

// Score-ийг 10-д хуваах (85 -> 8, 92 -> 9, etc.)
let scoreLevel = Math.floor(score / 10);

switch (scoreLevel) {
    case 10:
    case 9:
        grade = "A";
        break;
    case 8:
        grade = "B";
        break;
    case 7:
        grade = "C";
        break;
    case 6:
        grade = "D";
        break;
    case 5:
        grade = "F";
        break;
}

console.log("Score:", score, "Grade:", grade);

// Даалгавар 4: if...else vs switch

// Ижил logic - өөр syntax

let role = "admin";

// IF...ELSE хувилбар
if (role === "admin") {
    console.log("Full access");
} else if (role === "editor") {
    console.log("Edit access");
} else if (role === "viewer") {
    console.log("View only");
} else {
    console.log("No access");
}

// SWITCH хувилбар - бөглөх
switch (role) {
    case "admin":
        console.log("Full access");
        break;
    case "editor":
        console.log("Edit access");
        break;
    case "viewer":
        console.log("View only");
        break;
    default:
        console.log("No access");
}
