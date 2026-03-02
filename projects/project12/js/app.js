// ===== DOM =====
const cardsContainer = document.getElementById("cards");

// ===== STATE =====
let allPokemons = [];
let displayedPokemons = [];
let currentPokemon = null;
let currentGenus = null;

// ===== HELPERS =====
function capitalize(str) {
    return str ? str[0].toUpperCase() + str.slice(1) : "";
}

// ===== API =====
const BASE_URL = "https://pokeapi.co/api/v2/pokemon";

// ===== FETCH LIST =====
async function fetchPokemons() {

    try {

        const response = await fetch(`${BASE_URL}?limit=1010`);
        const data = await response.json();

        const detailPromises = data.results.map(p =>
            fetch(p.url).then(res => res.json())
        );

        const details = await Promise.all(detailPromises);

        allPokemons = details;
        displayedPokemons = [...details];

        details.forEach(renderPokemon);

    } catch (error) {
        console.error("Алдаа гарлаа:", error);
    }
}

// ===== BACKGROUND COLORS =====
const backgroundColors = {
    fire: "#EB6C6C",
    bug: "#91AC22",
    water: "#009ACB",
    flying: "#2299EE",
    poison: "#7E00CB",
    normal: "#B6B6B6",
    rock: "#857D57",
    ground: "#A77437",
    fighting: "#BA114E",
    ghost: "#6B2BF1",
    psychic: "#C4484A",
    ice: "#3A9D90",
    dragon: "#1268B8",
    dark: "#373737",
    fairy: "#C01A8D",
    electric: "#B7B117",
    steel: "#448F85",
    grass: "#1EBA11"
};

// ===== TAG COLORS =====
const tagColors = {
    fire: "#FF6464",
    bug: "#C9F184",
    water: "#9FF3FF",
    flying: ["#CBE9FF", "#2299EE"], // gradient
    poison: "#D89CFD",
    normal: "#CBCBCB",
    rock: "#CFC06F",
    ground: "#FFBF72",
    fighting: "#FF699F",
    ghost: "#B592FF",
    psychic: "#FF5660",
    ice: "#AEFFF4",
    dragon: "#87C5FF",
    dark: "#8F8F8F",
    fairy: "#FFA2E3",
    electric: "#FFFAB6",
    steel: "#A4FFE9",
    grass: "#80E177"
}

