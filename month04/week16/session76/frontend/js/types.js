console.log('JS Types');


// String
let str1 = "Double quotes";
let str2 = 'Single quotes';
let str3 = `Templast literal`; // backtick

// Template literals
let lastName = "John";
let newAge = 25;
let greeting = `Hello,${lastName}! You are ${newAge} years old!`;
console.log(greeting); // Hello, John! You are 25 years old!

// Many line
let multiline = `
    Line 1
    Line 2
    Line 3
`;

// 2. Number (float, integer)
let intNumber = 42;
let floatNumber = 3.14;
let negativeNumber = -10;
let scientificNumber = 1.5e6; // 1,500,000
// Special values
let infinity = Infinity; // limitless
let negInfinity = -Infinity; // negative infinty
let notANumber = NaN;

console.log(10 / 0); // Infinity
console.log("abc" * 2); // NaN
console.log(isNaN("abc")); // true

// 3. Boolean - true/false
let isActive = true;
let isLoggedIn = false;

// Falsy values - (false gej tootsogddog)
// false, 0, "", null, undefined, NaN

// Truthy values (busad buh utga)
// true, 1, "hello", [], {}, etc.

// 4. null - hooson utga (intentional)
let emptyValue = null;
console.log(emptyValue);
console.log(typeof emptyValue); // object! (Javascript bug!)

// 5. undefined - todorhoilogdoogui
let notDefined;
console.log(notDefined);
console.log(typeof notDefined);
let obj = {};
console.log(obj.name); // underfined

// 6. symbol (ES6) - unique identifier
let sym1 = Symbol("id");
let sym2 = Symbol("id");
console.log(sym1 === sym2); //false

// 7. BigInt (ES2020) - Asar tom toonuud
let bigNumber = 9007199256750991n;
console.log(bigNumber);
let anotherBig = BigInt("12345678901234567890");
console.log(anotherBig);