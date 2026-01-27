// ==========================================
// ДАСГАЛ 3: querySelectorAll Practice
// ==========================================
// Дээрх HTML ашиглана

// 1. Бүх nav-link elements авах
const allLinks = document.querySelectorAll('.nav-link');
console.log("Link count:", allLinks.length);

// 2. forEach ашиглан бүх link-ийн текст хэвлэх
allLinks.forEach(link => {
    console.log(link.textContent);
});

// 3. Бүх article elements авах
const articles = document.querySelectorAll('article');
console.log("Article count:", articles.length);

// 4. Бүх h2 elements авах, index-тэй хэвлэх
const headings = document.querySelectorAll('h2');
headings.forEach((h, index) => {
    console.log(`Heading ${index + 1}: ${h.textContent}`);
});

// 5. Бүх .post-content elements авах
const contents = document.querySelectorAll('.post-content');

// 6. Index-ээр хандах
console.log("First content:", contents[0].textContent);
console.log("Second content:", contents[1].textContent);

// 7. Array болгох (Array.from)
const contentsArray = Array.from(contents);
const texts = contentsArray.map(el => el.textContent);
console.log(texts);

// 8. Multiple selectors (h1, h2)
const allHeadings = document.querySelectorAll('h1, h2');
console.log("All headings:", allHeadings.length);