// Teachers жагсаалтыг ачаалах
function loadTeachers() {

    fetch('/api/teachers')
        .then(response => response.json())
        .then(teachers => {

            const list = document.getElementById("teacherList");
            list.innerHTML = "";

            teachers.forEach(teacher => {

                const li = document.createElement("li");

                li.innerHTML = `
                    <strong>${teacher.name}</strong> - ${teacher.subject}
                    <button onclick="deleteTeacher(${teacher.id})">Delete</button>
                `;

                list.appendChild(li);
            });

        })
        .catch(error => console.error("Error loading teachers:", error));
}



// Teacher нэмэх
function addTeacher() {

    const name = document.getElementById("nameInput").value;
    const subject = document.getElementById("subjectInput").value;

    const teacher = {
        name: name,
        subject: subject
    };

    fetch('/api/teachers', {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(teacher)
    })
    .then(response => response.json())
    .then(() => {

        document.getElementById("nameInput").value = "";
        document.getElementById("subjectInput").value = "";

        loadTeachers();

    })
    .catch(error => console.error("Error adding teacher:", error));
}



// Teacher устгах
function deleteTeacher(id) {

    fetch(`/api/teachers/${id}`, {
        method: "DELETE"
    })
    .then(() => loadTeachers())
    .catch(error => console.error("Error deleting teacher:", error));
}



// Page ачаалахад teachers-ийг автоматаар авах
loadTeachers();