## Javascript Conclusion (Theory Day 2)

This session focused on building a strong foundation in **Javascript control flow & DOM manipulation**.
The goal was to understand **How JS controls logic** & **How it dynamically interacts with HTML elements in the browser**.

---

### 1. Loops (for, while, do...while)

I practiced different looping mechanisms to repeatedly execute code:

- **for loop**
    - Used when the number of iteration is known
    - Learned initialization, conditions, & increment
    - Iterated over arrays using index
    - Used `break` to stop loops early
    - Used `continue` to skip specific iteration

- **while loop**
    - Used when the number of iterations is not known in advance
    - Loop continues while a condition is true

- **do...while loop**
    - Ensures the code runs at least once before checking the condition

These concepts helped me understand how JS controls repetitive logic & flow.

---

### 2. Switch Statement

I learned how to use `switch...case` as an alternative to `if...else`.

- Compared `switch` vs `if...else`
- Used `case`, `break`, & `default`
- Handled multiple cases with the same result (fall-through)
- Applied switch logic to:
    - Days of the week
    - String values
    - Grade calculation
    - Role based access logic

This improved code readability when checking fixed values.

---

### 3. DOM Content Manipulation

I worked with element content using:

- `textContent` -> safe text manipulation
- `innerHTML` -> rendering HTML (with XSS awareness)
- `innerText` -> visible text only

I learned the difference between **reading vs writing content** & when each property should be used.

---

### 4. Element Attributes

I manipulated HTML attributes using:
- `getAttributes`, `setAttributes`, `removeAttributes`
- Direct properties like `href`, `src`, `id`, `className`
- `data-*` attributes via dataset

This allowed me to dynamically change links, images, & custom date.

---

### 5. Element Styles & classlist

I styled elements dynamically using:

- Inline styles via `element.style`:
    - `add`
    - `remove`
    - `toggle`
    - `contain`
    - `replace`

I learned that **classlist is best for UI state changes**, while inline styles are better for dynamic values.

---

### 6. Creating & Removing ELements

I practiced full DOM element lifecycles:

1. **Create** elements using `document.createElement`
2. **Configure** them using text, classes, attributes, & events
3. **Insert** them into the DOM using:
    - `appendChild`
    - `prepend`
    - `insertBefore`
    - `insertAdjacentHTML`

I also learned how to remove elements using:
- `remove()`
- `removeChild()`

---

### 7. Practical Components

Using the concepts above, I built:

- Dynamic **Todo items**
- Reusable **Card components**
- Delete functionality using event handlers
- Functions that return DOM elements for reuse

This connected JS logic with real UI behavior.

---

## Overall Outcome

By the end of this session, I understand how JS:

- Controls program flow using loops & conditions
- Dynamically reads, modifies, creates, & removes HTML elements
- Manages UI state through classes and events
- Builds interactive, reusable components in the browser

This session built the foundation for **interactive frontend development**.