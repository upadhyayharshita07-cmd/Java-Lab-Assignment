## 1. Experiment Title
Strings: Methods and Palindromes

---

## 2. Aim
Use common String methods, reverse a word, check a palindrome and print substrings.

---

## 3. Software / Tools Required
- **Operating System:** Windows 10 / Windows 11
- **Integrated Development Environment (IDE):** Visual Studio Code (VS Code) with Extension Pack for Java
- **Java Development Kit (JDK):** OpenJDK 17 (Temurin-17.0.13+11)
- **Terminal Shell:** Windows PowerShell (pwsh)
- **Build / Execution Commands:** `javac Main.java` (compiler) and `java Main` (JVM execution)

---

## 4. Theory
In Java, strings are objects of the String class and are immutable (their contents cannot be modified after creation). Common String methods include length(), charAt(index), indexOf(char), toUpperCase(), toLowerCase(), and substring(start, end). A palindrome is a sequence that reads the same backward as forward. String reversal can be achieved using loop concatenation, while substring generation utilizes nested indices to slice strings.

---

## 5. Algorithm / Procedure (question-wise)

### Question 1: String Length, Index and Case Conversion
1. Start the program.
2. Declare String str = "Programming".
3. Print 'Length: ' + str.length().
4. Print 'Position of g: ' + str.indexOf('g').
5. Print 'Upper case: ' + str.toUpperCase().
6. Terminate the program.

### Question 2: Reverse a String Using Loop and charAt
1. Start the program.
2. Initialize s = "Java" and reversed = "".
3. Loop i from s.length() - 1 down to 0: reversed += s.charAt(i).
4. Print 'Reversed: ' + reversed.
5. Terminate the program.

### Question 3: Check Palindrome String
1. Start the program.
2. Initialize word = "racecar" and boolean isPalindrome = true.
3. Loop i from 0 to n/2: if word.charAt(i) != word.charAt(n - 1 - i), set isPalindrome = false and break.
4. If isPalindrome, print word + ' is a palindrome'; else print word + ' is not a palindrome'.
5. Terminate the program.

### Question 4: Generate All Substrings
1. Start the program.
2. Initialize string s = "abc".
3. Outer loop i from 0 to s.length() - 1.
4. Inner loop j from i + 1 to s.length(): print s.substring(i, j).
5. Terminate the program.

---

## 6. Input (question-wise)
- **Question 1:** Word: "Programming".
- **Question 2:** Word: "Java".
- **Question 3:** Word: "racecar".
- **Question 4:** Word: "abc".

---

## 7. Output (question-wise)

### Question 1: Output
```
Length: 11
Position of g: 3
Upper case: PROGRAMMING
```

### Question 2: Output
```
Reversed: avaJ
```

### Question 3: Output
```
racecar is a palindrome
```

### Question 4: Output
```
a
ab
abc
b
bc
c
```

---

## 8. Result
All programs of Assignment 13 were successfully written, compiled, and executed in Visual Studio Code. The output produced by each program completely satisfied the problem specifications and matched the expected sample outputs.
