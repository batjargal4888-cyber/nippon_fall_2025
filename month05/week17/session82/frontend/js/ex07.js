// Бөглөх - ! ашиглах

let isLoggedIn = false;

// 1. Нэвтрээгүй бол
if (!isLoggedIn) {
    console.log("Нэвтэрнэ үү");
}

// 2. Array хоосон биш бол
let items = ["apple", "banana"];
if (!(items.length === 0)) {
    console.log("Items байна: " + items.length);
}

// эсвэл
if (items.length !== 0) {
    console.log("Items байна");
}

// 3. String хоосон биш бол
let name = "Бат";
if (!name) {
    console.log("Нэр байхгүй");
} else {
    console.log("Нэр: " + name);
}

// 4. Boolean toggle
let darkMode = true;
darkMode = !darkMode;  // false болно
console.log("Dark mode:", darkMode);
