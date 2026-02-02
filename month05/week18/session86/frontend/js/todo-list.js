console.log('JS file loaded');

// 1. Get elements from the DOM
const todoInput = document.getElementById('todoInput');
const addBtn = document.getElementById('addBtn');
const todoList = document.getElementById('todoList');

// 2. Function to add a new todo
function addTodo() {
    const text = todoInput.value.trim(); // remove extra spaces

    // 3. Validation: empty input
    if (text === '') {
        alert('Ажил оруулна уу');
        return;
    }

    // 4. Create todo item container
    const todoItem = document.createElement('div');
    todoItem.className = 'todo-item';

    // 5. Create text span
    const todoText = document.createElement('span');
    todoText.textContent = text;

    // 6. Create delete button
    const deleteBtn = document.createElement('button');
    deleteBtn.className = 'delete-btn';
    deleteBtn.textContent = 'Устгах';

    // 7. Delete event
    deleteBtn.addEventListener('click', function () {
        todoList.removeChild(todoItem);
    });

    // 8. Append elements
    todoItem.appendChild(span);
    todoItem.appendChild(deleteBtn);
    todoItem.appendChild(todoItem);

    // 9. Clear input
    todoInput.value = '';
}

// 10. Click event
addBtn.addEventListener('click', addTodo);

// 11. Enter key event
todoInput.addEventListener('keydown', function (e) {
    if (e.key === 'Enter') {
        addTodo();
    }
});