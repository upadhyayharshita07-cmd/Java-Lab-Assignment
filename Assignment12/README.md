## 1. Experiment Title
Insertion Sort

---

## 2. Aim
Sort small arrays with insertion sort and count how many values are shifted.

---

## 3. Software / Tools Required
- **Operating System:** Windows 10 / Windows 11
- **Integrated Development Environment (IDE):** Visual Studio Code (VS Code) with Extension Pack for Java
- **Java Development Kit (JDK):** OpenJDK 17 (Temurin-17.0.13+11)
- **Terminal Shell:** Windows PowerShell (pwsh)
- **Build / Execution Commands:** `javac Main.java` (compiler) and `java Main` (JVM execution)

---

## 4. Theory
Insertion Sort is an intuitive, stable, in-place comparison sort algorithm. It constructs the final sorted array one element at a time. In each iteration, an unsorted element ('key') is compared with elements in the sorted portion to its left. Larger elements are shifted one position to the right to make space for the key. Insertion sort has worst-case and average complexity O(n^2), but performs in O(n) linear time on almost-sorted data. Tracking shifts reveals the internal rearrangement cost.

---

## 5. Algorithm / Procedure (question-wise)

### Question 1: Insertion Sort on 4-Element Array
1. Start the program.
2. Initialize array {7, 3, 5, 1}.
3. Loop i from 1 to arr.length - 1: set key = arr[i], j = i - 1.
4. While j >= 0 and arr[j] > key: shift arr[j + 1] = arr[j]; decrement j.
5. Insert key at arr[j + 1].
6. Print 'Sorted: ' + Arrays.toString(arr).
7. Terminate the program.

### Question 2: Insertion Sort on 5-Element Array
1. Start the program.
2. Initialize array {14, 3, 9, 21, 6}.
3. Perform insertion sort algorithm iteratively.
4. Print 'Sorted: ' + Arrays.toString(arr).
5. Terminate the program.

### Question 3: Count Shifts in Reverse Sorted Array
1. Start the program.
2. Initialize array {6, 5, 4, 3, 2, 1} and shifts counter = 0.
3. Execute insertion sort: inside the while loop where arr[j] > key, increment shifts.
4. Print 'Shifts: ' + shifts.
5. Terminate the program.

---

## 6. Input (question-wise)
- **Question 1:** Array: {7, 3, 5, 1}.
- **Question 2:** Array: {14, 3, 9, 21, 6}.
- **Question 3:** Worst-case reverse sorted array: {6, 5, 4, 3, 2, 1}.

---

## 7. Output (question-wise)

### Question 1: Output
```
Sorted: [1, 3, 5, 7]
```

### Question 2: Output
```
Sorted: [3, 6, 9, 14, 21]
```

### Question 3: Output
```
Shifts: 15
```

---

## 8. Result
All programs of Assignment 12 were successfully written, compiled, and executed in Visual Studio Code. The output produced by each program completely satisfied the problem specifications and matched the expected sample outputs.
