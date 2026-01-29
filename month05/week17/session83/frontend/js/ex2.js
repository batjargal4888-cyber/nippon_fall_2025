// ==================
// Element Content
// ==================

const content = document.getElementById("content");

// textContent - бүх текст (HTML tag-гүй)
console.log(content.textContent); // "Some bold text"
content.textContent = "New plain text";

// innerHTML - HTML-тэй
console.log(content.innerHTML); // "Some <strong>bold</strong> text"
content.innerHTML = "New <em>italic</em> text";

// innerText - visible text only
console.log(content.innerText);

// 📝 Бөглөх дасгал - Element Content

// HTML: <div id="output">Hello <span>World</span></div>

const output = document.getElementById("output");

// 1. textContent ашиглан текст авах
const text = output.textContent;
console.log(text);  // "Hello World"

// 2. innerHTML ашиглан HTML авах
const html = output.innerHTML;
console.log(html);  // "Hello <span>World</span>"

// 3. textContent-ээр шинэ текст тавих (HTML escape хийгдэнэ)
output.textContent = "New <b>text</b>";
// Үр дүн: "New <b>text</b>" (tag харагдана)

// 4. innerHTML-ээр HTML тавих (render хийгдэнэ)
output.innerHTML = "New <b>text</b>";
// Үр дүн: "New text" (bold харагдана)

// 5. Input элементийн утга авах
// <input type="text" id="name" value="John">
const input = document.getElementById("name");
const inputValue = input.value;  // "John"
console.log(inputValue);

// 6. Input-д шинэ утга тавих
input.value = "Jane";
console.log(input.value);

// =======================
// JavaScript - Attributes
// =======================

// ==================
// Element Attributes
// ==================

const link = document.getElementById("link");

// getAttribute / setAttribute
console.log(link.getAttribute("href")); // "https://example.com"
link.setAttribute("href", "https://google.com");
link.setAttribute("data-id", "123");

// removeAttribute
link.removeAttribute("target");

// hasAttribute
if (link.hasAttribute("href")) {
    console.log("Link has href attribute");
}

// Direct properties
console.log(link.href); // full URL
console.log(link.id);   // "link"

// Image src
const img = document.getElementById("image");
img.src = "new-photo.jpg";
img.alt = "New Photo";

// Data attributes
// <div id="user" data-user-id="123" data-user-name="John">
const user = document.getElementById("user");
console.log(user.dataset.userId);   // "123"
console.log(user.dataset.userName); // "John"
user.dataset.role = "admin";        // data-role="admin" нэмэгдэнэ
console.log(user.dataset);

// =============================
// 📝 Бөглөх дасгал - Attributes
// =============================

// HTML: <a id="myLink" href="https://old.com" target="_blank">Click</a>
//       <img id="myImg" src="old.jpg" alt="Old image">
//       <div id="card" data-product-id="456" data-category="electronics">

const link2 = document.getElementById("myLink");
const img2 = document.getElementById("myImg");
const card = document.getElementById("card");

// 1. link-ийн href attribute унших
const href = link2.getAttribute("href");
console.log(href);

// 2. link-ийн href-г шинэчлэх
link2.setAttribute("href", "https://new.com");

// 3. link-ийн target attribute устгах
link2.removeAttribute("target");

// 4. img-ийн src шууд property-ээр өөрчлөх
img2.src = "new.jpg";
img2.alt = "New image";

// 5. data attribute унших
const productId = card.dataset.productId;  // "456"
const category = card.dataset.category;   // "electronics"

// 6. Шинэ data attribute нэмэх (data-price="1000")
card.dataset.price = "1000";

// 7. hasAttribute ашиглан шалгах
if (link.hasAttribute("href")) {
    console.log("Link has href");
}

// ===================
// JavaScript - Styles
// ===================

// ==================
// Element Styles
// ==================

const title = document.getElementById("title");

// Inline style (style property)
title.style.color = "red";
title.style.fontSize = "24px";
title.style.backgroundColor = "lightblue";

// Multiple styles with Object.assign
Object.assign(title.style, {
    color: "white",
    backgroundColor: "black",
    padding: "10px"
});

// classList - class удирдах
title.classList.add("highlight");
title.classList.add("bold");
title.classList.remove("highlight");
// title.classList.toggle("hidden"); // байвал хасна, байхгүй бол нэмнэ

console.log(title.classList.contains("bold")); // true

// Replace class
title.classList.replace("bold", "highlight");

// Multiple classes нэг дор
title.classList.add("class1", "class2", "class3");
title.classList.remove("class1", "class2");
