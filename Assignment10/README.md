## 1. Experiment Title
Switch and ArrayList

---

## 2. Aim
Choose a branch with a switch statement, and store and change a list of numbers in an ArrayList.

---

## 3. Software / Tools Required
- **Operating System:** Windows 10 / Windows 11
- **Integrated Development Environment (IDE):** Visual Studio Code (VS Code) with Extension Pack for Java
- **Java Development Kit (JDK):** OpenJDK 17 (Temurin-17.0.13+11)
- **Terminal Shell:** Windows PowerShell (pwsh)
- **Build / Execution Commands:** `javac Main.java` (compiler) and `java Main` (JVM execution)

---

## 4. Theory
The switch statement is a multi-way branch statement providing an alternative to nested if-else ladders. It matches an expression against case values, executing statements until a 'break' statement is reached. The 'default' case handles unmatched inputs. In contrast to static arrays, java.util.ArrayList is a resizable array implementation of the List interface. It grows dynamically as elements are added, supports autoboxing for primitive wrappers (Integer), and provides methods like add(), get(index), set(index, value), remove(index), and size().

---

## 5. Algorithm / Procedure (question-wise)

### Question 1: Day Name Using Switch Statement
1. Start the program.
2. Declare int day = 3.
3. Switch on day: case 1 -> print 'Monday'; case 2 -> print 'Tuesday'; case 3 -> print 'Wednesday'; default -> print 'Invalid day'.
4. Terminate the program.

### Question 2: ArrayList Creation, Traversal and Access
1. Import java.util.ArrayList.
2. Create ArrayList<Integer> list = new ArrayList<>().
3. Add 10, 20, 30, 40 to the list.
4. Print the list object.
5. Print 'Size: ' + list.size().
6. Print 'Item at index 2: ' + list.get(2).
7. Terminate the program.

### Question 3: ArrayList Modification using Set and Remove
1. Import java.util.ArrayList.
2. Instantiate ArrayList and add 10, 20, 30, 40.
3. Invoke list.set(1, 25) to modify element at index 1.
4. Invoke list.remove(3) to delete element at index 3.
5. Print the updated list.
6. Print 'Size: ' + list.size().
7. Terminate the program.

---

## 6. Input (question-wise)
- **Question 1:** Static value: day = 3.
- **Question 2:** Values: 10, 20, 30, 40.
- **Question 3:** Initial values: [10, 20, 30, 40]; modifications: set(1, 25), remove(3).

---

## 7. Output (question-wise)

### Question 1: Output
```
Wednesday
```

### Question 2: Output
```
[10, 20, 30, 40]
Size: 4
Item at index 2: 30
```

### Question 3: Output
```
[10, 25, 30]
Size: 3
```

---

## 8. Result
All programs of Assignment 10 were successfully written, compiled, and executed in Visual Studio Code. The output produced by each program completely satisfied the problem specifications and matched the expected sample outputs.
