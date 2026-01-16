const toggle = document.getElementById("themeToggle");
const icon = toggle.querySelector(".icon");
const label = toggle.querySelector(".label");
const root = document.documentElement;

function applyTheme(theme) {
    root.setAttribute("data-theme", theme);

    toggle.classList.add("animate", "flip");

    if (theme === "light") {
        icon.textContent = "🌙";
        label.textContent = "Dark Mode";
    } else {
        icon.textContent = "☀️";
        label.textContent = "Light Mode";
    }

    setTimeout(() => {
        toggle.classList.remove("animate", "flip");
    }, 600);
}

toggle.addEventListener("click", () => {
    const current = root.getAttribute("data-theme") || "light";
    applyTheme(current === "light" ? "dark" : "light");
});