// ===== TYPE ICONS =====
const pokemonIcons = {
    'grass': `<svg width="15" height="16" viewBox="0 0 15 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" clip-rule="evenodd" d="M2.28833 13.4439C2.23341 13.3922 2.1791 13.3396 2.12542 13.2859C-0.708473 10.452 -0.708473 5.85736 2.12542 3.02349C4.9593 0.189584 13.9892 0 13.9892 0C13.9892 0 15.2217 10.452 12.3879 13.2859C9.87098 15.8028 5.9653 16.0843 3.1377 14.1306L5.41608 11.3346L9.05827 10.5483L6.08517 10.2511L7.97461 8.32727L10.1254 7.85611L8.42467 7.35246L10.1254 4.28446L7.7063 6.99783L6.77214 5.67961L7.10099 7.85611L5.41608 9.75555L4.63505 7.35243V10.5483L2.28833 13.4439Z" fill="#212121"/></svg>`,
    'fire': `<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" clip-rule="evenodd" d="M11.0081 12.3561C11.2058 11.6332 10.822 10.1472 10.822 10.1472C10.822 10.1472 10.5437 11.3578 10.1088 11.8052C9.73785 12.1869 9.28332 12.4516 8.63144 12.5212C9.16441 12.2623 9.53094 11.7225 9.53094 11.0986C9.53094 10.2228 8.80869 9.51278 7.91775 9.51278C7.02682 9.51278 6.30453 10.2228 6.30453 11.0986C6.30453 11.3378 6.35844 11.5646 6.45491 11.768C5.89766 11.3241 5.81004 10.6123 5.81004 10.6123C5.81004 10.6123 5.18779 13.1958 6.90235 14.411C8.61688 15.6263 11.9756 14.5817 11.9756 14.5817C11.9756 14.5817 7.16907 17.9637 3.60738 14.2828C0.539279 11.112 2.8066 6.93759 2.8066 6.93759C2.8066 6.93759 2.70868 7.32484 2.70868 7.77437C2.70868 8.22391 2.95241 8.56594 2.95241 8.56594C2.95241 8.56594 3.67944 7.03347 4.24525 6.41025C4.78075 5.82044 5.45204 5.34206 6.03185 4.92887C6.47816 4.61081 6.87029 4.33138 7.10447 4.06947C8.39438 2.62715 7.60347 0 7.60347 0C7.60347 0 9.05753 1.28188 9.46347 2.93743C9.61822 3.5685 9.51866 4.28653 9.42966 4.92863C9.28516 5.971 9.16838 6.81328 10.2123 6.75863C11.8992 6.67028 10.4333 4.06947 10.4333 4.06947C10.4333 4.06947 14.2599 6.08072 13.9741 9.59828C13.6882 13.1158 9.79138 13.9155 9.79138 13.9155C9.79138 13.9155 10.8103 13.0789 11.0081 12.3561Z" fill="#212121"/></svg>`,
    'bug': `<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" clip-rule="evenodd" d="M10.6937 0.015665C10.7053 -0.000951152 10.7282 -0.00498931 10.7448 0.00664544L11.8809 0.802131C11.8975 0.813766 11.9016 0.836666 11.8899 0.853281L10.3087 3.11148C11.0774 3.35706 11.6012 3.62197 11.6012 3.62197C11.6012 3.62197 10.321 5.82391 8.14981 5.82391C5.97859 5.82391 4.43575 3.77166 4.43575 3.77166C4.43575 3.77166 4.98281 3.42253 5.79375 3.1231L4.05937 1.05617C4.04634 1.04063 4.04837 1.01747 4.06391 1.00443L5.12631 0.112958C5.14188 0.0999194 5.16503 0.101946 5.17806 0.117485L7.37406 2.73458C7.56209 2.71331 7.75366 2.70142 7.94697 2.70142C8.22481 2.70142 8.50231 2.72254 8.77322 2.75838L10.6937 0.015665ZM11.1233 5.92819C11.7027 5.51437 12.5794 4.43431 12.5794 4.43431C12.5794 4.43431 14.8189 6.209 14.8189 9.972C14.8189 13.735 10.9472 15.9998 10.9472 15.9998C10.9472 15.9998 9.09731 14.1316 8.64319 11.7634C8.18909 9.39528 9.31494 6.76572 9.31494 6.76572C9.31494 6.76572 10.5438 6.342 11.1233 5.92819ZM4.88316 5.92819C4.30375 5.51437 3.427 4.43431 3.427 4.43431C3.427 4.43431 1.1875 6.209 1.1875 9.972C1.1875 13.735 5.05925 15.9998 5.05925 15.9998C5.05925 15.9998 6.90909 14.1316 7.36322 11.7634C7.81731 9.39528 6.69147 6.76572 6.69147 6.76572C6.69147 6.76572 5.46259 6.342 4.88316 5.92819Z" fill="#212121"/></svg>`,
    'water': `<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" clip-rule="evenodd" d="M13.1929 10.8286C13.1929 13.6843 10.8692 15.9993 8.00269 15.9993C5.13622 15.9993 2.8125 13.6843 2.8125 10.8286C2.8125 8.05122 7.72194 0.423372 7.99119 0.00711906C7.99734 -0.00237308 8.00806 -0.002373 8.01419 0.00711916C8.28344 0.423372 13.1929 8.05122 13.1929 10.8286ZM7.1375 14.3416C4.50375 13.7653 4.95444 10.8478 4.95444 10.8478C4.95444 10.8478 5.67362 12.609 7.41891 13.1795C9.16416 13.75 11.2733 12.9133 11.2733 12.9133C11.2733 12.9133 9.77125 14.9178 7.1375 14.3416Z" fill="#212121"/></svg>`,
    'flying': `<svg width="16" height="14" viewBox="0 0 16 14" fill="none" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" clip-rule="evenodd" d="M5.58475 13.8667C7.92859 13.8667 9.93522 12.564 10.7636 10.7174C10.7738 10.6948 7.43772 11.5843 7.54409 11.2699C7.59159 11.1295 9.63659 10.3824 11.1265 9.51106C11.9828 9.01022 12.3772 7.95 12.3772 7.95C12.3772 7.95 10.9345 8.65047 10.2051 8.82816C8.73537 9.18628 7.44159 9.14772 7.44159 9.11041C7.44159 9.02972 9.58988 8.62153 12.5758 6.802C13.9802 5.94616 14.3617 4.47197 14.3617 4.47197C14.3617 4.47197 12.8176 5.39172 11.8842 5.69537C9.67053 6.41547 7.65047 6.63247 7.65047 6.53503C7.65047 6.32641 9.42819 5.83756 11.313 4.92428C12.293 4.44944 13.1417 3.82906 14.1252 3.13916C15.7346 2.01038 16 0 16 0C16 0 14.4127 1.02375 13.6381 1.36373C10.4419 2.76659 7.61966 3.50247 5.58475 3.66178C2.513 3.90228 0 6.0455 0 8.82816C0 11.6108 2.50037 13.8667 5.58475 13.8667Z" fill="#212121"/></svg>`,
    'poison': `<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" clip-rule="evenodd" d="M13.3694 12.2953C14.9851 11.0034 16 9.13675 16 7.06094C16 3.16128 12.4183 0 8 0C3.58172 0 0 3.16128 0 7.06094C0 9.06181 0.942928 10.8683 2.45798 12.1532C2.36616 12.4702 2.31579 12.815 2.31579 13.1756C2.31579 14.7355 3.25834 16 4.42106 16C5.17656 16 5.83913 15.4661 6.21053 14.6642C6.58194 15.4661 7.2445 16 8 16C8.68869 16 9.30013 15.5564 9.68422 14.8705C10.0683 15.5564 10.6798 16 11.3684 16C12.5311 16 13.4737 14.7355 13.4737 13.1756C13.4737 12.8682 13.4371 12.5723 13.3694 12.2953ZM12.6316 7.20097C12.6316 9.18078 10.5108 10.7858 7.89475 10.7858C5.27866 10.7858 3.15791 9.18078 3.15791 7.20097C3.15791 5.22116 5.27866 3.61619 7.89475 3.61619C10.5108 3.61619 12.6316 5.22116 12.6316 7.20097Z" fill="#212121"/></svg>`,
    'normal': `<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" clip-rule="evenodd" d="M15.0312 8C15.0312 11.8833 11.8833 15.0312 8 15.0312C4.11675 15.0312 0.96875 11.8833 0.96875 8C0.96875 4.11675 4.11675 0.96875 8 0.96875C11.8833 0.96875 15.0312 4.11675 15.0312 8ZM12.0178 8C12.0178 10.219 10.219 12.0178 8 12.0178C5.781 12.0178 3.98216 10.219 3.98216 8C3.98216 5.781 5.781 3.98216 8 3.98216C10.219 3.98216 12.0178 5.781 12.0178 8Z" fill="#212121"/></svg>`,
    'rock': `<svg width="16" height="13" viewBox="0 0 16 13" fill="none" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" clip-rule="evenodd" d="M12.3481 5.96116C12.3472 5.95991 12.3468 5.95834 12.347 5.95681L13.3678 0.0047437C13.3683 0.00200307 13.3707 0 13.3734 0H13.6965C13.699 0 13.7012 0.00161565 13.7019 0.00399065L16.0016 7.28534C16.0023 7.28759 16.0015 7.29009 15.9997 7.29156L14.3041 8.61541C14.3015 8.61737 14.2979 8.61688 14.296 8.61428L12.3481 5.96116ZM-0.03125 9.90694C-0.03125 9.90941 -0.0296626 9.91159 -0.0273159 9.91238L3.46797 11.0552C3.46966 11.0558 3.47153 11.0555 3.473 11.0545L11.2858 5.66075C11.2871 5.65984 11.288 5.65844 11.2882 5.65688L12.126 0.0352625C12.1265 0.0318125 12.1238 0.0287125 12.1204 0.0287125H5.20019C5.19847 0.0287125 5.19688 0.0294688 5.19578 0.0307782L-0.0299367 6.33481C-0.0307856 6.33584 -0.03125 6.33712 -0.03125 6.33847V9.90694ZM4.92447 11.3464L8.743 12.5972C8.74472 12.5978 8.74662 12.5975 8.74809 12.5965L13.2943 9.33544C13.2968 9.33366 13.2975 9.33019 13.2957 9.32763L11.5915 6.79153C11.5897 6.78888 11.5862 6.78819 11.5835 6.79L4.92447 11.3464Z" fill="#212121"/></svg>`,
    'ground': `<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><g clip-path="url(#clip0_52_36666)"><path fill-rule="evenodd" clip-rule="evenodd" d="M3.52387 13.7423C3.51953 13.7423 3.5165 13.738 3.51794 13.7339L7.60278 2.19169C7.60369 2.18918 7.60606 2.1875 7.60872 2.1875H11.9694C11.9721 2.1875 11.9745 2.18919 11.9753 2.19172L15.9996 13.734C16.001 13.7381 15.998 13.7423 15.9937 13.7423H3.64663H3.52387ZM0.00629081 13.7875C0.00190351 13.7875 -0.00113391 13.7831 0.000405023 13.779L3.04227 5.658C3.04319 5.65553 3.04553 5.65391 3.04816 5.65391H5.69119C5.69556 5.65391 5.69859 5.65825 5.69709 5.66234L2.7557 13.7833C2.7548 13.7858 2.75243 13.7875 2.74979 13.7875H0.00629081Z" fill="#212121"/></g><defs><clipPath id="clip0_52_36666"><rect width="16" height="16" fill="white"/></clipPath></defs></svg>`,
    'fighting': `<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><g clip-path="url(#clip0_52_36660)"><path fill-rule="evenodd" clip-rule="evenodd" d="M2.7573 1.33018C2.95093 0.565669 3.64353 0 4.46822 0C5.08681 0 5.63109 0.318272 5.94622 0.8H6.46225C6.78284 0.470987 7.23075 0.266667 7.72641 0.266667C8.45309 0.266667 9.07722 0.705881 9.34778 1.33333H9.77981C10.0505 1.16433 10.3704 1.06667 10.7131 1.06667C11.4398 1.06667 12.0639 1.50588 12.3344 2.13333H13.5093C13.5193 2.13333 13.5287 2.13604 13.5368 2.14075C13.5905 2.13584 13.6448 2.13333 13.6997 2.13333C14.6744 2.13333 15.4646 2.92348 15.4646 3.89819V9.19019L15.4646 9.2L15.4646 9.20981V9.28603C15.4646 9.31831 15.4637 9.35047 15.4619 9.38247C15.3558 13.0537 12.0547 16 7.99791 16C3.87419 16 0.53125 12.9555 0.53125 9.2C0.53125 7.38722 1.31015 5.74009 2.5798 4.52109C2.57663 6.28837 2.60648 8.11544 2.74408 8.08409C3.11253 8.00009 2.82466 2.52623 2.7573 1.33018Z" fill="#212121"/></g><defs><clipPath id="clip0_52_36660"><rect width="16" height="16" fill="white"/></clipPath></defs></svg>`,
    'ghost': `<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><g clip-path="url(#clip0_52_36682)"><path fill-rule="evenodd" clip-rule="evenodd" d="M11.5297 15.9446C10.0865 16.0185 8.43425 16.0185 7.87275 15.9446C3.49281 15.3684 0 12.166 0 7.8375C0 3.50897 3.58172 0 8 0C12.4183 0 16 3.50897 16 7.8375C16 9.85066 15.2252 11.6865 13.9519 13.0746C13.6061 13.4515 14.0805 13.7159 14.5626 13.9845C15.0353 14.248 15.5154 14.5155 15.2364 14.8973C14.9289 15.3179 13.2622 15.8559 11.5297 15.9446ZM6.875 6.85781C6.875 7.53412 6.31534 8.08241 5.625 8.08241C4.93466 8.08241 4.375 7.53412 4.375 6.85781C4.375 6.40422 4.62672 6.00825 5.00075 5.79659C5.02228 6.38631 5.50716 6.85778 6.10216 6.85778L6.875 6.85781ZM10.7493 5.79659C10.7277 6.38631 10.2428 6.85778 9.64784 6.85778H8.875C8.875 7.53409 9.43466 8.08241 10.125 8.08241C10.8153 8.08241 11.375 7.53412 11.375 6.85781C11.375 6.40422 11.1233 6.00825 10.7493 5.79659Z" fill="#212121"/></g><defs><clipPath id="clip0_52_36682"><rect width="16" height="16" fill="white"/></clipPath></defs></svg>`,
    'psychic': `<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><g clip-path="url(#clip0_52_36684)"><path fill-rule="evenodd" clip-rule="evenodd" d="M14.2477 13.287C14.2477 13.287 12.2302 14.9051 8.21541 14.2355C5.16947 13.7275 3.54491 10.3698 3.54491 8.56497C3.54491 4.28591 6.71197 3.31213 8.85312 3.31213C10.9942 3.31213 12.391 5.39963 12.391 7.01588C12.391 8.63213 11.2479 10.0458 9.46894 10.0458C7.69 10.0458 7.16312 8.79691 7.16312 7.64869C7.16312 6.5005 8.09209 6.09597 8.93931 6.09597C9.78653 6.09597 10.0766 6.81928 10.0766 7.44094C10.0766 8.06263 9.59428 8.28525 9.19197 8.28525C8.78966 8.28525 8.74987 8.08228 8.59591 7.86897C8.44191 7.65569 8.79228 6.84831 8.21541 6.84831C7.63853 6.84831 7.531 7.77647 7.531 7.77647C7.531 7.77647 7.74131 9.56813 9.46894 9.53722C11.1966 9.50628 12.0162 8.17066 11.778 6.84831C11.5398 5.52594 10.2565 4.12078 8.00416 4.40472C5.75184 4.68866 4.83225 6.96441 5.23759 9.39641C5.64294 11.8284 8.55647 13.2376 10.8472 12.7306C13.1381 12.2236 15.4197 10.5652 15.4197 6.36041C15.4197 2.15559 11.778 -0.371881 7.43566 0.0446606C3.09331 0.4612 0.397781 4.25756 0.570318 8.81897C0.742856 13.3804 5.07109 15.8647 8.73106 15.9927C12.391 16.1208 14.6347 14.0021 14.6347 14.0021C14.6347 14.0021 15.1393 13.5521 14.9415 13.2008C14.7437 12.8494 14.2477 13.287 14.2477 13.287Z" fill="#212121"/></g><defs><clipPath id="clip0_52_36684"><rect width="16" height="16" fill="white"/></clipPath></defs></svg>`,
    'ice': `<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><g clip-path="url(#clip0_52_36668)"><path fill-rule="evenodd" clip-rule="evenodd" d="M12.0094 1.22009L12.0586 5.54354L8.28771 7.35375L8.24121 3.2716L12.0094 1.22009Z" fill="#212121"/><path fill-rule="evenodd" clip-rule="evenodd" d="M15.7894 8.03273L12.0565 10.168L8.32129 8.02936L12.0545 6.06836L15.7894 8.03273Z" fill="#212121"/><path fill-rule="evenodd" clip-rule="evenodd" d="M7.65762 8.03273L3.92465 10.168L0.189453 8.02936L3.92272 6.06836L7.65762 8.03273Z" fill="#212121"/><path fill-rule="evenodd" clip-rule="evenodd" d="M3.88281 1.20239L7.75738 3.12132L7.65831 7.30307L4 5.49126L3.88281 1.20239Z" fill="#212121"/><path fill-rule="evenodd" clip-rule="evenodd" d="M12.1148 14.7977L8.24023 12.8788L8.3393 8.69702L11.9976 10.5089L12.1148 14.7977Z" fill="#212121"/><path fill-rule="evenodd" clip-rule="evenodd" d="M4.01605 14.8367L3.9668 10.5132L7.73777 8.703L7.78427 12.7851L4.01605 14.8367Z" fill="#212121"/></g><defs><clipPath id="clip0_52_36668"><rect width="16" height="16" fill="white"/></clipPath></defs></svg>`,
    'dragon': `<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" clip-rule="evenodd" d="M8.77194 7.96503C8.88038 7.89891 8.97237 7.76034 9.04656 7.60634C10.023 8.00541 10.7091 8.94841 10.7091 10.0481C10.7091 11.5091 9.49819 12.6934 8.00444 12.6934C7.39125 12.6934 6.82572 12.4938 6.37206 12.1575C6.22325 12.087 6.10081 12.0193 6.00063 11.9639C5.84522 11.878 5.74331 11.8217 5.6795 11.8305C5.49297 11.8562 5.54713 12.0278 5.59634 12.1837C5.62975 12.2896 5.66091 12.3883 5.61269 12.429C5.56225 12.4716 5.39888 12.3158 5.20797 12.1338C4.94809 11.886 4.63722 11.5896 4.49063 11.6787C4.37472 11.7491 4.48725 11.94 4.625 12.1738L4.63522 12.1911C4.69341 12.2899 4.76084 12.3906 4.82238 12.4824C4.94747 12.669 5.04822 12.8193 4.99781 12.8448C4.93688 12.8755 4.51231 12.589 4.15453 12.1911C4.01644 12.0376 3.88269 11.8712 3.75838 11.7165V11.7165C3.48628 11.3779 3.25959 11.0959 3.13234 11.1293C2.97927 11.1695 3.09507 11.4852 3.26522 11.7891C3.34478 11.9312 3.43838 12.0758 3.51941 12.2011V12.2012C3.64544 12.396 3.74109 12.5438 3.70641 12.562C3.65959 12.5865 3.24769 12.1848 2.96792 11.6787C2.80175 11.378 2.66222 11.0457 2.54925 10.7768C2.42675 10.4851 2.3355 10.2678 2.27541 10.2459C2.06664 10.1699 2.06664 10.5956 2.15037 11.2099C2.16129 11.2901 2.17756 11.3742 2.19759 11.4598C3.00959 14.087 5.504 16 8.45522 16C12.0651 16 14.9915 13.1379 14.9915 9.60725C14.9915 6.24688 12.3406 3.49209 8.9725 3.23419C8.97675 3.07589 9.05937 2.76197 9.05937 2.76197C9.05937 2.76197 9.65397 1.32335 9.68541 1.01593C9.68747 0.995531 9.68994 0.973359 9.69259 0.949747C9.72962 0.617591 9.79853 0 9.26722 0C8.98347 0 8.85153 0.211083 8.70063 0.452497C8.64269 0.545175 8.58194 0.642328 8.50875 0.733719C7.98163 1.39199 7.09525 2.21403 6.59266 2.65197C5.53034 3.57762 4.48809 4.33838 3.88022 4.78206L3.88019 4.78209C3.60372 4.98387 3.41713 5.12009 3.35938 5.17637C2.92419 5.60063 1.36381 8.41519 1.36381 8.41519C1.36381 8.41519 0.859197 9.31819 1.03856 9.50134C1.21792 9.68447 1.65044 9.6425 1.65044 9.6425C1.65044 9.6425 7.46109 8.30947 7.98131 8.20434C8.12138 8.17603 8.22025 8.15969 8.29616 8.14716C8.50225 8.11313 8.53925 8.107 8.77194 7.96503ZM4.66359 6.252C4.35169 6.54847 3.83441 7.25612 3.83441 7.25612C3.83441 7.25612 4.79578 7.31534 5.32525 6.81206C5.85475 6.30875 5.73344 5.45103 5.73344 5.45103C5.73344 5.45103 4.97547 5.95553 4.66359 6.252Z" fill="#212121"/></svg>`,
    'dark': `<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" clip-rule="evenodd" d="M8.77194 7.96503C8.88038 7.89891 8.97237 7.76034 9.04656 7.60634C10.023 8.00541 10.7091 8.94841 10.7091 10.0481C10.7091 11.5091 9.49819 12.6934 8.00444 12.6934C7.39125 12.6934 6.82572 12.4938 6.37206 12.1575C6.22325 12.087 6.10081 12.0193 6.00063 11.9639C5.84522 11.878 5.74331 11.8217 5.6795 11.8305C5.49297 11.8562 5.54713 12.0278 5.59634 12.1837C5.62975 12.2896 5.66091 12.3883 5.61269 12.429C5.56225 12.4716 5.39888 12.3158 5.20797 12.1338C4.94809 11.886 4.63722 11.5896 4.49063 11.6787C4.37472 11.7491 4.48725 11.94 4.625 12.1738L4.63522 12.1911C4.69341 12.2899 4.76084 12.3906 4.82238 12.4824C4.94747 12.669 5.04822 12.8193 4.99781 12.8448C4.93688 12.8755 4.51231 12.589 4.15453 12.1911C4.01644 12.0376 3.88269 11.8712 3.75838 11.7165V11.7165C3.48628 11.3779 3.25959 11.0959 3.13234 11.1293C2.97927 11.1695 3.09507 11.4852 3.26522 11.7891C3.34478 11.9312 3.43838 12.0758 3.51941 12.2011V12.2012C3.64544 12.396 3.74109 12.5438 3.70641 12.562C3.65959 12.5865 3.24769 12.1848 2.96792 11.6787C2.80175 11.378 2.66222 11.0457 2.54925 10.7768C2.42675 10.4851 2.3355 10.2678 2.27541 10.2459C2.06664 10.1699 2.06664 10.5956 2.15037 11.2099C2.16129 11.2901 2.17756 11.3742 2.19759 11.4598C3.00959 14.087 5.504 16 8.45522 16C12.0651 16 14.9915 13.1379 14.9915 9.60725C14.9915 6.24688 12.3406 3.49209 8.9725 3.23419C8.97675 3.07589 9.05937 2.76197 9.05937 2.76197C9.05937 2.76197 9.65397 1.32335 9.68541 1.01593C9.68747 0.995531 9.68994 0.973359 9.69259 0.949747C9.72962 0.617591 9.79853 0 9.26722 0C8.98347 0 8.85153 0.211083 8.70063 0.452497C8.64269 0.545175 8.58194 0.642328 8.50875 0.733719C7.98163 1.39199 7.09525 2.21403 6.59266 2.65197C5.53034 3.57762 4.48809 4.33838 3.88022 4.78206L3.88019 4.78209C3.60372 4.98387 3.41713 5.12009 3.35938 5.17637C2.92419 5.60063 1.36381 8.41519 1.36381 8.41519C1.36381 8.41519 0.859197 9.31819 1.03856 9.50134C1.21792 9.68447 1.65044 9.6425 1.65044 9.6425C1.65044 9.6425 7.46109 8.30947 7.98131 8.20434C8.12138 8.17603 8.22025 8.15969 8.29616 8.14716C8.50225 8.11313 8.53925 8.107 8.77194 7.96503ZM4.66359 6.252C4.35169 6.54847 3.83441 7.25612 3.83441 7.25612C3.83441 7.25612 4.79578 7.31534 5.32525 6.81206C5.85475 6.30875 5.73344 5.45103 5.73344 5.45103C5.73344 5.45103 4.97547 5.95553 4.66359 6.252Z" fill="#212121"/></svg>`,
    'fairy': `<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" clip-rule="evenodd" d="M3.21019 12.6868L5.7765 11.9427L7.99306 15.9955C7.99597 16.0008 8.0035 16.0008 8.00638 15.9955L10.2229 11.9427L12.7893 12.6868C12.795 12.6885 12.8004 12.6831 12.7987 12.6774L12.0544 10.1618L15.9955 8.00638C16.0008 8.0035 16.0008 7.99597 15.9955 7.99309L12.0219 5.81984L12.7987 3.19453C12.8004 3.18878 12.795 3.18344 12.7893 3.18509L10.1628 3.94669L8.00638 0.00394338C8.0035 -0.00131436 7.99597 -0.00131451 7.99309 0.00394325L5.83672 3.94669L3.21019 3.18509C3.20444 3.18344 3.19909 3.18878 3.20081 3.19453L3.97753 5.81984L0.00394338 7.99309C-0.00131436 7.99597 -0.00131451 8.0035 0.00394325 8.00638L3.94503 10.1618L3.20081 12.6774C3.19909 12.6831 3.20444 12.6885 3.21019 12.6868ZM5.20162 8.02738L7.01972 9.02172L8.01406 10.8398C8.01694 10.8451 8.0245 10.8451 8.02738 10.8398L9.02172 9.02172L10.8398 8.02738C10.845 8.0245 10.845 8.01694 10.8398 8.01406L9.02172 7.01972L8.02738 5.20166C8.0245 5.19637 8.01694 5.19637 8.01406 5.20166L7.01972 7.01972L5.20162 8.01406C5.19637 8.01694 5.19637 8.0245 5.20162 8.02738Z" fill="#212121"/></svg>`,
    'electric': `<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><path fill-rule="evenodd" clip-rule="evenodd" d="M4.76741 0.0182393C4.76432 0.00931125 4.77097 0 4.78041 0H10.4001C10.4061 0 10.4114 0.00392459 10.4132 0.00968069L12.9944 8.34909C12.9971 8.35794 12.9905 8.36691 12.9813 8.36691H9.24003C9.23547 8.36691 9.23219 8.37125 9.23344 8.37566L11.3791 15.9289C11.3833 15.9436 11.3641 15.9532 11.3549 15.941L3.01646 4.85209C3.00964 4.84303 3.01611 4.83009 3.02744 4.83009H6.42291C6.42763 4.83009 6.43094 4.82544 6.42938 4.82097L4.76741 0.0182393Z" fill="#212121"/></svg>`,
    'steel': `<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg"><g clip-path="url(#clip0_52_36676)"><path fill-rule="evenodd" clip-rule="evenodd" d="M0.00159721 7.95397C-0.000531394 7.95034 -0.000532462 7.94584 0.00159436 7.94219L4.02484 1.06826C4.02694 1.06469 4.03078 1.0625 4.03491 1.0625H12.0092C12.0133 1.0625 12.0172 1.06471 12.0193 1.06831L15.9984 7.94225C16.0005 7.94584 16.0005 7.95031 15.9984 7.95391L12.0193 14.8201C12.0172 14.8237 12.0133 14.8259 12.0092 14.8259H4.03491C4.03078 14.8259 4.02694 14.8238 4.02484 14.8202L0.00159721 7.95397ZM11.7068 7.94422C11.7068 9.99072 10.0478 11.6497 8.00125 11.6497C5.95475 11.6497 4.29572 9.99072 4.29572 7.94422C4.29572 5.89769 5.95475 4.23869 8.00125 4.23869C10.0478 4.23869 11.7068 5.89769 11.7068 7.94422Z" fill="#212121"/></g><defs><clipPath id="clip0_52_36676"><rect width="16" height="16" fill="white"/></clipPath></defs></svg>`,
};

