## 1. Experiment Title
Matrices: Rows and Columns

---

## 2. Aim
Visit the rows and columns of a matrix with nested loops to print, add and count its values.

---

## 3. Software / Tools Required
- **Operating System:** Windows 10 / Windows 11
- **Integrated Development Environment (IDE):** Visual Studio Code (VS Code) with Extension Pack for Java
- **Java Development Kit (JDK):** OpenJDK 17 (Temurin-17.0.13+11)
- **Terminal Shell:** Windows PowerShell (pwsh)
- **Build / Execution Commands:** `javac Main.java` (compiler) and `java Main` (JVM execution)

---

## 4. Theory
Column-major traversal swaps the loop nesting order relative to standard row-major traversal: the outer loop iterates through columns while the inner loop iterates through rows ('matrix[i][j]'). This allows aggregating column sums. Boundary row extraction isolates index 0 (first row) and index 'rows - 1' (last row). Conditional element counting traverses the entire 2D structure, incrementing a tally for elements satisfying threshold tests.

---

## 5. Algorithm / Procedure (question-wise)

### Question 1: Print First and Last Rows of Matrix
1. Start the program.
2. Initialize 3x3 matrix.
3. Print 'First row:' followed by elements matrix[0][j] separated by spaces.
4. Print 'Last row:' followed by elements matrix[2][j] separated by spaces.
5. Terminate the program.

### Question 2: Compute Column Sums of Matrix
1. Start the program.
2. Initialize 3x3 matrix.
3. Outer loop col j from 0 to 2: sum = 0.
4. Inner loop row i from 0 to 2: add matrix[i][j] to sum.
5. Print 'Column ' + (j + 1) + ' sum: ' + sum.
6. Terminate the program.

### Question 3: Count Matrix Elements Greater Than 5
1. Start the program.
2. Initialize 3x3 matrix and counter count = 0.
3. Iterate over all elements m[i][j]: if m[i][j] > 5, increment count.
4. Print 'Values greater than 5: ' + count.
5. Terminate the program.

---

## 6. Input (question-wise)
- **Question 1:** Matrix rows: [1,2,3], [4,5,6], [7,8,9].
- **Question 2:** Matrix rows: [1,2,3], [4,5,6], [7,8,9].
- **Question 3:** Matrix rows: [1,2,3], [4,5,6], [7,8,9].

---

## 7. Output (question-wise)

### Question 1: Output
```
First row: 1 2 3
Last row: 7 8 9
```

### Question 2: Output
```
Column 1 sum: 12
Column 2 sum: 15
Column 3 sum: 18
```

### Question 3: Output
```
Values greater than 5: 4
```

---

## 8. Result
All programs of Assignment 9 were successfully written, compiled, and executed in Visual Studio Code. The output produced by each program completely satisfied the problem specifications and matched the expected sample outputs.
