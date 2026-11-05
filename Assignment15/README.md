## 1. Experiment Title
StringBuilder Methods

---

## 2. Aim
Build and change text with StringBuilder, using append, insert and deleteCharAt.

---

## 3. Software / Tools Required
- **Operating System:** Windows 10 / Windows 11
- **Integrated Development Environment (IDE):** Visual Studio Code (VS Code) with Extension Pack for Java
- **Java Development Kit (JDK):** OpenJDK 17 (Temurin-17.0.13+11)
- **Terminal Shell:** Windows PowerShell (pwsh)
- **Build / Execution Commands:** `javac Main.java` (compiler) and `java Main` (JVM execution)

---

## 4. Theory
Because String instances in Java are immutable, repeated concatenation inside loops creates unnecessary intermediate objects and introduces significant garbage collection overhead. java.lang.StringBuilder provides a mutable sequence of characters designed as a drop-in replacement for StringBuffer when thread safety is not required. Key methods include append() to concatenate data at the end, insert(offset, data) to inject characters at a designated index, deleteCharAt(index) to remove a specific character, and length() to query the current character count.

---

## 5. Algorithm / Procedure (question-wise)

### Question 1: Append and Length in StringBuilder
1. Start the program.
2. Create StringBuilder sb = new StringBuilder("Hello").
3. Call sb.append(" World").
4. Print sb.
5. Print 'Length: ' + sb.length().
6. Terminate the program.

### Question 2: Build Comma-Separated List and deleteCharAt
1. Start the program.
2. Create StringBuilder sb = new StringBuilder().
3. Loop i from 1 to 5: sb.append(i).append(",").
4. Remove trailing comma using sb.deleteCharAt(sb.length() - 1).
5. Print sb.
6. Terminate the program.

### Question 3: Insert Text at Beginning of StringBuilder
1. Start the program.
2. Create StringBuilder sb = new StringBuilder("Java").
3. Call sb.insert(0, "Hello ").
4. Print sb.
5. Terminate the program.

---

## 6. Input (question-wise)
- **Question 1:** Initial: "Hello", append: " World".
- **Question 2:** Numbers 1 to 5.
- **Question 3:** Initial: "Java", insert at 0: "Hello ".

---

## 7. Output (question-wise)

### Question 1: Output
```
Hello World
Length: 11
```

### Question 2: Output
```
1,2,3,4,5
```

### Question 3: Output
```
Hello Java
```

---

## 8. Result
All programs of Assignment 15 were successfully written, compiled, and executed in Visual Studio Code. The output produced by each program completely satisfied the problem specifications and matched the expected sample outputs.
