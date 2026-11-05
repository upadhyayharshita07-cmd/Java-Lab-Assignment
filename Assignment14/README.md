## 1. Experiment Title
Characters: Counting and Positions

---

## 2. Aim
Use charAt to count vowels and a letter, and print each letter with its position.

---

## 3. Software / Tools Required
- **Operating System:** Windows 10 / Windows 11
- **Integrated Development Environment (IDE):** Visual Studio Code (VS Code) with Extension Pack for Java
- **Java Development Kit (JDK):** OpenJDK 17 (Temurin-17.0.13+11)
- **Terminal Shell:** Windows PowerShell (pwsh)
- **Build / Execution Commands:** `javac Main.java` (compiler) and `java Main` (JVM execution)

---

## 4. Theory
Individual characters in a String can be retrieved by index via 'charAt(int index)'. Character classification and comparison can be performed using arithmetic equality or helper methods in the java.lang.Character class (such as toLowerCase(), isLetter(), isDigit()). Iterating through string characters enables frequency analysis (counting vowels, target consonants) and positional indexing from zero.

---

## 5. Algorithm / Procedure (question-wise)

### Question 1: Count Vowels in a String
1. Start the program.
2. Declare String s = "programming" and vowels = 0.
3. Iterate through each character using charAt(i).
4. If character is 'a', 'e', 'i', 'o', or 'u', increment vowels.
5. Print 'Vowels: ' + vowels.
6. Terminate the program.

### Question 2: Count Occurrences of a Specific Letter
1. Start the program.
2. Declare String s = "programming" and count = 0.
3. Iterate through characters: if s.charAt(i) == 'g', increment count.
4. Print 'Count of g: ' + count.
5. Terminate the program.

### Question 3: Print Each Character with Its Index
1. Start the program.
2. Declare String s = "hello".
3. Loop i from 0 to s.length() - 1.
4. Print i + ': ' + s.charAt(i).
5. Terminate the program.

---

## 6. Input (question-wise)
- **Question 1:** String: "programming".
- **Question 2:** String: "programming", target: 'g'.
- **Question 3:** String: "hello".

---

## 7. Output (question-wise)

### Question 1: Output
```
Vowels: 3
```

### Question 2: Output
```
Count of g: 2
```

### Question 3: Output
```
0: h
1: e
2: l
3: l
4: o
```

---

## 8. Result
All programs of Assignment 14 were successfully written, compiled, and executed in Visual Studio Code. The output produced by each program completely satisfied the problem specifications and matched the expected sample outputs.
