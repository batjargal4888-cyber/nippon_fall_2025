console.log("Pokemon App");

// ===== CONFIG =====
const BASE_URL = "https://pokeapi.co/api/v2/";
const cardsContainer = document.getElementById("cards");

const backgroundColors = {
    fire: "#EB6C6C",
    bug: "#91AC22",
    water: "#4A90E2",
    grass: "#5DBB63",
    flying: "#6EC1E4",
    poison: "#9B59B6",
    normal: "#B6B6B6",
    electric: "#F7D046",
    ground: "#A77437",
    fairy: "#FF9CEE",
    fighting: "#BA114E",
    psychic: "#C4484A",
    rock: "#857D57",
    ghost: "#6B2BF1",
    ice: "#3A9D90",
    dragon: "#1268B8",
    dark: "#373737",
    steel: "#448F85"
};

const tagColors = {
    grass: "#C9FF84",
    fire: "#FFB3B3",
    water: "#B3E5FF",
    bug: "#E2FF9F",
    poison: "#E6C8FF",
    flying: "#CDEBFF",
    normal: "#E0E0E0"
};

// ===== APP START =====
async function loadPokemons() {
    try {
        const res = await fetch(`${BASE_URL}pokemon?limit=20`);
        const data = await res.json();

        const detailPromises = data.results.map(p =>
            fetch(p.url).then(res => res.json())
        );

        const pokemons = await Promise.all(detailPromises);

        pokemons.forEach(pokemon => {
            renderPokemon(pokemon);
        });

    } catch (error) {
        console.error("Алдаа гарлаа:", error);
    }
}

// ===== RENDER CARD =====
function renderPokemon(pokemon) {
    const card = document.createElement("div");
    card.classList.add("pokemon-card");

    const mainType = pokemon.types[0].type.name;
    card.style.background = backgroundColors[mainType] || "#ccc";

    const formattedId = `#${String(pokemon.id).padStart(3, "0")}`;

    card.innerHTML = `
    <img class="pokemon-img"
         src="${pokemon.sprites.other['official-artwork'].front_default}"
         alt="${pokemon.name}" />

    <h3 class="pokemon-name">${capitalize(pokemon.name)}</h3>
    <p class="pokemon-id">${formattedId}</p>

    <div class="pokemon-types">
      ${pokemon.types.map(t => `
        <span class="type-badge"
              style="background:${tagColors[t.type.name] || '#fff'}">
          ${capitalize(t.type.name)}
        </span>
      `).join("")}
    </div>
  `;

    cardsContainer.appendChild(card);
}

// ===== HELPER =====
function capitalize(word) {
    return word.charAt(0).toUpperCase() + word.slice(1);
}

loadPokemons();