// Get elements
const countDisplay = document.getElementById('count');
const incrementBtn = document.getElementById('incrementBtn');
const decrementBtn = document.getElementById('decrementBtn');
const resetBtn = document.getElementById('resetBtn');

// Counter value
let count = 0;

// Update UI
function updateDisplay() {
    countDisplay.textContent = count;

    if (count > 0) {
        countDisplay.style.color = '#27ae60' // green
    } else if (count < 0) {
        countDisplay.style.color = '#e74c3c' // red
    } else {
        countDisplay.style.color = '#2c3e50' // default
    }
}

// Increment
incrementBtn.addEventListener('click', function () {
    count++;
    updateDisplay();
});

// Decrement
decrementBtn.addEventListener('click', function () {
    count--;
    updateDisplay();
});

// Reset
resetBtn.addEventListener('click', function () {
    count = 0;
    updateDisplay();
});