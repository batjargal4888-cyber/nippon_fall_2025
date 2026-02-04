# Week 2 — Thursday
## Pseudocode Exercises: Loops (FOR / WHILE)

### Exercise 1: Count from 1 to 10
This algorithm prints numbers from 1 to 10.

```text
BEGIN
  FOR i = 1 TO 10
    OUTPUT i
  END FOR
END
```

### Exercise 2: Say Hello 5 Times
This algorithm prints "Hello" 5 times.

```text
BEGIN
  FOR counter = 1 TO 5
    OUTPUT "Hello"
  END FOR
END
```

### Exercise 3: Countdown
This algorithm counts down from 5 to 1 & then prints "Liftoff!".

```text
BEGIN
  FOR counter = 5 TO 1
    OUTPUT counter
  END FOR
  OUTPUT "Liftoff!"
END
```

### Exercise 4: Even Numbers Only
This algorithm prints even numbers between 1 & 10.

```text
BEGIN
  FOR i = 1 TO 10
    IF i MOD 2 == 0
      OUTPUT i
    END IF
  END FOR
END
```

### Exercise 5: Sum from 1 to 5
This algorithm calculates the sum of numbers from 1 to 5.

```text
BEGIN
  sum = 0
  FOR i = 1 TO 5
    sum = sum + i
  END FOR
  OUTPUT sum
END
```

### Exercise 6: Password Check
This algorithm keeps asking for a password until it is correct.

```text
BEGIN
  WHILE true
    INPUT password
    IF password == "password"
      OUTPUT "Logged in."
      BREAK
    END IF
  END WHILE
END
```

### Exercise 7: Stop Command
This algorithm keeps asking for input until the user types "stop".

```text
BEGIN
  WHILE true
    INPUT word
    IF word == "stop"
      BREAK
    END IF
  END WHILE
END
```

### Exercise 8: Multiplication Table
This algorithm prints the multiplication table of a given number.

```text
BEGIN
  INPUT number
  FOR i = 1 TO 10
    OUTPUT number * i
  END FOR
END
```

### Exercise 9: Greet 3 Names
This algorithm asks for 3 names & greet each 1.

```text
BEGIN
  FOR i = 1 TO 3
    INPUT name
    OUTPUT "Hello, " + name
  END FOR
END
```

### Exercise 10: Sum Until Zero
This algorithm sums numbers until the user enters 0.

```text
BEGIN
  sum = 0
  WHILE true
    INPUT number
    IF number == 0
      BREAK
    END IF
    sum = sum + number
  END while
  OUTPUT sum
END
```
