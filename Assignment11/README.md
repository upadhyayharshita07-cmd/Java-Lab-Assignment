## 1. Experiment Title
Bubble Sort and Selection Sort

---

## 2. Aim
Sort small arrays with bubble sort and selection sort, and count the swaps.

---

## 3. Software / Tools Required
- **Operating System:** Windows 10 / Windows 11
- **Integrated Development Environment (IDE):** Visual Studio Code (VS Code) with Extension Pack for Java
- **Java Development Kit (JDK):** OpenJDK 17 (Temurin-17.0.13+11)
- **Terminal Shell:** Windows PowerShell (pwsh)
- **Build / Execution Commands:** `javac Main.java` (compiler) and `java Main` (JVM execution)

---

## 4. Theory
Sorting is the process of arranging data in a specific order (ascending or descending). Bubble Sort works by repeatedly swapping adjacent elements if they are in the wrong order. With each pass, the largest unsorted element 'bubbles' up to its correct position. It has a time complexity of O(n^2). Selection Sort divides the list into sorted and unsorted regions, repeatedly finding the minimum element from the unsorted region and placing it at the beginning of the unsorted segment. Counting swaps helps assess algorithm overhead in terms of write operations.

---

## 5. Algorithm / Procedure (question-wise)

### Question 1: Bubble Sort Implementation
1. Start the program.
2. Initialize array arr = {5, 1, 4, 2, 8}.
3. Run outer loop i from 0 to n - 2.
4. Run inner loop j from 0 to n - 2 - i: if arr[j] > arr[j + 1], swap arr[j] and arr[j + 1].
5. Print 'Sorted: ' + Arrays.toString(arr).
6. Terminate the program.

### Question 2: Selection Sort Implementation
1. Start the program.
2. Initialize array arr = {64, 25, 12, 22, 11}.
3. Outer loop i from 0 to n - 2: set minIdx = i.
4. Inner loop j from i + 1 to n - 1: if arr[j] < arr[minIdx], minIdx = j.
5. Swap arr[i] with arr[minIdx].
6. Print 'Sorted: ' + Arrays.toString(arr).
7. Terminate the program.

### Question 3: Count Swaps in Bubble Sort
1. Start the program.
2. Initialize array {5, 1, 4, 2, 8} and swaps = 0.
3. Execute standard bubble sort; every time a swap occurs, increment swaps by 1.
4. Print 'Swaps: ' followed by swaps.
5. Terminate the program.

---

## 6. Input (question-wise)
- **Question 1:** Unsorted array: {5, 1, 4, 2, 8}.
- **Question 2:** Unsorted array: {64, 25, 12, 22, 11}.
- **Question 3:** Array: {5, 1, 4, 2, 8}.

---

## 7. Output (question-wise)

### Question 1: Output
```
Sorted: [1, 2, 4, 5, 8]
```

### Question 2: Output
```
Sorted: [11, 12, 22, 25, 64]
```

### Question 3: Output
```
Swaps: 4
```

---

## 8. Result
All programs of Assignment 11 were successfully written, compiled, and executed in Visual Studio Code. The output produced by each program completely satisfied the problem specifications and matched the expected sample outputs.
