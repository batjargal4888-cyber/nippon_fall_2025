// ==========================================
// ДАСГАЛ 2: querySelector Practice
// ==========================================

// 1. ID-аар сонгох (# ашиглана)
const footer = document.querySelector("#footer");
console.log(footer);

// 2. Class-аар эхний element сонгох (. ашиглана)
const header = document.querySelector(".header");
console.log(header);

// 3. Эхний nav-link сонгох
const firstLink = document.querySelector(".nav-link");
console.log(firstLink.textContent);

// 4. active class-тай nav-link сонгох (.nav-link.active)
const activeLink = document.querySelector(".nav-link.active");
console.log("Active link:", activeLink.textContent);

// 5. featured class-тай post сонгох (.post.featured)
const featuredPost = document.querySelector(".post.featured");
console.log(featuredPost);

// 6. Nested element сонгох (nav доторх эхний a)
const navLink = document.querySelector(".nav a");
console.log(navLink);

// 7. Attribute selector - href="#" байгаа link
const homeLink = document.querySelector("a[href='#']");
console.log(homeLink);

// 8. Combined selector - .post доторх .post-title
const postTitle = document.querySelector(".post .post-title");
console.log(postTitle.textContent);

// 9. Pseudo-class - эхний child
const firstArticle = document.querySelector("article:first-child");
console.log(firstArticle);
