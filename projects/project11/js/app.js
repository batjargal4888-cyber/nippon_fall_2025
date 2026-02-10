console.log('Pokemon App');

/* =====================
   CONSTANTS
===================== */
const BASE_API_URL = 'https://pokeapi.co/api/v2/';
const OFFSET = 0;
const LIMIT = 50;

const POKEMON_URL = `${BASE_API_URL}pokemon?offset=${OFFSET}&limit=${LIMIT}`;

/* =====================
   DOM
===================== */
const cardsContainer = document.getElementById('cards');

/* =====================
   FETCH
===================== */
fetch(POKEMON_URL)
    .then(response => response.json())
    .then(data => {
        const results = data.results;

        for (let i = 0; i < results.length; i++) {
            const pokemonUrl = results[i].url;

            fetch(pokemonUrl)
                .then(response => response.json())
                .then(detail => {
                    renderPokemon(detail);
                })
                .catch(err => console.error(err));
        }
    })
    .catch(err => console.error(err));

/* =====================
   RENDER
===================== */
function renderPokemon(detail) {
    const pokemonContainer = document.createElement('div');
    pokemonContainer.className = 'pokemon-container';

    const img = document.createElement('img');
    img.className = 'pokemon-img';
    img.src =
        detail.sprites.other['official-artwork'].front_default ||
        detail.sprites.front_default;
    img.alt = detail.name;

    const pokemonTitle = document.createElement('h3');
    pokemonTitle.className = 'pokemon-title';
    pokemonTitle.textContent = detail.name;

    const id = document.createElement('span');
    id.className = 'pokemon-id';
    id.textContent = `#${detail.id}`;

    const type = document.createElement('p');
    type.className = 'pokemon-type';
    type.textContent = detail.types
        .map(t => t.type.name)
        .join(', ');

    pokemonContainer.append(img, pokemonTitle, id, type);
    cardsContainer.appendChild(pokemonContainer);
}