// ===== RENDER CARD =====
function renderPokemon(pokemon) {

    const card = document.createElement("div");
    card.classList.add("pokemon-card");

    // ===== CARD BACKGROUND =====
    const mainType = pokemon.types[0].type.name;

    if (mainType === "flying") {
        card.style.background =
            "linear-gradient(to bottom, #CBE9ff, #2299EE)";
    } else {
        card.style.background =
            backgroundColors[mainType];
    }

    // ===== Image =====
    const image = document.createElement("img");
    image.src = pokemon.sprites.other["official-artwork"].front_default;
    image.classList.add("pokemon-img");

    // ===== Name =====
    const name = document.createElement("h3");
    name.textContent = capitalize(pokemon.name);

    // ===== ID =====
    const id = document.createElement("p");
    id.textContent =
        "#" + String(pokemon.id).padStart(3, "0");

    // ===== Type Container =====
    const typeContainer = document.createElement("div");
    typeContainer.classList.add("pokemon-types");

    pokemon.types.forEach(typeObj => {

        const typeName = typeObj.type.name;

        const badge = document.createElement("span");
        badge.classList.add("type-badge");


        const iconWrapper = document.createElement("span");
        iconWrapper.classList.add("type-icon");
        iconWrapper.innerHTML = pokemonIcons[typeName] || "";

        const text = document.createElement("span");
        text.textContent = capitalize(typeName);

        badge.appendChild(iconWrapper);
        badge.appendChild(text);

        if (typeName === "flying") {
            badge.style.background =
                "linear-gradient(to bottom, #CBE9FF, #2299EE)";
            badge.style.color = "rgba(33, 33, 33, 1)";
        } else {
            badge.style.background =
                tagColors[typeName];
        }

        typeContainer.appendChild(badge);
    });

    card.appendChild(image);
    card.appendChild(name);
    card.appendChild(id);
    card.appendChild(typeContainer);

    card.addEventListener("click", () => {
        openModal(pokemon);
    });

    cardsContainer.appendChild(card);
}

