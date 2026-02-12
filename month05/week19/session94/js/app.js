console.log("Pokemon App");

const BASE_API_URL = "https://pokeapi.co/api/v2/";
const OFF_SET = 0;
const LIMIT = 5;

// https://pokeapi.co/api/v2/pokemon/?offset=0&limit=50

const POKEMON_URL = `${BASE_API_URL}pokemon/?offset=${OFF_SET}&limit=${LIMIT}`;
console.log(POKEMON_URL);

const cardsContainer = document.getElementById("cards");
const pokemons = [];
let filteredPokemons = [];

const modalWindow = document.getElementById('modal');
const modalCloseButton = document.getElementById('modalClose');
const modalWindowBody = document.getElementById('modalBody');

// search part
const searchInput = document.getElementById('searchInput');
const searchButton = document.getElementById('searchBtn');


const backgroundColors = {
  'grass': '1EBA11',
  'fire': 'EB6C6C'
}

const tagColors = {
  'fire': '#FF6464',
  'bug': '#C9FF84',
  'water': '#9FF3FF',
  'flying': '#CBE9FF',
  'grass': '#80E177'
}

const pokemonIcons = {
  'grass': `<svg width="15" height="16" viewBox="0 0 15 16" fill="none" xmlns="http://www.w3.org/2000/svg">
<path fill-rule="evenodd" clip-rule="evenodd" d="M2.28833 13.4439C2.23341 13.3922 2.1791 13.3396 2.12542 13.2859C-0.708473 10.452 -0.708473 5.85736 2.12542 3.02349C4.9593 0.189584 13.9892 0 13.9892 0C13.9892 0 15.2217 10.452 12.3879 13.2859C9.87098 15.8028 5.9653 16.0843 3.1377 14.1306L5.41608 11.3346L9.05827 10.5483L6.08517 10.2511L7.97461 8.32727L10.1254 7.85611L8.42467 7.35246L10.1254 4.28446L7.7063 6.99783L6.77214 5.67961L7.10099 7.85611L5.41608 9.75555L4.63505 7.35243V10.5483L2.28833 13.4439Z" fill="#212121"/>
</svg>
`,
  'poison': `<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg">
<path fill-rule="evenodd" clip-rule="evenodd" d="M13.3694 12.2953C14.9851 11.0034 16 9.13675 16 7.06094C16 3.16128 12.4183 0 8 0C3.58172 0 0 3.16128 0 7.06094C0 9.06181 0.942928 10.8683 2.45798 12.1532C2.36616 12.4702 2.31579 12.815 2.31579 13.1756C2.31579 14.7355 3.25834 16 4.42106 16C5.17656 16 5.83913 15.4661 6.21053 14.6642C6.58194 15.4661 7.2445 16 8 16C8.68869 16 9.30013 15.5564 9.68422 14.8705C10.0683 15.5564 10.6798 16 11.3684 16C12.5311 16 13.4737 14.7355 13.4737 13.1756C13.4737 12.8682 13.4371 12.5723 13.3694 12.2953ZM12.6316 7.20097C12.6316 9.18078 10.5108 10.7858 7.89475 10.7858C5.27866 10.7858 3.15791 9.18078 3.15791 7.20097C3.15791 5.22116 5.27866 3.61619 7.89475 3.61619C10.5108 3.61619 12.6316 5.22116 12.6316 7.20097Z" fill="#212121"/>
</svg>
`,
  'fire': `<svg width="12" height="16" viewBox="0 0 12 16" fill="none" xmlns="http://www.w3.org/2000/svg">
<path fill-rule="evenodd" clip-rule="evenodd" d="M9.00807 12.3561C9.20575 11.6332 8.82203 10.1472 8.82203 10.1472C8.82203 10.1472 8.54372 11.3578 8.10885 11.8052C7.73785 12.1869 7.28332 12.4516 6.63144 12.5212C7.16441 12.2623 7.53094 11.7225 7.53094 11.0986C7.53094 10.2228 6.80869 9.51278 5.91775 9.51278C5.02682 9.51278 4.30453 10.2228 4.30453 11.0986C4.30453 11.3378 4.35844 11.5646 4.45491 11.768C3.89766 11.3241 3.81004 10.6123 3.81004 10.6123C3.81004 10.6123 3.18779 13.1958 4.90235 14.411C6.61688 15.6263 9.9756 14.5817 9.9756 14.5817C9.9756 14.5817 5.16907 17.9637 1.60738 14.2828C-1.46072 11.112 0.806601 6.93759 0.806601 6.93759C0.806601 6.93759 0.708682 7.32484 0.708682 7.77437C0.708682 8.22391 0.95241 8.56594 0.95241 8.56594C0.95241 8.56594 1.67944 7.03347 2.24525 6.41025C2.78075 5.82044 3.45204 5.34206 4.03185 4.92887C4.47816 4.61081 4.87029 4.33138 5.10447 4.06947C6.39438 2.62715 5.60347 0 5.60347 0C5.60347 0 7.05753 1.28188 7.46347 2.93743C7.61822 3.5685 7.51866 4.28653 7.42966 4.92863C7.28516 5.971 7.16838 6.81328 8.21229 6.75863C9.89922 6.67028 8.43332 4.06947 8.43332 4.06947C8.43332 4.06947 12.2599 6.08072 11.9741 9.59828C11.6882 13.1158 7.79138 13.9155 7.79138 13.9155C7.79138 13.9155 8.81035 13.0789 9.00807 12.3561Z" fill="#212121"/>
</svg>
`,
  'flying': `<svg width="16" height="14" viewBox="0 0 16 14" fill="none" xmlns="http://www.w3.org/2000/svg">
<path fill-rule="evenodd" clip-rule="evenodd" d="M5.58475 13.8667C7.92859 13.8667 9.93522 12.564 10.7636 10.7174C10.7738 10.6948 7.43772 11.5843 7.54409 11.2699C7.59159 11.1295 9.63659 10.3824 11.1265 9.51106C11.9828 9.01022 12.3772 7.95 12.3772 7.95C12.3772 7.95 10.9345 8.65047 10.2051 8.82816C8.73537 9.18628 7.44159 9.14772 7.44159 9.11041C7.44159 9.02972 9.58988 8.62153 12.5758 6.802C13.9802 5.94616 14.3617 4.47197 14.3617 4.47197C14.3617 4.47197 12.8176 5.39172 11.8842 5.69537C9.67053 6.41547 7.65047 6.63247 7.65047 6.53503C7.65047 6.32641 9.42819 5.83756 11.313 4.92428C12.293 4.44944 13.1417 3.82906 14.1252 3.13916C15.7346 2.01038 16 0 16 0C16 0 14.4127 1.02375 13.6381 1.36373C10.4419 2.76659 7.61966 3.50247 5.58475 3.66178C2.513 3.90228 0 6.0455 0 8.82816C0 11.6108 2.50037 13.8667 5.58475 13.8667Z" fill="#212121"/>
</svg>
`,
  'bug': `<svg width="14" height="16" viewBox="0 0 14 16" fill="none" xmlns="http://www.w3.org/2000/svg">
<path fill-rule="evenodd" clip-rule="evenodd" d="M9.50619 0.015665C9.51784 -0.000951152 9.54072 -0.00498931 9.55734 0.00664544L10.6934 0.802131C10.71 0.813766 10.7141 0.836666 10.7024 0.853281L9.12122 3.11148C9.88994 3.35706 10.4137 3.62197 10.4137 3.62197C10.4137 3.62197 9.13353 5.82391 6.96231 5.82391C4.79109 5.82391 3.24825 3.77166 3.24825 3.77166C3.24825 3.77166 3.79531 3.42253 4.60625 3.1231L2.87187 1.05617C2.85884 1.04063 2.86087 1.01747 2.87641 1.00443L3.93881 0.112958C3.95438 0.0999194 3.97753 0.101946 3.99056 0.117485L6.18656 2.73458C6.37459 2.71331 6.56616 2.70142 6.75947 2.70142C7.03731 2.70142 7.31481 2.72254 7.58572 2.75838L9.50619 0.015665ZM9.93575 5.92819C10.5152 5.51437 11.3919 4.43431 11.3919 4.43431C11.3919 4.43431 13.6314 6.209 13.6314 9.972C13.6314 13.735 9.75966 15.9998 9.75966 15.9998C9.75966 15.9998 7.90981 14.1316 7.45569 11.7634C7.00159 9.39528 8.12744 6.76572 8.12744 6.76572C8.12744 6.76572 9.35631 6.342 9.93575 5.92819ZM3.69566 5.92819C3.11625 5.51437 2.2395 4.43431 2.2395 4.43431C2.2395 4.43431 0 6.209 0 9.972C0 13.735 3.87175 15.9998 3.87175 15.9998C3.87175 15.9998 5.72159 14.1316 6.17572 11.7634C6.62981 9.39528 5.50397 6.76572 5.50397 6.76572C5.50397 6.76572 4.27509 6.342 3.69566 5.92819Z" fill="#212121"/>
</svg>
`,
  'water': `<svg width="11" height="16" viewBox="0 0 11 16" fill="none" xmlns="http://www.w3.org/2000/svg">
<path fill-rule="evenodd" clip-rule="evenodd" d="M10.3804 10.8286C10.3804 13.6843 8.05666 15.9993 5.19019 15.9993C2.32372 15.9993 0 13.6843 0 10.8286C0 8.05122 4.90944 0.423372 5.17869 0.00711906C5.18484 -0.00237308 5.19556 -0.002373 5.20169 0.00711916C5.47094 0.423372 10.3804 8.05122 10.3804 10.8286ZM4.325 14.3416C1.69125 13.7653 2.14194 10.8478 2.14194 10.8478C2.14194 10.8478 2.86112 12.609 4.60641 13.1795C6.35166 13.75 8.46078 12.9133 8.46078 12.9133C8.46078 12.9133 6.95875 14.9178 4.325 14.3416Z" fill="#212121"/>
</svg>
`,
  'normal': `<svg width="15" height="15" viewBox="0 0 15 15" fill="none" xmlns="http://www.w3.org/2000/svg">
<path fill-rule="evenodd" clip-rule="evenodd" d="M14.0625 7.03125C14.0625 10.9145 10.9145 14.0625 7.03125 14.0625C3.148 14.0625 0 10.9145 0 7.03125C0 3.148 3.148 0 7.03125 0C10.9145 0 14.0625 3.148 14.0625 7.03125ZM11.0491 7.03125C11.0491 9.25025 9.25025 11.0491 7.03125 11.0491C4.81225 11.0491 3.01341 9.25025 3.01341 7.03125C3.01341 4.81225 4.81225 3.01341 7.03125 3.01341C9.25025 3.01341 11.0491 4.81225 11.0491 7.03125Z" fill="#212121"/>
</svg>
`,
  'dragon': `<svg width="14" height="16" viewBox="0 0 14 16" fill="none" xmlns="http://www.w3.org/2000/svg">
<path fill-rule="evenodd" clip-rule="evenodd" d="M7.77194 7.96503C7.88038 7.89891 7.97237 7.76034 8.04656 7.60634C9.02297 8.00541 9.70912 8.94841 9.70912 10.0481C9.70912 11.5091 8.49819 12.6934 7.00444 12.6934C6.39125 12.6934 5.82572 12.4938 5.37206 12.1575C5.22325 12.087 5.10081 12.0193 5.00063 11.9639C4.84522 11.878 4.74331 11.8217 4.6795 11.8305C4.49297 11.8562 4.54713 12.0278 4.59634 12.1837C4.62975 12.2896 4.66091 12.3883 4.61269 12.429C4.56225 12.4716 4.39888 12.3158 4.20797 12.1338C3.94809 11.886 3.63722 11.5896 3.49063 11.6787C3.37472 11.7491 3.48725 11.94 3.625 12.1738L3.63522 12.1911C3.69341 12.2899 3.76084 12.3906 3.82238 12.4824C3.94747 12.669 4.04822 12.8193 3.99781 12.8448C3.93688 12.8755 3.51231 12.589 3.15453 12.1911C3.01644 12.0376 2.88269 11.8712 2.75838 11.7165V11.7165C2.48628 11.3779 2.25959 11.0959 2.13234 11.1293C1.97927 11.1695 2.09507 11.4852 2.26522 11.7891C2.34478 11.9312 2.43838 12.0758 2.51941 12.2011V12.2012C2.64544 12.396 2.74109 12.5438 2.70641 12.562C2.65959 12.5865 2.24769 12.1848 1.96792 11.6787C1.80175 11.378 1.66222 11.0457 1.54925 10.7768C1.42675 10.4851 1.3355 10.2678 1.27541 10.2459C1.06664 10.1699 1.06664 10.5956 1.15037 11.2099C1.16129 11.2901 1.17756 11.3742 1.19759 11.4598C2.00959 14.087 4.504 16 7.45522 16C11.0651 16 13.9915 13.1379 13.9915 9.60725C13.9915 6.24688 11.3406 3.49209 7.9725 3.23419C7.97675 3.07589 8.05937 2.76197 8.05937 2.76197C8.05937 2.76197 8.65397 1.32335 8.68541 1.01593C8.68747 0.995531 8.68994 0.973359 8.69259 0.949747C8.72962 0.617591 8.79853 0 8.26722 0C7.98347 0 7.85153 0.211083 7.70063 0.452497C7.64269 0.545175 7.58194 0.642328 7.50875 0.733719C6.98163 1.39199 6.09525 2.21403 5.59266 2.65197C4.53034 3.57762 3.48809 4.33838 2.88022 4.78206L2.88019 4.78209C2.60372 4.98387 2.41713 5.12009 2.35938 5.17637C1.92419 5.60063 0.363807 8.41519 0.363807 8.41519C0.363807 8.41519 -0.140803 9.31819 0.0385565 9.50134C0.217916 9.68447 0.650441 9.6425 0.650441 9.6425C0.650441 9.6425 6.46109 8.30947 6.98131 8.20434C7.12138 8.17603 7.22025 8.15969 7.29616 8.14716C7.50225 8.11313 7.53925 8.107 7.77194 7.96503ZM3.66359 6.252C3.35169 6.54847 2.83441 7.25612 2.83441 7.25612C2.83441 7.25612 3.79578 7.31534 4.32525 6.81206C4.85475 6.30875 4.73344 5.45103 4.73344 5.45103C4.73344 5.45103 3.97547 5.95553 3.66359 6.252Z" fill="#212121"/>
</svg>
`,
  'fighting': `<svg width="15" height="16" viewBox="0 0 15 16" fill="none" xmlns="http://www.w3.org/2000/svg">
<path fill-rule="evenodd" clip-rule="evenodd" d="M2.22605 1.33018C2.41968 0.565669 3.11228 0 3.93697 0C4.55556 0 5.09984 0.318272 5.41497 0.8H5.931C6.25159 0.470987 6.6995 0.266667 7.19516 0.266667C7.92184 0.266667 8.54597 0.705881 8.81653 1.33333H9.24856C9.51928 1.16433 9.83916 1.06667 10.1818 1.06667C10.9085 1.06667 11.5326 1.50588 11.8032 2.13333H12.978C12.9881 2.13333 12.9975 2.13604 13.0056 2.14075C13.0592 2.13584 13.1136 2.13333 13.1685 2.13333C14.1432 2.13333 14.9333 2.92348 14.9333 3.89819V9.19019L14.9333 9.2L14.9333 9.20981V9.28603C14.9333 9.31831 14.9324 9.35047 14.9307 9.38247C14.8245 13.0537 11.5234 16 7.46666 16C3.34294 16 0 12.9555 0 9.2C0 7.38722 0.778903 5.74009 2.04855 4.52109C2.04538 6.28837 2.07523 8.11544 2.21283 8.08409C2.58128 8.00009 2.29341 2.52623 2.22605 1.33018Z" fill="#212121"/>
</svg>
`,
  'fairy': `<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg">
<path fill-rule="evenodd" clip-rule="evenodd" d="M3.21019 12.6868L5.7765 11.9427L7.99306 15.9955C7.99597 16.0008 8.0035 16.0008 8.00638 15.9955L10.2229 11.9427L12.7893 12.6868C12.795 12.6885 12.8004 12.6831 12.7987 12.6774L12.0544 10.1618L15.9955 8.00638C16.0008 8.0035 16.0008 7.99597 15.9955 7.99309L12.0219 5.81984L12.7987 3.19453C12.8004 3.18878 12.795 3.18344 12.7893 3.18509L10.1628 3.94669L8.00638 0.00394338C8.0035 -0.00131436 7.99597 -0.00131451 7.99309 0.00394325L5.83672 3.94669L3.21019 3.18509C3.20444 3.18344 3.19909 3.18878 3.20081 3.19453L3.97753 5.81984L0.00394338 7.99309C-0.00131436 7.99597 -0.00131451 8.0035 0.00394325 8.00638L3.94503 10.1618L3.20081 12.6774C3.19909 12.6831 3.20444 12.6885 3.21019 12.6868ZM5.20162 8.02738L7.01972 9.02172L8.01406 10.8398C8.01694 10.8451 8.0245 10.8451 8.02738 10.8398L9.02172 9.02172L10.8398 8.02738C10.845 8.0245 10.845 8.01694 10.8398 8.01406L9.02172 7.01972L8.02738 5.20166C8.0245 5.19637 8.01694 5.19637 8.01406 5.20166L7.01972 7.01972L5.20162 8.01406C5.19637 8.01694 5.19637 8.0245 5.20162 8.02738Z" fill="#212121"/>
</svg>
`,
  'dark': `<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg">
<path fill-rule="evenodd" clip-rule="evenodd" d="M7.16809 14.1516C7.47206 14.1981 7.78338 14.2222 8.10038 14.2222C11.4754 14.2222 14.2115 11.4862 14.2115 8.11112C14.2115 4.73603 11.4754 2 8.10038 2C7.87394 2 7.65034 2.01232 7.43031 2.03632C9.10453 3.30472 10.2115 5.50194 10.2115 8C10.2115 10.6263 8.988 12.92 7.16809 14.1516ZM7.98925 16C12.4075 16 15.9893 12.4183 15.9893 8C15.9893 3.58172 12.4075 0 7.98925 0C3.57097 0 -0.0107422 3.58172 -0.0107422 8C-0.0107422 12.4183 3.57097 16 7.98925 16Z" fill="#212121"/>
</svg>
`
}

