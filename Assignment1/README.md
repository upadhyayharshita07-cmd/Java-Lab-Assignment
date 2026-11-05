## 1. Experiment Title
Hello World, Variables and Arithmetic

---

## 2. Aim
Print text, store values in variables and calculate with arithmetic operators.

---

## 3. Software / Tools Required
- **Operating System:** Windows 10 / Windows 11
- **Integrated Development Environment (IDE):** Visual Studio Code (VS Code) with Extension Pack for Java
- **Java Development Kit (JDK):** OpenJDK 17 (Temurin-17.0.13+11)
- **Terminal Shell:** Windows PowerShell (pwsh)
- **Build / Execution Commands:** `javac Main.java` (compiler) and `java Main` (JVM execution)

---

## 4. Theory
Java is a high-level, class-based, object-oriented programming language designed to have as few implementation dependencies as possible. It follows the WORA (Write Once, Run Anywhere) philosophy enabled by the Java Virtual Machine (JVM). Every Java application begins execution from the main method having the signature 'public static void main(String[] args)'. Primitive data types in Java include int (32-bit signed integer), double (64-bit IEEE 754 floating point), char (16-bit Unicode character), and boolean. Java also provides reference types like String. Basic arithmetic operators (+, -, *, /, %) perform fundamental mathematical operations, while the 'final' keyword creates immutable constants whose values cannot be reassigned once set.

---

## 5. Algorithm / Procedure (question-wise)

### Question 1: Print Hello World and Welcome to Java
1. Start the execution of the program.
2. Invoke System.out.println() passing the string 'Hello World'.
3. Invoke System.out.println() passing the string 'Welcome to Java'.
4. Terminate the program.

### Question 2: Print Labeled Variable Values
1. Start the program.
2. Declare int roll initialized to 101.
3. Declare double percentage initialized to 84.5.
4. Declare char section initialized to 'B'.
5. Declare String name initialized to "Asha".
6. Print each variable value preceded by its respective label on a new line.
7. Terminate the program.

### Question 3: Arithmetic Operations on Variables
1. Start the program.
2. Initialize integer variable a with 17 and b with 5.
3. Compute sum (a + b), difference (a - b), product (a * b), quotient (a / b), and remainder (a % b).
4. Print each label followed by its calculated result on a separate line.
5. Terminate the program.

### Question 4: Circle Area and Perimeter using Constant PI
1. Start the program.
2. Declare constant final double PI = 3.14.
3. Initialize circle radius r = 7.
4. Calculate area = PI * radius * radius.
5. Calculate perimeter = 2 * PI * radius.
6. Print 'Area: ' followed by the area, and 'Perimeter: ' followed by the perimeter.
7. Terminate the program.

---

## 6. Input (question-wise)
- **Question 1:** None (Static console output).
- **Question 2:** Static initialization: roll = 101, percentage = 84.5, section = 'B', name = "Asha".
- **Question 3:** Static values: a = 17, b = 5.
- **Question 4:** Static values: PI = 3.14, radius = 7.

---

## 7. Output (question-wise)

### Question 1: Output
```
Hello World
Welcome to Java
```

### Question 2: Output
```
Roll: 101
Percentage: 84.5
Section: B
Name: Asha
```

### Question 3: Output
```
Sum: 22
Difference: 12
Product: 85
Quotient: 3
Remainder: 2
```

### Question 4: Output
```
Area: 153.86
Perimeter: 43.96
```

---

## 8. Result
All programs of Assignment 1 were successfully written, compiled, and executed in Visual Studio Code. The output produced by each program completely satisfied the problem specifications and matched the expected sample outputs.
