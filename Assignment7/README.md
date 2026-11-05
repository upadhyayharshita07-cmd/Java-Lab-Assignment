## 1. Experiment Title
Counting Steps and Complexity

---

## 2. Aim
Count the steps a program takes, and write its time complexity as a comment.

---

## 3. Software / Tools Required
- **Operating System:** Windows 10 / Windows 11
- **Integrated Development Environment (IDE):** Visual Studio Code (VS Code) with Extension Pack for Java
- **Java Development Kit (JDK):** OpenJDK 17 (Temurin-17.0.13+11)
- **Terminal Shell:** Windows PowerShell (pwsh)
- **Build / Execution Commands:** `javac Main.java` (compiler) and `java Main` (JVM execution)

---

## 4. Theory
Time complexity quantifies the amount of time an algorithm takes to run as a function of the input size (n). Big O notation describes the upper bound of the growth rate of an algorithm's execution time. A single loop running n times executes in O(n) linear time. Two nested loops each iterating n times execute in O(n * n) = O(n^2) quadratic time. A loop that repeatedly divides an input by 2 executes in O(log n) logarithmic time because the problem size is halved at each step.

---

## 5. Algorithm / Procedure (question-wise)

### Question 1: Count Steps of Single Loop - Linear Complexity O(n)
1. Start the program.
2. Initialize step counter steps = 0.
3. Above the loop, write comment // Time Complexity: O(n).
4. Run loop from i = 1 to 10: increment steps.
5. Print 'Steps: ' followed by steps.
6. Terminate the program.

### Question 2: Count Steps of Nested Loops - Quadratic Complexity O(n^2)
1. Start the program.
2. Initialize counter steps = 0.
3. Write comment // Time Complexity: O(n^2).
4. Outer loop i from 1 to 10; inner loop j from 1 to 10: increment steps.
5. Print 'Steps: ' followed by steps.
6. Terminate the program.

### Question 3: Count Halving Steps - Logarithmic Complexity O(log n)
1. Start the program.
2. Initialize n = 1024, count = 0.
3. Write comment // Time Complexity: O(log n).
4. While loop condition (n > 1): divide n by 2 and increment count.
5. Print 'Halving steps: ' followed by count.
6. Terminate the program.

---

## 6. Input (question-wise)
- **Question 1:** Range: 1 to 10.
- **Question 2:** Nested bounds: 10 x 10 iterations.
- **Question 3:** Initial value: n = 1024.

---

## 7. Output (question-wise)

### Question 1: Output
```
Steps: 10
```

### Question 2: Output
```
Steps: 100
```

### Question 3: Output
```
Halving steps: 10
```

---

## 8. Result
All programs of Assignment 7 were successfully written, compiled, and executed in Visual Studio Code. The output produced by each program completely satisfied the problem specifications and matched the expected sample outputs.
