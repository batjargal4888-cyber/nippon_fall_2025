// Бөглөх - && ашиглах

let age = 25;
let hasLicense = true;

// 1. Машин жолоодох эрхтэй эсэх
if (age >= 18 && hasLicense) {
    console.log("Машин жолоодож болно");
}

// 2. Хямдрал авах (VIP + 100,000₮-ээс дээш)
let isVIP = true;
let purchaseAmount = 150000;

if (isVIP && purchaseAmount > 100000) {
    console.log("10% хямдрал авлаа!");
}

// 3. Нэвтрэх (username + password зөв)
let username = "admin";
let password = "1234";

if (username === "admin" && password === "1234") {
    console.log("Нэвтэрлээ!");
}

// 4. Насны хязгаар (18-65)
let userAge = 30;
if (userAge >= 18 && userAge <= 65) {
    console.log("Ажилд орох насанд байна");
}
