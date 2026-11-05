## 1. Experiment Title
Arrays: Traversal and Counting

---

## 2. Aim
Create an array, visit every element with a loop, and add up or count the values.

---

## 3. Software / Tools Required
- **Operating System:** Windows 10 / Windows 11
- **Integrated Development Environment (IDE):** Visual Studio Code (VS Code) with Extension Pack for Java
- **Java Development Kit (JDK):** OpenJDK 17 (Temurin-17.0.13+11)
- **Terminal Shell:** Windows PowerShell (pwsh)
- **Build / Execution Commands:** `javac Main.java` (compiler) and `java Main` (JVM execution)

---

## 4. Theory
An array in Java is a linear, fixed-size data structure that holds elements of the same data type in contiguous memory locations. Arrays are zero-indexed, meaning the first element is at index 0 and the last element is at index 'length - 1'. The '.length' property provides the total count of elements. Array traversal involves iterating through each index using loops to read, accumulate, aggregate (sum, max, min), or filter values satisfying given criteria.

---

## 5. Algorithm / Procedure (question-wise)

### Question 1: Traverse Array and Print Index with Value
1. Start the program.
2. Initialize array arr with values {3, 4, 5}.
3. Loop with index i from 0 up to arr.length - 1.
4. Print 'Index ' + i + ': ' + arr[i].
5. Terminate the program.

### Question 2: Sum and Largest Element in Array
1. Start the program.
2. Initialize array with values {12, 45, 7, 33, 21}.
3. Initialize sum = 0, largest = arr[0].
4. Loop through each element: add arr[i] to sum; if arr[i] > largest, update largest = arr[i].
5. Print 'Sum: ' followed by sum.
6. Print 'Largest: ' followed by largest.
7. Terminate the program.

### Question 3: Count Elements Greater Than 10
1. Start the program.
2. Initialize array with values {5, 12, 2, 14, 7}.
3. Initialize count = 0.
4. Iterate through each element: if arr[i] > 10, increment count by 1.
5. Print 'Count greater than 10: ' followed by count.
6. Terminate the program.

---

## 6. Input (question-wise)
- **Question 1:** Array elements: {3, 4, 5}.
- **Question 2:** Array elements: {12, 45, 7, 33, 21}.
- **Question 3:** Array elements: {5, 12, 2, 14, 7}.

---

## 7. Output (question-wise)

### Question 1: Output
```
Index 0: 3
Index 1: 4
Index 2: 5
```

### Question 2: Output
```
Sum: 118
Largest: 45
```

### Question 3: Output
```
Count greater than 10: 2
```

---

## 8. Result
All programs of Assignment 5 were successfully written, compiled, and executed in Visual Studio Code. The output produced by each program completely satisfied the problem specifications and matched the expected sample outputs.
