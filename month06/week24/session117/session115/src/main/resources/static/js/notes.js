const token = localStorage.getItem("jwt_token");

if (!token) {
    window.location.href = "/index.html";
}

const authHeaders = {
    "Content-Type": "application/json",
    Authorization: `Bearer ${token}`,
};

document.addEventListener("DOMContentLoaded", loadNotes);

document.getElementById("logoutBtn").addEventListener("click", () => {
    localStorage.removeItem("jwt_token");
    window.location.href = "/index.html";
});

async function loadNotes() {
    try {
        const response = await fetch("/api/notes", {
            method: "GET",
            headers: authHeaders,
        });

        // if the token is invalid or expired, the server returns 403 Forbidden
        if (response.status === 403) {
            alert("Your session has expired. Please log in again.");
            document.getElementById("logoutBtn").click();
            return;
        }

        const notes = await response.json();
        const list = document.getElementById("noteList");

        if (notes.length === 0) {
            list.innerHTML = "<p>You have no notes yet. Create one above!</p>";
            return;
        }

        list.innerHTML = notes
            .map(
                (notes) => `
                <div class="note-card">
                    <h3>${notes.title}</h3>
                    <p>${notes.content}</p>
                </div>
                `,
            )
            .join("");
    } catch (error) {
        document.getElementById("noteList").innerHTML =
        '<p style="color:red;">Error loading notes.</p>';
    }
}

async function createNote() {
    const title = document.getElementById("noteTitle").value;
    const content = document.getElementById("noteContent").value;

    if (!title || !content) {
        alert("Please fill in both the title and content.");
        return;
    }

    try {
        const response = await fetch("/api/notes", {
            method: "POST",
            headers: authHeaders,
            body: JSON.stringify({ title, content }),
        });

        if (response.ok) {
            document.getElementById("noteTitle").value = "";
            document.getElementById("noteContent").value = "";
            loadNotes(); // refresh the list
        } else {
            alert("Failed to save the note.");
        }
    } catch (error) {
        alert("Server error.");
    }
} 