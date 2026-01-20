console.log('JS Calculator');

function showGreeting() {
    let name = document.getElementById('nameInput').value;
    let age = document.getElementById('ageInput').value;
    console.log(name);
    console.log(age);

    const greetingOutput = document.getElementById('greetingOutput');
    console.log(greetingOutput);

    greetingOutput.textContent = name + " is " + age + " years old.";
    greetingOutput.style.display = 'block';
    greetingOutput.className = 'output success';
}

function checkType() {
    let textInput = document.getElementById('typeInput').value;
    console.log(textInput);

    const textOutput = document.getElementById('typeOutput');
    console.log(textOutput);
    textOutput.textContent = textInput;
    textOutput.style.display = 'block';
    textOutput.className = 'output success';
}

function calculate(operator) {
    const num1 = document.getElementById('num1').value;
    const num2 = document.getElementById('num2').value;

    let result;

    switch (operator) {
        case "+":
            result = Number(num1) + Number(num2);
            break;

        case "-":
            result = Number(num1) - Number(num2);
            break;

        case "*":
            result = Number(num1) * Number(num2);
            break;

        case "/":
            if (num2 === 0) {
                result = "Cannot divide by zero";
            } else {
                result = Number(num1) / Number(num2);
            }
            break;

        case "%":
            result = Number(num1) % Number(num2);
            break;

        case "**":
            result = Number(num1) ** Number(num2);
            break;

        default:
            result = "Invalid operator";
            break;
    }

    const calcOutput = document.getElementById('calcOutput');

    calcOutput.textContent = result;
    calcOutput.style.display = 'block';
    calcOutput.className = 'output success';
}

function compareValues() {
    const input1 = document.getElementById("compare1").value;
    const input2 = document.getElementById("compare2").value;

    const val1 = Number(input1);
    const val2 = Number(input2);
    const message = `📊 Харьцуулалт:

Утга 1: ${input1} (${typeof val1})
Утга 2: ${input2} (${typeof val2})

═══════════════════════════════════════
⚖️ == (Loose equality - утга харьцуулах):
   ${val1} == ${val2} → ${val1 == val2}

⚖️ === (Strict equality - утга + төрөл):
   ${val1} === ${val2} → ${val1 === val2}

═══════════════════════════════════════
📈 Бусад харьцуулалт:
   ${val1} != ${val2} → ${val1 != val2}
   ${val1} !== ${val2} → ${val1 !== val2}
   ${val1} > ${val2} → ${val1 > val2}
   ${val1} < ${val2} → ${val1 < val2}

💡 Зөвлөмж:Үргэлж === ашигла!`;

const output = document.getElementById("compareOutput");
output.textContent = message;
output.style.display = "block";
output.className = "output success";
}