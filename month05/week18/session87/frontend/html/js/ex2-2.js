// get all tab buttons & contents
const tabButtons = document.querySelectorAll('.tab-button');
const tabContents = document.querySelectorAll('.tab-content');

// add click event to each tab button
tabButtons.forEach(button => {
    button.addEventListener('click', () => {

        // remove active class from all buttons
        tabButtons.forEach(btn => btn.classList.remove('active'));

        // remove active class from all contents
        tabContents.forEach(content => content.classList.remove('active'));

        // add active class to clicked button
        button.classList.add('active');

        // get related content by data-tab value
        const tabId = button.dataset.tab;

        // show selected tab content
        document.getElementById(tabId).classList.add('active');
    });
});