// ===== INIT =====
fetchPokemons();

// ===== SEARCH =====
function performSearch(value) {

    const searchValue = value.toLowerCase().trim();

    cardsContainer.innerHTML = "";

    // ✅ If empty → reset to full list
    if (searchValue === "") {
        displayedPokemons = [...allPokemons];   // VERY IMPORTANT
        displayedPokemons.forEach(renderPokemon);
        return;
    }

    // ✅ Filter from full dataset
    const filtered = allPokemons.filter(pokemon =>
        pokemon.name.toLowerCase().includes(searchValue) ||
        String(pokemon.id).includes(searchValue) ||
        pokemon.types.some(t =>
            t.type.name.toLowerCase().includes(searchValue)
        )
    );

    // ✅ Save filtered state
    displayedPokemons = filtered;

    // ✅ Render results
    if (filtered.length === 0) {
        renderSearchEmpty();
        return;
    }

    filtered.forEach(renderPokemon);
}

// enter event
const searchInput = document.getElementById("searchInput");

searchInput.addEventListener("keydown", function (e) {
    if (e.key === "Enter") {
        performSearch(this.value);
    }
});

// button click event
const searchBtn = document.getElementById("searchBtn");

searchBtn.addEventListener("click", function () {
    performSearch(searchInput.value);
});

