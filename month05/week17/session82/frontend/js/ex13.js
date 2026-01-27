// ==========================================
// ДАСГАЛ 5: DOM Navigation
// ==========================================

const parent = document.getElementById("parent");

// 1. Children (HTMLCollection)
console.log(parent.children);        // HTMLCollection of <p> elements
console.log(parent.children.length);  // 3

// 2. First child element
console.log(parent.firstElementChild);  // <p>First child</p>

// 3. Last child element
console.log(parent.lastElementChild);  // <p>Third child</p>

// 4. childNodes - бүх node (text nodes орно)
console.log(parent.childNodes);

// // 5. Parent element олох
// const firstP = document.querySelector("#parent p");
// console.log(firstP.____);  // <div id="parent">

// // 6. Siblings олох
// const secondP = parent.children[1];  // Хоёр дахь <p>
// console.log("Previous:", secondP.____);  // First child
// console.log("Next:", secondP.____);  // Third child

// // 7. closest() - ancestor олох
// const p = document.querySelector("p");
// console.log(p.____(____));  // <div id="parent">
// console.log(p.closest("div"));  // <div id="parent">

// // 8. Children array болгох
// const childArray = ____.from(parent.children);
// childArray.forEach((child, index) => {
//     console.log(`Child ${index + 1}: ${child.textContent}`);
// });
