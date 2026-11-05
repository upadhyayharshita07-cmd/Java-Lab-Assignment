## 1. Experiment Title
Matrices: Transpose and Row Sums

---

## 2. Aim
Create two-dimensional arrays, visit them row by row, and build a new matrix from one.

---

## 3. Software / Tools Required
- **Operating System:** Windows 10 / Windows 11
- **Integrated Development Environment (IDE):** Visual Studio Code (VS Code) with Extension Pack for Java
- **Java Development Kit (JDK):** OpenJDK 17 (Temurin-17.0.13+11)
- **Terminal Shell:** Windows PowerShell (pwsh)
- **Build / Execution Commands:** `javac Main.java` (compiler) and `java Main` (JVM execution)

---

## 4. Theory
A two-dimensional array (matrix) in Java is an array of arrays. Elements are addressed using row and column indices like 'matrix[row][col]'. Nested loops provide the canonical mechanism to populate and traverse matrices. Matrix transposition involves swapping row and column indices such that element at [i][j] moves to [j][i]. Row-wise summation isolates individual rows during traversal, computing accumulated totals for each horizontal vector.

---

## 5. Algorithm / Procedure (question-wise)

### Question 1: Populate and Print 3x4 Matrix
1. Start the program.
2. Declare int[][] m = new int[3][4] and counter val = 1.
3. Populate: outer loop i from 0 to 2; inner loop j from 0 to 3: set m[i][j] = val++.
4. Print: iterate each row and column, printing m[i][j] + ' '; print newline after each row.
5. Terminate the program.

### Question 2: Transpose of a 3x3 Matrix
1. Start the program.
2. Initialize 3x3 matrix with rows {1,2,3}, {4,5,6}, {7,8,9}.
3. Declare transpose matrix of size 3x3.
4. Loop i from 0 to 2, j from 0 to 2: transpose[j][i] = matrix[i][j].
5. Print transpose row by row with trailing space.
6. Terminate the program.

### Question 3: Compute Row Sums of 3x3 Matrix
1. Start the program.
2. Initialize 3x3 matrix.
3. Loop row i from 0 to 2: initialize sum = 0.
4. Inner loop col j from 0 to 2: add matrix[i][j] to sum.
5. Print 'Row ' + (i + 1) + ' sum: ' + sum.
6. Terminate the program.

---

## 6. Input (question-wise)
- **Question 1:** Dimensions: 3 rows x 4 columns; values 1 to 12.
- **Question 2:** Matrix rows: [1,2,3], [4,5,6], [7,8,9].
- **Question 3:** Matrix rows: [1,2,3], [4,5,6], [7,8,9].

---

## 7. Output (question-wise)

### Question 1: Output
```
1 2 3 4 
5 6 7 8 
9 10 11 12 
```

### Question 2: Output
```
1 4 7 
2 5 8 
3 6 9 
```

### Question 3: Output
```
Row 1 sum: 6
Row 2 sum: 15
Row 3 sum: 24
```

---

## 8. Result
All programs of Assignment 8 were successfully written, compiled, and executed in Visual Studio Code. The output produced by each program completely satisfied the problem specifications and matched the expected sample outputs.
