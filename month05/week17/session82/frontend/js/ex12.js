// ==========================================
// ДАСГАЛ 4: Mixed Selection Methods
// ==========================================

// 1. app container авах - getElementById ашиглан
const app = document.getElementById("app");

// 2. Бүх todo items авах - querySelectorAll ашиглан
const allTodos = document.querySelectorAll(".todo-item");
console.log("Total todos:", allTodos.length);

// 3. Completed todos авах (.todo-item.completed)
const completedTodos = document.querySelectorAll(".todo-item.completed");
console.log("Completed:", completedTodos.length);

// 4. Incomplete todos авах (:not() pseudo-class)
const incompleteTodos = document.querySelectorAll(".todo-item:not(.completed)");
console.log("Incomplete:", incompleteTodos.length);

// 5. Stats div дотроос total span авах (nested selector)
const totalSpan = document.querySelector(".stats .total");
console.log(totalSpan.textContent);

// 6. getElementsByClassName ашиглах (HTMLCollection буцаана)
const todoItems = document.getElementsByClassName("todo-item");
console.log("Using getElementsByClassName:", todoItems.length);

// 7. Бүх todo текстүүдийг array-д хадгалах
const todoTexts = [];
allTodos.forEach(todo => {
    todoTexts.push(todo.textContent);
});
console.log(todoTexts);

// 8. filter ашиглан completed текстүүд авах
const completedTexts = Array.from(allTodos)
    .filter(todo => todo.classList.contains("completed"))
    .map(todo => todo.textContent);
console.log("Completed texts:", completedTexts);