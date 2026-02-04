const textInput = document.getElementById('textInput');
const charCount = document.getElementById('charCount');
const counter = document.querySelector('.counter');
const MAX_LENGTH = 200; // togtmol too

textInput.addEventListener('input', function () {
    const length = textInput.value.length;

    // too shinchleh
    charCount.textContent = length;

    // 200 temdegt dawahad taslah
    if (length > MAX_LENGTH) {
        console.log(textInput.value);
        textInput.value = textInput.value.substring(0, MAX_LENGTH);
        charCount.textContent = MAX_LENGTH;
        return;
    }

    // ungu solih
    counter.className = "counter";
    if (length >= MAX_LENGTH) {
        counter.classList.add("danger");
    } else if (length >= 180) {
        counter.classList.add("warning");
    } else {
        counter.classList.add("normal");
    }
});