// sort logic
const sortSelect = document.getElementById("sortSelect");

sortSelect.addEventListener("change", function () {
    sortPokemons(this.value);
});

function sortPokemons(type) {

    let currentList = [...allPokemons];

    switch (type) {

        case "number-asc":
            currentList.sort((a, b) => a.id - b.id);
            break;

        case "number-desc":
            currentList.sort((a, b) => b.id - a.id);
            break;

        case "name-asc":
            currentList.sort((a, b) =>
                a.name.localeCompare(b.name)
            );
            break;

        case "name-desc":
            currentList.sort((a, b) =>
                b.name.localeCompare(a.name)
            );
            break;
    }

    cardsContainer.innerHTML = "";
    currentList.forEach(renderPokemon);
}

const filterBtn = document.getElementById("filterBtn");
const panel = document.getElementById("filterPanel");
const overlay = document.getElementById("overlay");
const closeBtn = document.getElementById("filterClose");

filterBtn.addEventListener("click", () => {
    panel.classList.remove("hidden");
    panel.classList.add("active");
    overlay.classList.add("active");
});

closeBtn.addEventListener("click", closePanel);

function closePanel() {
    panel.classList.remove("active");

    setTimeout(() => {
        panel.classList.add("hidden");

        if (modal.classList.contains("hidden")) {
            overlay.classList.remove("active");
        }

    }, 350);
}

