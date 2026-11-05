## 1. Experiment Title
Writing Functions

---

## 2. Aim
Write functions with parameters and return values, and call them from main.

---

## 3. Software / Tools Required
- **Operating System:** Windows 10 / Windows 11
- **Integrated Development Environment (IDE):** Visual Studio Code (VS Code) with Extension Pack for Java
- **Java Development Kit (JDK):** OpenJDK 17 (Temurin-17.0.13+11)
- **Terminal Shell:** Windows PowerShell (pwsh)
- **Build / Execution Commands:** `javac Main.java` (compiler) and `java Main` (JVM execution)

---

## 4. Theory
Methods (functions) in Java are blocks of code that perform specific tasks and only run when called. They promote code reusability, modularity, and readability. A method declaration includes access modifiers (public, private), static/instance specifiers, return types (int, void, etc.), method name, and formal parameter lists. Static methods belong to the class and can be invoked directly from the static main method without creating an instance. Combinatorics functions like nCr = n! / (r! * (n - r)!) and nPr = n! / (n - r)! illustrate function composition.

---

## 5. Algorithm / Procedure (question-wise)

### Question 1: Compute Combinations nCr Using Functions
1. Define static function fact(int n) which computes n! using a loop and returns the integer.
2. Define static function nCr(int n, int r) which computes fact(n) / (fact(r) * fact(n - r)) and returns the result.
3. Inside main(), call nCr(5, 2).
4. Print '5C2 = ' followed by the result.
5. Terminate the program.

### Question 2: Compute Permutations nPr Using Functions
1. Define static function fact(int n) that computes n! iteratively and returns it.
2. Define static function nPr(int n, int r) that computes fact(n) / fact(n - r) and returns it.
3. In main(), invoke nPr(5, 2).
4. Print '5P2 = ' followed by the returned value.
5. Terminate the program.

### Question 3: Find Maximum of Two Numbers
1. Define static function maxOf(int a, int b) that returns (a > b ? a : b).
2. In main(), call maxOf(14, 9).
3. Print 'Larger: ' followed by the result.
4. Terminate the program.

---

## 6. Input (question-wise)
- **Question 1:** Parameters: n = 5, r = 2.
- **Question 2:** Parameters: n = 5, r = 2.
- **Question 3:** Parameters: a = 14, b = 9.

---

## 7. Output (question-wise)

### Question 1: Output
```
5C2 = 10
```

### Question 2: Output
```
5P2 = 20
```

### Question 3: Output
```
Larger: 14
```

---

## 8. Result
All programs of Assignment 4 were successfully written, compiled, and executed in Visual Studio Code. The output produced by each program completely satisfied the problem specifications and matched the expected sample outputs.
