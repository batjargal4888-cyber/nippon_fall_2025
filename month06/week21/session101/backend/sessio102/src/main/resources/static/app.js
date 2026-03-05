// Teachers жагсаалтыг ачаалах
function loadTeachers() {
	
	const teacherList = document.getElementById('teacherList');
	teacherList.innerHTML = '';

    fetch('/api/teachers')
        .then(res => res.json())
        .then(data => {
			for (let i = 0; i < data.length; i++){
				const container = document.createElement('div');
				
				container.style.display = 'flex';
				container.style.justifyContent = 'space-between';
				
				const teacherLi = document.createElement('Li');
				teacherLi.innerText = data[i].subject;
				
				const deleteButton = document.createElement('button');
				deleteButton.textContent = 'remove';
				
				deleteButton.add('click', function(){
					console.log('dlete clicked');'
					deleteTeacher(i);
				});
				
				container.appendChild(teacherLi);
				container.appendChild(deleteButton);
				
				teacherList.appendChild(container);
			}
		});
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
    .then(data => {

        loadTeachers();

    })
    .catch(error => console.error("Error adding teacher:", error));
}



// Teacher устгах
function deleteTeacher(id) {

    fetch(`/api/teachers/${id}`, {
        method: "DELETE"
    })
	.then((response) => response.json())
    .then((data) => {
		console.log('delete');
		console.log(data);
        loadTeachers();
    });
}

// Page ачаалахад teachers-ийг автоматаар авах
loadTeachers();