// Comparison operators ашиглах

let a = 10;
let b = "10";

// == vs ===
console.log(a == b);   // true (type conversion)
console.log(a === b);  // false (strict equality)

// != vs !==
console.log(a != b);   // false
console.log(a !== b);  // true

// Бөглөх - зөв operator сонгох
let price = 100;
let budget = 100;

// Яг тэнцүү эсэх (strict)
if (price === budget) {
    console.log("Яг таарч байна");
}

// Тэнцүү эсвэл бага
if (price <= budget) {
    console.log("Авах боломжтой");
}