const typeContainer = document.getElementById("typeFilters");

Object.keys(backgroundColors).forEach(type => {

    const label = document.createElement("label");
    label.classList.add("filter-option");

    label.innerHTML = `
        <input type="checkbox" value="${type}">
        ${capitalize(type)}
    `;

    typeContainer.appendChild(label);
});

const applyBtn = document.getElementById("filterApply");
const resetBtn = document.getElementById("filterReset");

applyBtn.addEventListener("click", () => {

    const selected = [
        ...document.querySelectorAll("#typeFilters input:checked")
    ].map(cb => cb.value);

    let filtered = allPokemons;

    if (selected.length > 0) {
        filtered = allPokemons.filter(pokemon =>
            pokemon.types.some(t =>
                selected.includes(t.type.name)
            )
        );
    }

    cardsContainer.innerHTML = "";
    filtered.forEach(renderPokemon);

    closePanel();
});

resetBtn.addEventListener("click", () => {
    document
        .querySelectorAll("#typeFilters input")
        .forEach(cb => cb.checked = false);
});

// modal 

const modal = document.getElementById("modal");
const backBtn = document.querySelector(".back-btn");

backBtn.addEventListener("click", () => {
    closeModal();
});

modal.addEventListener("click", (e) => {
    if (e.target === modal) {
        closeModal();
    }
});


