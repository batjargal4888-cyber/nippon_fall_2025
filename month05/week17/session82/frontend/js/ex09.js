// ==========================================
// ДАСГАЛ 1: getElementById Practice
// ==========================================

// 1. main-title element-ийг авах
const title = document.getElementById("main-title");
console.log(title); // <h1>
console.log(title.textContent); // гарчиг

// 2. description element-ийг авах
const desc = document.getElementById("description");
console.log(desc.textContent);

// 3. counter element-ийн текстийг авах
const counter = document.getElementById("counter");
console.log("Counter value:", counter.textContent);

// 4. username input-ийн утгыг авах (input-д .value ашиглана)
const usernameInput = document.getElementById("username");
console.log("Username:", usernameInput.textContent);

// 5. submit-btn element байгаа эсэхийг шалгах
const btn = document.getElementById("submit-btn");
if (btn) {
    console.log("Button found:", btn.textContent);
} else {
    console.log("Button not found");
}

// 6. Байхгүй ID-г хайвал null буцана
const notExist = document.getElementById("not-exist");
console.log(notExist);  // Юу хэвлэх вэ? null