fetch(POKEMON_URL)
  .then((response) => response.json())
  .then((data) => {
    // console.log(data);
    const results = data.results;
    for (let i = 0; i < results.length; i++) {
      const pokemonUrl = results[i].url; // dot notation

      fetch(pokemonUrl)
        .then((response) => response.json())
        .then((detail) => {
          pokemons.push(detail);
          renderPokemon(detail);
        });
    }
  });

// function declaration
// DOM ашиглаад покемон болгоныг HTML дээр харуулах
function renderPokemon(detail) {
  console.log(detail);
  const pokemonContainer = document.createElement('div');
  pokemonContainer.classList.add('pokemon-container');

  console.log(detail.sprites.front_default);
  // - `id`
  const pokemonId = document.createElement('p');
  pokemonId.textContent = `#${String(detail.id).padStart(3, "0")}`;
  
  // - `types[0].type.name`
  const pokemonImage = document.createElement('img');
  // pokemonImage.src = detail.sprites.other['official-artwork'].front_default;
  pokemonImage.src = detail.sprites.front_default;
  // `sprites.front_default`

  const pokemonTitle = document.createElement('h3');
  pokemonTitle.textContent = detail.name;
  pokemonTitle.classList.add('pokemon-title');

  // add elements to the pokemon container
  pokemonContainer.appendChild(pokemonImage);
  pokemonContainer.appendChild(pokemonTitle);

  // add pokemon container to the cards container
  cardsContainer.appendChild(pokemonContainer);
  console.log(backgroundColors[detail.types[0].type.name]);

  pokemonContainer.style.background = `#${backgroundColors[detail.types[0].type.name]}`;
  // console.log(detail.sprites.other['official-artwork'].front_default);
  // console.log(detail.types[0].type.name);

  // type rendering

  const pokemonTypes = detail.types; // []
  console.log(pokemonTypes);

  const pokemonTypeContainer = document.createElement('div');
  pokemonTypeContainer.classList.add('pokemon-type-container');

  for (let i = 0; i < pokemonTypes.length; i++) {
    const pokemonType = document.createElement('span');
    pokemonType.classList.add('pokemon-type');
    pokemonType.textContent = pokemonTypes[i].type.name;
    // add background color
    pokemonType.style.background = `#${tagColors[pokemonTypes[i].type.name]}`;

    const pokemonIconDiv = document.createElement('div');
    
    pokemonIconDiv.innerHTML = `${pokemonIcons[pokemonTypes[i].type.name]}`;

    pokemonContainer.appendChild(pokemonIconDiv);

    // add pokemon type
    pokemonTypeContainer.appendChild(pokemonType);
  }

  pokemonContainer.appendChild(pokemonId);
  pokemonContainer.appendChild(pokemonTypeContainer);

  pokemonContainer.addEventListener('click', function(){
    showModal(detail);
  })
}

