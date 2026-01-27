// Бөглөх - || ашиглах

let day = "Saturday";

// 1. Амралтын өдөр эсэх
if (day === "Saturday" || day === "Sunday") {
    console.log("Амралтын өдөр!");
}

// 2. Admin эсвэл Moderator
let role = "moderator";
if (role === "admin" || role === "moderator") {
    console.log("Удирдах эрхтэй");
}

// 3. Төлбөрийн арга
let paymentMethod = "qpay";
if (paymentMethod === "card" || paymentMethod === "qpay" || paymentMethod === "cash") {
    console.log("Төлбөр хүлээн авлаа");
}

// 4. Хоосон утга шалгах
let input = "";
if (input === "" || input === null || input === undefined) {
    console.log("Утга оруулна уу");
}
