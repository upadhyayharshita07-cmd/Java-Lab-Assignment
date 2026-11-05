## 1. Experiment Title
Arrays: Reverse and Duplicates

---

## 2. Aim
Print an array in reverse order, find the smallest value, and check an array for repeated values.

---

## 3. Software / Tools Required
- **Operating System:** Windows 10 / Windows 11
- **Integrated Development Environment (IDE):** Visual Studio Code (VS Code) with Extension Pack for Java
- **Java Development Kit (JDK):** OpenJDK 17 (Temurin-17.0.13+11)
- **Terminal Shell:** Windows PowerShell (pwsh)
- **Build / Execution Commands:** `javac Main.java` (compiler) and `java Main` (JVM execution)

---

## 4. Theory
Reverse traversal of an array is accomplished by initializing a loop counter at 'arr.length - 1' and decrementing down to index 0. Finding the minimum value and its corresponding index requires maintaining tracking variables and updating them whenever a smaller element is encountered. Detecting duplicate values can be achieved through nested iteration over pairs of elements (O(n^2) comparisons), evaluating whether two distinct indices hold identical values.

---

## 5. Algorithm / Procedure (question-wise)

### Question 1: Print Array in Reverse Order
1. Start the program.
2. Initialize array with values {10, 20, 30, 40, 50}.
3. Iterate loop variable i starting from arr.length - 1 down to 0.
4. Print arr[i] on each iteration.
5. Terminate the program.

### Question 2: Find Smallest Element and its Index
1. Start the program.
2. Initialize array with values {2, 5, 1, 8, 3, 4}.
3. Set smallest = arr[0] and index = 0.
4. Iterate i from 1 to arr.length - 1: if arr[i] < smallest, set smallest = arr[i] and index = i.
5. Print 'Smallest: ' + smallest + ' at index ' + index.
6. Terminate the program.

### Question 3: Check Array for Repeated Values
1. Start the program.
2. Initialize array with values {4, 9, 2, 9, 7}.
3. Use boolean flag found = false and int repeated = 0.
4. Loop i from 0 to arr.length - 1; inner loop j from i + 1 to arr.length - 1.
5. If arr[i] == arr[j], set repeated = arr[i], found = true, and break out of loops.
6. If found, print 'Repeated value: ' + repeated; else print 'No repeated value'.
7. Terminate the program.

---

## 6. Input (question-wise)
- **Question 1:** Array elements: {10, 20, 30, 40, 50}.
- **Question 2:** Array elements: {2, 5, 1, 8, 3, 4}.
- **Question 3:** Array elements: {4, 9, 2, 9, 7}.

---

## 7. Output (question-wise)

### Question 1: Output
```
50
40
30
20
10
```

### Question 2: Output
```
Smallest: 1 at index 2
```

### Question 3: Output
```
Repeated value: 9
```

---

## 8. Result
All programs of Assignment 6 were successfully written, compiled, and executed in Visual Studio Code. The output produced by each program completely satisfied the problem specifications and matched the expected sample outputs.
