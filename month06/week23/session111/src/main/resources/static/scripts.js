document.addEventListener('DOMContentLoaded', () => {
    loadCategories();
    loadTasks();
})

async function loadCategories() {
    const response = await fetch('/api/categories');
    const categories = await response.json();

    const select = document.getElementById('category-selector');
    select.innerHTML = '';

    categories.forEach(cat => {
        const option = document.createElement('option');
        option.value = cat.id;
        option.textContent = cat.name;
        select.appendChild(option);
    });
}

async function loadTasks() {
    const response = await fetch('/api/tasks');
    const tasks = await response.json();

    const list = document.getElementById('task-list');
    list.innerHTML = tasks.map(t => `
            <li>
                ${t.description}
                <span class="badge">
                    ${t.category ? t.category.name : 'None'}
                </span>
            </li>
        `).join('');
}

async function saveCategory() {
    const name = document.getElementById('cat-name').value;
    if (!name.trim()) {
        return alert('Please enter a category name.');
    }

    await fetch('/api/categories', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({name})
    });

    document.getElementById('cat-name').value = '';
    loadCategories();
}

async function saveTask() {
    const description = document.getElementById('task-desc').value;
    const categoryId = document.getElementById('category-selector').value;
    if (!description.trim) {
        return alert('Please enter a task description');
    }
    await fetch('/api/tasks', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({description, categoryId})
    });
    document.getElementById('task-desc').value = '';
    loadTasks();
}