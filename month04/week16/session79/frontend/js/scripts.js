console.log("Javascript DOM and Array");

// 1. Topics JS Array
let arrays = [5, 2, 8, 1, 9];
console.log("unsorted array", arrays);

function bubbleSort(arr) {
    const n = arr.length;
    let swapCount = 0;

    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                const temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            swapCount++;
        }
    }
    console.log("Compare count: ", swapCount);
}

function bubbleSortOptimized(arr) {
    const n = arr.length;
    let swapped;
    let swapCount = 0;
    for (let i = 0; i < n; i++) {
        swapped = false;

        for (let j = 0; j < n - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                // swap
                let temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

                swapped = true;
                swapCount++;
            }
        }
        if (!swapped) {
            break;
        }
    }
    console.log("Compare count: " + swapCount);
}

bubbleSort(arrays);
console.log("Sorted Arrays", arrays);

arrays = [5, 2, 8, 1, 9];
bubbleSortOptimized(arrays);
console.log("Sorted Arrays", arrays);

function renderBubble() {
    let arrays = [5, 2, 8, 1, 9, 10, -1];

    const bubbles = document.getElementById("bubbles");
    bubbleSort.innerHTML = "";

    for (let i = 0; i < arrays.length; i++) {
        const div = document.createElement("div");
        div.className = "bubble";
        div.textContent = arrays[i];
        bubbles.appendChild(div);
    }
}

const sortingButton = document.getElementById("sortBtn");
const resetButton = document.getElementById("resetBtn");

sortingButton.addEventListener("click", bubbleSortVisualizer);
resetButton.addEventListener("click", reset);

let sorting = false;

async function bubbleSortVisualizer() {
    console.log("bubble sort visualizer is working.");
    sorting = true;

    sortingButton.disabled = true;
    resetButton.disabled = true;

    const bubbles = document.getElementsByClassName("bubble");
    console.log(bubbles);

    const n = arrays.length;

    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n - i - 1; j++) {
            bubbles[j].classList.add('comparing');
            bubbles[j + 1].classList.add('comparing');

            document.getElementById('status').textContent =
                `Comparing ${arrays[j]} and ${arrays[j + 1]}`;

            if (arrays[j] > arrays[j + 1]) {
                bubbles[j].classList.remove('comparing');
                bubbles[j + 1].classList.remove('comparing');

                bubbles[j].classList.add('swapping');
                bubbles[j + 1].classList.add('swapping');
                document.getElementById('status').textContent =
                    `Swapping ${arrays[j]} and ${arrays[j + 1]}`;

                // swap array
                const temp = arrays[j];
                arrays[j] = arrays[j + 1];
                arrays[j + 1] = temp;

                // swap in display
                bubbles[j].classList.remove('swapping');
                bubbles[j + 1].classList.remove('swapping');
            } else {
                bubbles[j].classList.remove('comparing');
                bubbles[j + 1].classList.remove('comparing');
            }
        }

        bubbles[n - 1 - i].classList.add('sorted');
    }

    bubbles[0].classList.add('sorted');
    document.getElementById('status').textContent = 'Completed';

    sorting = false;
    resetButton.disabled = false;

}

function reset() {
    console.log("reset");
}

renderBubble();