document.addEventListener("keydown", (e) => {
    if (e.key === "Escape") {
        if (modal.classList.contains("active")) {
            closeModal();
        }
        if (panel.classList.contains("active")) {
            closePanel();
        }
    }
});

async function openModal(pokemon) {

    const mainType = pokemon.types[0].type.name;
    const color = backgroundColors[mainType] || "#999";

    document.querySelector(".modal-header").style.background = color;

    document.getElementById("modalName").textContent = capitalize(pokemon.name);

    document.getElementById("modalId").textContent =
        "#" + pokemon.id.toString().padStart(3, "0");

    document.getElementById("modalImage").src =
        pokemon.sprites.other["official-artwork"].front_default;

    document.getElementById("modalTypes").innerHTML =
        pokemon.types.map(t => {

            const typeName = t.type.name;
            const icon = pokemonIcons[typeName] || "";

            let background;

            if (Array.isArray(tagColors[typeName])) {
                // gradient (flying)
                background = `linear-gradient(to bottom, ${tagColors[typeName][0]}, ${tagColors[typeName][1]})`;
            } else {
                background = tagColors[typeName] || "#ccc";
            }

            return `  
                <span class="type-badge" style="background:${background}">
                    <span class="type-icon">${icon}</span>
                    <span class="type-text">
                        ${capitalize(typeName)}
                    </span>
                </span>
                `;
        }).join("");

    let genus = "Unknown Pokemon";

    try {
        const speciesRes = await fetch(pokemon.species.url);
        const speciesData = await speciesRes.json();

        const genusObj =
            speciesData.genera.find(g => g.language.name === "en");

        if (genusObj) {
            genus = genusObj.genus;
        }

    } catch (error) {
        console.error("Species fetch error:", error);
    }

    currentPokemon = pokemon;
    currentGenus = genus;

    showAboutTab(currentPokemon, currentGenus);

    overlay.classList.add("active");
    modal.classList.add("active");

    // base stats

    currentPokemon = pokemon;
    currentGenus = genus;

    document.querySelector('[data-tab="about"]').click();

}

