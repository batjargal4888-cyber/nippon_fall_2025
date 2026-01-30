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

// HTML: <div id="box" class="box">Box</div>
// CSS: .highlight { background: yellow; }
//      .active { border: 2px solid blue; }
//      .hidden { display: none; }

const box = document.getElementById("box");

// 1. Inline style-аар background color тавих
box.style.backgroundColor = "red";

// 2. Font size өөрчлөх (camelCase!)
box.style.fontSize = "20px";

// 3. Border тавих
box.style.border = "2px solid black";

// 4. highlight class нэмэх
box.classList.add("highlight");

// 5. active class toggle хийх
box.classList.toggle("active");

if (box.classList.contains("active")) {
    console.log("Is active");
} else {
    console.log("Not active");
}

// 6. box class байгаа эсэхийг шалгах
if (box.classList.contains("box")) {
    console.log("Has box class");
}

// 7. highlight-г active-аар солих
box.classList.replace("highlight", "active");

// 8. Олон class нэг дор нэмэх
box.classList.add("hidden", "active");

// =================================
// Бөглөх дасгал - Creating Elements
// =================================

// HTML: <ul id="todo-list"></ul>
//       <div id="cards"></div>

const todoList = document.getElementById("todo-list");
const cards = document.getElementById("cards");

// 1. Шинэ li element үүсгэх
const li = document.createElement("li");
console.log(li);

// 2. li-д текст оруулах
li.textContent = "New task";

// 3. li-д class нэмэх
li.className = "todo-item";

// 4. todoList-ийн төгсгөлд нэмэх
todoList.appendChild(li);

// 5. Шинэ li үүсгээд эхэнд нэмэх
const firstLi = document.createElement("li");
firstLi.textContent = "First task";
todoList.prepend(firstLi);

// 6. Card div үүсгэх
const card2 = document.createElement("div");
card2.className = "card";
card2.innerHTML = `
    <h3>Card Title</h3>
    <p>Card content</p>
`;
console.log(card2);

// 7. cards div-д нэмэх
cards.appendChild(card2);

// 8. Delete button үүсгээд card-д нэмэх
const deleteBtn = document.createElement("button");
deleteBtn.textContent = "Delete";
deleteBtn.onclick = function() {
    card2.remove    ();  // Card2-г устгах
};
card2.appendChild(deleteBtn);

// 9. insertAdjacentHTML ашиглан HTML нэмэх
todoList.insertAdjacentHTML("beforeend", "<li>Last item</li>");

// ================================
// 📝 Бөглөх дасгал - Todo Function
// ================================

// Card үүсгэх функц бичих
function createCard(title, content) {
    // 1. Card div үүсгэх
    const card = document.createElement("div");
    card.className = "card";

    // 2. Title h3 үүсгэх
    const h3 = document.createElement("h3");
    h3.textContent = title;

    // 3. Content p үүсгэх
    const p = document.createElement("p");
    p.textContent = content;

    // 4. Delete button үүсгэх
    const btn = document.createElement("button");
    btn.textContent = "Delete";
    btn.onclick = () => card.remove();

    // 5. Бүгдийг card-д нэмэх
    card.appendChild(h3);
    card.appendChild(p);
    card.appendChild(btn);

    // 6. Card буцаах
    return card;
}

// Ашиглах
const container = document.getElementById("container");
const card1 = createCard("Title 1", "Content 1");
container.appendChild(card1);
