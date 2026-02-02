# Week 2 - Tuesday
## Machine learning: Binary & Data

### 🎯 Daily Goal
Understand how all data inside a computer is represented using **1s & 0s**, learn the **binary number system**, & understand how **test is encoded using ASCII**.

---

## 1. Everything in a Computer is Binary

- Computers do not understand numbers, letters, or images directly.
- They only understand **binary states**:
  - `1` = ON
  - `0` = OFF
- All data (numbers, text, program, files) is stored as **bit patterns**.

Key idea:
> Different data types are just different interpretations of the same bits.

---

## 2. Bits & Bytes

- **Bit** = smallest unit of data (`0` or `1`)
- **Byte** = 8 bits
- Bytes are the basic unit for storing data

Example:
- `01000001` (8 bits) = 1 byte

---

## 3. Numbers Systems

### Decimal (Base 10)
- Used by humans
- Digits: `0-9`

### Binary (Base 2)
- Used by computers
- Digits: `0` & `1`
- Each position represents a power of 2

Example:
- Binary `1010` = Decimal `10`

### Hexadecimal (Base 16)
- Compact representaion of binary
- Digits: `0-9` & `A-F`
- Often used for memory addresses, colors, debugging

Example:
- Binary `1010` = Hex `A`

---

## 4. Binary place values

Each binary digit represents a power of 2:

| Position | Value |
|----------|-------|
|   1st    |   1   |
|   2nd    |   2   |
|   3rd    |   4   |
|   4th    |   8   |
|   5th    |  16   |

Examples:
- Binary `1101`
- = 8 + 4 + 1
- = Decimal `13`

---

## 5. How Text Is Stored (ASCII)

- Text characters are stored as **numbers**
- ASCII assigns a number to each character
- That number is stored in binary

Examples:
- `A` -> 65 -> `01000001`
- `a` -> 97
- Space, newline, & tab are also characters

Importand:
- Uppercase & lowercase letters have different codes
- Text files are just sequences of bytes

---

## 6. Why This Matters

- Explains how terminals display text
- Helps understand file encoding issues
- Foundation forr:
  - Shel
  - Git
  - Memory
  - Debugging
  - Permissions

  Core insight:
  > Inside a computer, there are no letters or numbers - only bits.