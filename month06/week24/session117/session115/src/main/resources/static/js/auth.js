const authForm = document.getElementById('auth-form');
const formTitle = document.getElementById('form-title');
const submitBtn = document.getElementById('submit-btn');
const toggleAuth = document.getElementById('toggle-auth');

let isLogin = true;

if (localStorage.getItem('jwt_token')) {
    window.location.href = '/notes.html';
}

authForm.addEventListener('submit', async (e) => {
    e.preventDefault();
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    const endPoint = isLogin ? '/api/auth/login' : '/api/auth/register'; // ternary operator

    try {
        const response = await fetch(endPoint, {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify({username, password})
        });

        if (response.ok) {
            if (isLogin) {
                const data = await response.json();
                localStorage.setItem('jwt_token', data.token);
                window.location.href = '/notes.html';
            } else {
                alert('Registration succesful! Please log in!');
                toggleAuth.click();
            }
        } else {
            alert('Authentication failed. Check your credentials');
        }

    } catch (error) {
        alert('Server error connecting to the API', error);
    }
})

toggleAuth.addEventListener('click', ()=> {
    isLogin = !isLogin;
    formTitle.textContent = isLogin ? 'Login': 'Register';
    submitBtn.textContent = isLogin ? 'Login': 'Register';
    toggleAuth.textContent = isLogin ? 'Need an account? Register' : 'Have an account? Login';
})