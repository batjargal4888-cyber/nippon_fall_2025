// get modal elements 
const openBtn = document.getElementById('openModal');
const modal = document.getElementById('modal');
const closeBtn = document.getElementById('closeBtn');

// open modal on button click
openBtn.addEventListener('click', () => {
    modal.classList.add('active');
});

// close modal in button click
closeBtn.addEventListener('click', () => {
    modal.classList.remove('active');
});

// close modal when clicking outside content
modal.addEventListener('click', (e) => {
    console.log(e.target);
    if (e.target === modal) {
        modal.classList.remove('active');
    }
});

// close modal on ESC key press
document.addEventListener('keydown', (e) => {
    if (e.key === 'Escape') {
        modal.classList.remove('active');
    }
});