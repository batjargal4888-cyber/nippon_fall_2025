# Week 2 — Wednesday
## Pseudocode Exercises: IF / ELSE

These exercises practice **conditional logic** using pseudocode.
Focus is on **decision-making & program flow**, not syntax.

---

## Exercise 1: Age Check

**Problem:**  
Ask the user for their age.  
If age is 18 or above, print “You are an adult.”  
Otherwise, print “You are a minor.”

START
    Ask user for age
    IF age >= 18
        PRINT "You're an adult."
    ELSE
        PRINT "You're a minor."
END

---

## Exercise 2: Positive, Negative, or Zero

**Problem:**  
Ask the user for a number and determine whether it is positive, negative, or zero.

START
    Ask user for a number
    IF number > 0
        PRINT "Positive"
    ELSE IF number < 0
        PRINT "Negative"
    ELSE
        PRINT "Zero"
END
 
---

## Exercise 3: Exam Result

**Problem:**  
Ask the user for an exam score (0–100).  
If the score is 60 or higher, print “Passed”.  
Otherwise, print “Failed”.

START
    Ask user for score
    IF score >=60
        PRINT "Passed"
    ELSE
        PRINT "Failed"
END

---

## Exercise 4: Traffic Light

**Problem:**  
Ask the user for a traffic light color (“red”, “yellow”, “green”).  
Print the corresponding action.

START
    Ask user for traffic light color
    IF color == "red"
        PRINT "Stop"
    ELSE IF color == "yellow"
        PRINT "Wait"
    ELSE IF color == "green"
        PRINT "Go"
END

---

## Exercise 5: Weekend Check

**Problem:**  
Ask the user for a day of the week.  
If it is Saturday or Sunday, print “Weekend”.  
Otherwise, print “Weekday”.

START
    Ask user for day of the week
    IF day == "Saturday" OR day == "Sunday"
        PRINT "Weekend"
    ELSE
        PRINT "Weekday
END

---

## Exercise 6: Simple Login

**Problem:**  
Ask the user for a username and password.  
If username is “admin” AND password is “pass123”, print success message.  
Otherwise, print error message.

START
    Ask the user for username
    Ask the user for password
    IF username == "admin" AND password == "pass123"
        PRINT "Login successful."
    ELSE
        PRINT "Invalid username or password."
END

---

## Exercise 7: Discount Check

**Problem:**  
Ask the user for a purchase amount.  
If the amount is greater than 100,000, print “10% discount applied”.  
Otherwise, print “No discount”.

START
    Ask user for purchase amount
    IF amount > 100000
        PRINT "10% discount applied."
    ELSE 
        PRINT "No discount."
END

---

## Exercise 8: Water State

**Problem:**  
Ask the user for temperature in Celsius.  
Determine the state of water.

START
    Ask user for temperature
    IF temperature <= 0
        PRINT "Water is frozen (Ice)."
    ELSE IF temperature >= 100
        PRINT "Water is boiling (Steam)."
    ELSE 
        PRINT "Water liquid."
END

---

## Exercise 9: Empty Input Check

**Problem:**  
Ask the user to enter text.  
If the input is empty, print a warning message.  
Otherwise, print the entered text.

START
    Ask user to enter text
    IF input is empty
        PRINT "You entered nothing."
    ELSE
        PRINT "You entered: " + input
END

---

## Exercise 10: Movie Ticket Price

**Problem:**  
Ask the user for age and determine ticket price.

START
    Ask user for age
    IF age < 12
        PRINT "Ticket price: 5,000 ₮"
    ELSE IF age > 60
        PRINT "Ticket price: 7,000 ₮"
    ELSE
        PRINT "Ticket price: 10,000 ₮"
END