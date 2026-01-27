// Бөглөх - && || ! хослуулах

let age = 20;
let hasTicket = true;
let isVIP = false;

// 1. Концертод орох (18+ БА тасалбартай) ЭСВЭЛ VIP
if ((age >= 18 && hasTicket) || isVIP) {
    console.log("Орох эрхтэй");
}

// 2. Хямдрал (Оюутан эсвэл Ахмад) БА Баасан гараг
let isStudent = true;
let isElderly = false;
let today = "Friday";

if ((isStudent || isElderly) && today == "Friday") {
    console.log("20% хямдрал!");
}

// 3. Захиалга цуцлах боломжтой
// (Төлөгдөөгүй ЭСВЭЛ 24 цаг дотор) БА Хүргэгдээгүй
let isPaid = true;
let hoursAgo = 12;
let isDelivered = false;

if ((!isPaid || hoursAgo < 24) && !isDelivered) {
    console.log("Захиалга цуцлах боломжтой");
}
