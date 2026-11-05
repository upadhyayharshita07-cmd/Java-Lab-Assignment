## 1. Experiment Title
Star and Number Patterns

---

## 2. Aim
Use a loop inside another loop to print stars and numbers in rows.

---

## 3. Software / Tools Required
- **Operating System:** Windows 10 / Windows 11
- **Integrated Development Environment (IDE):** Visual Studio Code (VS Code) with Extension Pack for Java
- **Java Development Kit (JDK):** OpenJDK 17 (Temurin-17.0.13+11)
- **Terminal Shell:** Windows PowerShell (pwsh)
- **Build / Execution Commands:** `javac Main.java` (compiler) and `java Main` (JVM execution)

---

## 4. Theory
Nested loops occur when one loop structure is placed inside another loop. The outer loop typically controls row generation, while the inner loop governs columns or elements within each row. Pattern printing reinforces understanding of 2D coordinate spaces, iteration boundaries, loop counters, and conditional formatting. System.out.print() prints content without advancing to the next line, whereas System.out.println() inserts a newline.

---

## 5. Algorithm / Procedure (question-wise)

### Question 1: Square Pattern of Stars
1. Start the program.
2. Set outer loop for row i from 1 to 4.
3. Set inner loop for column j from 1 to 4: print '*'.
4. After inner loop completes, print a newline.
5. Repeat until outer loop finishes, then terminate.

### Question 2: Right Triangle Star Pattern
1. Start the program.
2. Set outer loop i from 1 to 4.
3. Set inner loop j from 1 to i: print '*'.
4. Print a newline after each row.
5. Terminate the program.

### Question 3: Number Triangle Pattern
1. Start the program.
2. Set outer loop i from 1 to 4.
3. Set inner loop j from 1 to i: print j followed by a space.
4. Print a newline after each row.
5. Terminate the program.

### Question 4: Upside-Down Triangle Star Pattern
1. Start the program.
2. Set outer loop i from 4 down to 1.
3. Set inner loop j from 1 to i: print '*'.
4. Print a newline after each row.
5. Terminate the program.

---

## 6. Input (question-wise)
- **Question 1:** Static dimensions: 4 rows x 4 columns.
- **Question 2:** Static dimensions: 4 rows.
- **Question 3:** Static dimensions: 4 rows.
- **Question 4:** Static dimensions: 4 rows decreasing from 4 to 1.

---

## 7. Output (question-wise)

### Question 1: Output
```
****
****
****
****
```

### Question 2: Output
```
*
**
***
****
```

### Question 3: Output
```
1 
1 2 
1 2 3 
1 2 3 4 
```

### Question 4: Output
```
****
***
**
*
```

---

## 8. Result
All programs of Assignment 3 were successfully written, compiled, and executed in Visual Studio Code. The output produced by each program completely satisfied the problem specifications and matched the expected sample outputs.