function showModal(pokemon) {
  console.log('modal window should appear');
  console.log('pokemon detail', pokemon);
  modalWindow.classList.add('active');
  modalWindowBody.innerHTML = '';

  const pokemonTitle = document.createElement('h3');
  pokemonTitle.textContent = pokemon.name;

  const pokemonImage = document.createElement('img');
  pokemonImage.src = pokemon.sprites.front_default;

  modalWindowBody.appendChild(pokemonTitle);
  modalWindowBody.appendChild(pokemonImage);
}

const searchPokemons = () => {
  console.log(pokemons);
  console.log(searchInput.value);
  const modifiedSearchInput = searchInput.value.toLowerCase().trim();

  cardsContainer.innerHTML = '';
  filteredPokemons = [];

  for (let i = 0; i < pokemons.length; i++) {
    if (pokemons[i].name.includes(modifiedSearchInput)) {
      console.log('found');
      filteredPokemons.push(pokemons[i]);
      console.log(filteredPokemons);
      
    } else {
      console.log('not found');
    }

    
  }

  for (let i = 0; i < filteredPokemons.length; i++) {
    renderPokemon(filteredPokemons[i]);
  }
}

searchButton.addEventListener('click', searchPokemons); // callback function
searchInput.addEventListener('keydown', (e) => {
  if (e.key === 'Enter') {
    searchPokemons();
  }
})

modalCloseButton.addEventListener('click', () => {
  modalWindow.classList.remove('active');
})

modalWindow.addEventListener('click', function (e) {
  if (e.target === modalWindow) {
    modalWindow.classList.remove('active');
  }
});

document.addEventListener('keydown', (e) => {
  if (e.key === 'Escape' && modalWindow.classList.contains('active')) {
    modalWindow.classList.remove('active');
  }
})

// function definition
const funcDef = function () { };
funcDef();