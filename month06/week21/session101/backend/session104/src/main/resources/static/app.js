console.log("JS ажиллаж байна");

// API хаяг (StudentController дээрх /api/students-тэй таарна)
const API_URL = '/api/students'; 

// Хуудас ачаалж дуусмагц мэдээллийг татах
document.addEventListener("DOMContentLoaded", fetchRecords);

function fetchRecords() {
    fetch(API_URL)
        .then(response => response.json())
        .then(data => {
			
            const list = document.getElementById('recordList');
            list.innerHTML = ''; // хуучин list-ийг цэвэрлэх
			
            data.forEach(item => {
				
                const li = document.createElement('li');
                
                // TODO: item.field1 болон item.field2-ыг 
                // өөрийн Java Model-ийн хувьсагчийн нэрээр солино уу

				// Student model дээрх name болон major-г харуулах
				li.textContent = item.name + " - " + item.major;
				
				// Delete button үүсгэх
				const deleteBtn = document.createElement('button');
				deleteBtn.textContent = "Delete";
				
				// Тухайн student-ийн id-г дамжуулж устгах
				deleteBtn.onclick = function () {
					deleteRecord(item.id);
				}
				
				// button-ийг li дотор хийх
				li.appendChild(deleteBtn);
				
				// li-г list рүү нэмэх
				list.appendChild(li);
                
            });
        })
        .catch(error => console.error('Алдаа гарлаа:', error));
}

function createRecord() {
	
	// input-оос name болон major утгуудыг авах
    const nameValue = document.getElementById('input1').value;
    const majorValue = document.getElementById('input2').value;

	// хоосон байвал анхааруулах
    if (!nameValue || !majorValue) {
        alert("Мэдээллийг бүрэн оруулна уу!");
        return;
    }

    // TODO: field1 болон field2-ыг өөрийн Java Model-ийн 
    // хувьсагчийн нэрээр солино уу
	
	// Student object үүсгэх
    const newRecord = {
        name: nameValue,
        major: majorValue
    };

    fetch(API_URL, {
        // TODO
		
		method: 'POST', // backend руу POST request явуулах
		headers: {
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(newRecord) // object -> JSON
    })
    .then(() => {
		
        // Оруулсан мэдээллийг цэвэрлэх
        document.getElementById('input1').value = '';
        document.getElementById('input2').value = '';
        // TODO 
        // Жагсаалтыг шинэчлэх
		fetchRecords();
    })
    .catch(error => console.error('Хадгалахад алдаа гарлаа:', error));
}

function deleteRecord(id) {
    fetch(`${API_URL}/${id}`, {
        // TODO
		method: 'DELETE' // тухайн id-тай student устгах
    })
    .then(() => fetchRecords()) // Жагсаалтыг шинэчлэх
    .catch(error => console.error('Устгахад алдаа гарлаа:', error));
}