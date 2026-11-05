## 1. Experiment Title
Decisions and Loops with Numbers

---

## 2. Aim
Use if, else if and loops to make decisions and repeat steps with whole numbers.

---

## 3. Software / Tools Required
- **Operating System:** Windows 10 / Windows 11
- **Integrated Development Environment (IDE):** Visual Studio Code (VS Code) with Extension Pack for Java
- **Java Development Kit (JDK):** OpenJDK 17 (Temurin-17.0.13+11)
- **Terminal Shell:** Windows PowerShell (pwsh)
- **Build / Execution Commands:** `javac Main.java` (compiler) and `java Main` (JVM execution)

---

## 4. Theory
Control flow statements regulate the execution path of a program based on runtime conditions. Conditional statements like 'if' and 'if-else' evaluate boolean expressions. Multi-branch decisions are handled using 'else-if' ladders. Loops (such as 'for', 'while', and 'do-while') execute a block of statements repeatedly until a termination condition is reached. In arithmetic algorithms, loops enable iterative calculations like factorials, while modulo arithmetic (%) helps test divisibility and parity.

---

## 5. Algorithm / Procedure (question-wise)

### Question 1: Check Even or Odd Number
1. Start the program.
2. Store 27 in integer variable n.
3. Check condition: if (n % 2 == 0), print n + ' is even'.
4. Otherwise, print n + ' is odd'.
5. Terminate the program.

### Question 2: Calculate Grade using Else-If Ladder
1. Start the program.
2. Store 83 in integer variable marks.
3. If marks >= 90, print 'Grade: A'.
4. Else if marks >= 75, print 'Grade: B'.
5. Else, print 'Grade: C'.
6. Terminate the program.

### Question 3: Check Leap Year
1. Start the program.
2. Store 2024 in integer variable year.
3. Check condition: ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)).
4. If true, print 'Leap year'; otherwise, print 'Not a leap year'.
5. Terminate the program.

### Question 4: Find Factorial Using For Loop
1. Start the program.
2. Initialize integer variable n = 5 and fact = 1.
3. Iterate variable i from 1 to n with step 1: multiply fact by i.
4. Print 'Factorial of 5 is ' followed by fact.
5. Terminate the program.

---

## 6. Input (question-wise)
- **Question 1:** Static value: n = 27.
- **Question 2:** Static value: marks = 83.
- **Question 3:** Static value: year = 2024.
- **Question 4:** Static value: n = 5.

---

## 7. Output (question-wise)

### Question 1: Output
```
27 is odd
```

### Question 2: Output
```
Grade: B
```

### Question 3: Output
```
Leap year
```

### Question 4: Output
```
Factorial of 5 is 120
```

---

## 8. Result
All programs of Assignment 2 were successfully written, compiled, and executed in Visual Studio Code. The output produced by each program completely satisfied the problem specifications and matched the expected sample outputs.
