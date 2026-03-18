function getStudents() {
  fetch(API)
    .then(res => res.json())
    .then(students => {

      const list = document.getElementById("list");
      list.innerHTML = "";

      students.forEach(student => {

        const card = document.createElement("div");
        card.className = "student-card";

        card.innerHTML = `
          <div class="student-id">ID: ${student.id}</div>
          <div class="student-name">${student.firstName} ${student.lastName}</div>
          <div class="student-email">${student.email}</div>
          <button class="delete-btn" onclick="deleteStudent(${student.id})">
            Delete
          </button>
        `;

        list.appendChild(card);
      });

    });
}