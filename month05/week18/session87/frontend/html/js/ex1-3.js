// get form elements
const form = document.getElementById('registrationForm');
const nameInput = document.getElementById('name');
const emailInput = document.getElementById('email');
const passwordInput = document.getElementById('password');

// get message elements
const nameError = document.getElementById('nameError');
const emailError = document.getElementById('emailError');
const passwordError = document.getElementById('passwordError');

// name check
nameInput.addEventListener('input', () => {
    if (nameInput.value.length >= 3) {
        nameError.style.display = 'none';
    } else {
        nameError.style.display = 'block';
    }
});

// email check
emailInput.addEventListener('input', () => {
    if (emailInput.value.includes('@')) {
        emailError.style.display = 'none';
    } else {
        emailError.style.display = 'block';
    }
});

// password check
passwordInput.addEventListener('input', () => {
    if (passwordInput.value.length >= 8) {
        passwordError.style.display = 'none';
    } else {
        passwordError.style.display = 'block';
    }
});

// submit check
form.addEventListener('submit', (e) => {
    e.preventDefault();

    if (
        nameInput.value.length >= 3 &&
        emailInput.value.includes('@') &&
        passwordInput.value.length >= 8
    ) {
        successMessage.style.display = 'block';
        form.reset();
    }
});