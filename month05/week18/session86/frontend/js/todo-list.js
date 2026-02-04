// 1. DOM Elements Selection
const todoInput = document.getElementById('todoInput');
const addBtn = document.getElementById('addBtn');
const todoList = document.getElementById('todoList');

// 2. Add Button Click Event
addBtn.addEventListener('click', () => {

    // 3. Get Input Value
    const taskText = todoInput.value;

    // 4. Empty Input Validation
    if (taskText === "") {
        alert ("Ажлын нэрээ оруулна уу!");
        return;
    }

    // 5. Create a New Todo Item Element
    const todoItem = document.createElement('div');
    todoItem.classList.add('todo-item');

    // 6. Insert Content Inside the Todo Item
    todoItem.innerHTML = `
        <span>${taskText}</span>
        <button class="delete-btn">Устгах</button>
        `;

    // 7. Add Todo Item to the List
    todoList.appendChild(todoItem);

    // 8. Clear the Input Field
    todoInput.value = "";

    // 9. Add Delete Functionality
    const deleteBtn = todoItem.querySelector('.delete-btn');
    deleteBtn.addEventListener('click', () => {
        todoItem.remove();
    });
});