// ==================
// Document Properties
// ==================

// Document бүхэлдээ
console.log(document);

// HTML document title
console.log(document.title); // DOM Demo

// <body> element
console.log(document.body); // <body>...</body>

// <head> element 
console.log(document.head); // <head>...<head>

// <html> element (root)
console.log(document.documentElement); // <html>...<html>

// URL мэдээлэл
console.log(document.URL); // "http://localhost:300/index.html"
console.log(document.domain); // "localhost"

// Document object-ийн properties

// 1. HTML title-г авах
const pageTitle = document.title;
console.log(pageTitle);

// 2. Body element-г авах
const bodyElement = document.body;
console.log(bodyElement);

// 3. Head element-г авах
const headElement = document.head;
console.log(headElement);

// 4. Root HTML element-г авах
const htmlElement = document.documentElement;
console.log(htmlElement);

// ==================
// getElementById
// ==================

// ID-аар element олох
const title = document.getElementById("title");
console.log(title); // <h1 id="title">...</h1>
console.log(title.textContent); // Sain baina uu!

// ID-аар list олох
const list = document.getElementById("list");
console.log(list); // <ul id="list">...</ul>

// Олдоогүй бол null
const notFound = document.getElementById("nonexistent");
console.log(notFound); // null

// Null check хийх
if (title) {
    console.log("Element олдлоо!");
} else {
    console.log("Element олдсонгүй.")
}

// HTML: <h1 id="main-title">Welcome</h1>
//       <div id="content">Content here</div>
//       <button id="submit-btn">Submit</button>

// 1. main-title id-тай element-г олох
const titleEl = document.getElementById("main-title");

// 2. content id-тай element-г олох
const contentEl = document.getElementById("")

// getElementsByClassName => array = []
const messages = document.getElementsByClassName('message');
console.log(messages); // HTMLCollection [p, p]
console.log(messages.length); // 2

console.log(messages[0]);
console.log(messages[1]);

// container gedeg class dotorh elementiig haruulna uu
const container = document.getElementsByClassName("container");
console.log(container[0]);

// getElementsByTagName => array = []

// how many ul, li, div, span, p, h1
console.log(document.getElementsByTagName('ul').length); // 2
console.log(document.getElementsByTagName('li').length); // 3
console.log(document.getElementsByTagName('div').length); // 1
console.log(document.getElementsByTagName('span').length); // 1
console.log(document.getElementsByTagName('p').length); // 2
console.log(document.getElementsByTagName('h1').length); // 1

// query selector

const ulElement = document.querySelector('ul'); // ul
console.log(ulElement);

const queryMessagesOne = document.querySelector('.message');
console.log(queryMessagesOne);
const queryMessages = document.querySelectorAll('.message');
console.log(queryMessages);

// li-iin ehnii elemented ymar text baigaag console deer hewlene uu
// result: 1 hint: textContent ashiglah
const queryM = document.querySelector('li');
console.log(queryM.textContent);

const queryMe = document.querySelectorAll('li');
console.log(queryMe[0].textContent + ', ' + queryMe[1].textContent + ', ' + queryMe[2].textContent);

for (let i = 0; i < queryMe.length; i++) {
    if (i === 1) {
        continue;
    }
    console.log(i + 1 + ". " + queryMe[i].textContent);
}

// for each loop
Array.from(queryMe).forEach(queryMe => {
    console.log(queryMe.textContent);
});