function showAboutTab(pokemon, genus) {

    const tabContent = document.getElementById("tabContent");

    const height = pokemon.height / 10; // meters
    const weight = pokemon.weight / 10; // kg

    tabContent.innerHTML = `
        <div class="about-grid">
            <div class="about-label">Species</div>
            <div class="about-value">${genus}</div>

            <div class="about-label">Height</div>
            <div class="about-value">${height.toFixed(1)} m</div>

            <div class="about-label">Weight</div>
            <div class="about-value">${weight.toFixed(1)} kg</div>

            <div class="about-label">Abilities</div>
            <div class="about-value">
                ${pokemon.abilities.map(a => capitalize(a.ability.name)).join(", ")}
            </div>
        </div>
    `;
}

function closeModal() {
    modal.classList.remove("active");
    overlay.classList.remove("active");
}

// base stats

const tabs = document.querySelectorAll(".tab");

tabs.forEach(tab => {
    tab.addEventListener("click", () => {

        // remove active from all
        tabs.forEach(t => t.classList.remove("active"));

        // add active to clicked tab
        tab.classList.add("active");

        const selectedTab = tab.dataset.tab;

        if (selectedTab === "about") {
            showAboutTab(currentPokemon, currentGenus);
        }

        if (selectedTab === "stats") {
            showStatsTab(currentPokemon);
        }

        if (selectedTab === "evolution") {
            showEvolutionTab(currentPokemon);
        }
    });
});

function showStatsTab(pokemon) {

    const tabContent = document.getElementById("tabContent");

    const total = pokemon.stats.reduce((sum, stat) => {
        return sum + stat.base_stat;
    }, 0);

    const average = Math.round(total / pokemon.stats.length);

    const statsHTML = pokemon.stats.map(stat => {

        const name = formatStatName(stat.stat.name);
        const value = stat.base_stat;

        return `
            <div class="stat-row">
                <div class="stat-name">${name}</div>
                <div class="stat-value">${value}</div>
                <div class="stat-bar">
                    <div class="stat-fill" style="width:${value}%"></div>
                </div>
            </div>
        `;
    }).join("");

    // 👇 ADD AVERAGE AS NORMAL STAT ROW
    const averageRow = `
        <div class="stat-row">
            <div class="stat-name">Average</div>
            <div class="stat-value">${average}</div>
            <div class="stat-bar">
                <div class="stat-fill" style="width:${average}%"></div>
            </div>
        </div>
    `;

    tabContent.innerHTML = `
        <div class="stats-container">
            ${statsHTML}
            ${averageRow}
        </div>
    `;
}

function formatStatName(name) {
    const map = {
        "hp": "HP",
        "attack": "Attack",
        "defense": "Defense",
        "special-attack": "Sp. Atk",
        "special-defense": "Sp. Def",
        "speed": "Speed"
    };

    return map[name] || name;
}

async function showEvolutionTab(pokemon) {

    const tabContent = document.getElementById("tabContent");
    tabContent.innerHTML = "Loading...";

    try {
        const speciesRes = await fetch(pokemon.species.url);
        const speciesData = await speciesRes.json();

        const evoRes = await fetch(speciesData.evolution_chain.url);
        const evoData = await evoRes.json();

        // ✅ 1️⃣ Build evolution list
        const evolutions = [];

        function traverse(chain) {
            evolutions.push(chain.species.name);

            if (chain.evolves_to.length > 0) {
                chain.evolves_to.forEach(evo => traverse(evo));
            }
        }

        traverse(evoData.chain);

        if (evolutions.length === 1) {
            tabContent.innerHTML = `
                <div class="evolution-empty">
                    <div class="empty-circle">
                        <img src="${pokemon.sprites.other["official-artwork"].front_default}">
                    </div>
                    <p class="empty-text">This Pokémon doesn't Evolve</p>
                </div>
            `;
            return;
        }

        // ✅ 3️⃣ Only fetch details if there are evolutions
        const evoDetails = await Promise.all(
            evolutions.map(name =>
                fetch(`https://pokeapi.co/api/v2/pokemon/${name}`)
                    .then(res => res.json())
            )
        );

        // Normal render
        tabContent.innerHTML = `
            <div class="evolution-container">
                ${evoDetails.map((p, index) => `
                    <div class="evo-item">
                        <img src="${p.sprites.other["official-artwork"].front_default}">
                        <div class="evo-name">${capitalize(p.name)}</div>
                    </div>
                    ${index < evoDetails.length - 1 ? `<div class="evo-arrow">→</div>` : ""}
                `).join("")}
            </div>
        `;

    } catch (error) {
        tabContent.innerHTML = `
            <div class="evolution-empty">
                <div class="empty-circle">
                    <img src="${pokemon.sprites.other["official-artwork"].front_default}">
                </div>
                <p class="empty-text">This Pokémon doesn't Evolve</p>
            </div>
        `;
    }
}

function renderSearchEmpty() {
    const grid = document.getElementById("cards");

    grid.innerHTML = `
        <div class="search-empty">
            <div class="search-empty-icon">🔍</div>
            <p class="search-empty-text">
                No Pokémon matched your search!
            </p>
        </div>
    `;
}