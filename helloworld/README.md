# Welcome to Your First Java Program: Hello World!

This guide is designed to be your friendly companion as you take your first steps into the world of Java programming. We'll break down the `helloworld.java` file, explaining each part so you can understand not just *what* you're doing, but *why* you're doing it. Even if you come back to this months later, this guide will help you refresh your memory quickly.

## What's Inside `helloworld.java`?

Let's look at the code you've written. It's a simple program that prints "Hello World", does some basic math, and even takes input from you!

```java
import java.util.Scanner;

class helloworld{
  public static void main(String[]args){
  System.out.println("Hello World");
  int a = 5;
  String b = "HI"; //array of chars in C but a single variable in java
  double c = 5.4; // double is float but can hold more decimal places than a float datatype
  boolean d = true; // true => 1 , false => 0
  char e = 'a';
  System.out.println(a+a); // printing result of a+a directly instead of storing them in a variable
  Scanner sc = new Scanner(System.in); // creating an **OBJECT** of a Scanner to read input from the console.
  System.out.println("Enter a number to be multipled by 2");
  int k = sc.nextInt(); // sc.nextInt(); is called whenever the program needs to read the input.
  System.out.println(k*2);
  //if condition or else if condition takes a boolean as a condition
  // i.e.. anything that returns either true or false
if(k*2 == 10){
  System.out.println("The value you entered was 5");
}
else if(k*2 == 2){
  System.out.println("The value you entered was 1");
}
else {
  System.out.println("I've no idea what you've entered");
}
   }
}
```

## Deconstructing the Code

### The `class` Keyword

```java
class helloworld {
    // ... code inside the class
}
```

In Java, everything lives inside a `class`. Think of a class as a blueprint for creating objects. For now, just know that every Java program starts with a class. The name of our class is `helloworld`, which matches our file name.

### The `main` Method: Your Program's Entry Point

```java
public static void main(String[] args) {
    // ... your program's code
}
```

This is the most important part of your program. When you run your Java file, the Java Virtual Machine (JVM) looks for this exact `main` method and starts executing the code inside it. Let's break down those keywords:


### Printing to the Console

```java
System.out.println("Hello World");
```

This line prints the text "Hello World" to your console. `System.out.println()` is a command you'll use a lot to display information.

### Variables and Data Types

Variables are containers for storing data. In Java, you have to declare the type of data a variable will hold.

*   `int a = 5;`: `int` is for integers (whole numbers).
*   `String b = "HI";`: `String` is for text. It's a sequence of characters.
*   `double c = 5.4;`: `double` is for floating-point numbers (numbers with decimal points). It's more precise than `float`.
*   `boolean d = true;`: `boolean` can only be `true` or `false`.
*   `char e = 'a';`: `char` is for a single character.

### Taking User Input

```java
import java.util.Scanner;
// ...
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to be multipled by 2");
int k = sc.nextInt();
```

To get input from the user, we use the `Scanner` class.

1.  `import java.util.Scanner;`: This line imports the `Scanner` class from Java's utility library, making it available in our code.
2.  `Scanner sc = new Scanner(System.in);`: This creates a new `Scanner` object named `sc` that reads input from the standard input stream (`System.in`), which is usually your keyboard.
3.  `int k = sc.nextInt();`: This reads the next integer the user types and stores it in the variable `k`.

### Conditional Logic: `if-else`

```java
if(k*2 == 10){
  System.out.println("The value you entered was 5");
}
else if(k*2 == 2){
  System.out.println("The value you entered was 1");
}
else {
  System.out.println("I've no idea what you've entered");
}
```

This is how you make decisions in your code.

*   `if`: Checks if a condition is true. If `k*2` is equal to `10`, it prints the corresponding message.
*   `else if`: If the first `if` is false, this checks another condition.
*   `else`: If none of the above conditions are true, the code inside the `else` block is executed.

## How to Run Your Program

1.  **Compile the code:** Open your terminal or command prompt, navigate to the directory where `helloworld.java` is saved, and type:

    ```bash
    javac helloworld.java
    ```

    This command invokes the Java compiler, which translates your `.java` file into a `.class` file that the JVM can understand.

2.  **Run the program:** Now that you have your `.class` file, you can run the program with this command:

    ```bash
    java helloworld
    ```

    You'll see the output of your program in the console.

We hope this guide helps you on your Java journey! Happy coding!

## Practice Problems

*   **Problem 1:** Ask the user for their name and print a greeting. 
    *   **Example:** If the user enters "Alice", the program should print "Hello Alice!".
*   **Problem 2:** Ask the user for two numbers, add them together, and print the result.
    *   **Example:** If the user enters 5 and 10, the program should print "The sum is 15".
*   **Problem 3:** Ask the user for a number and check if it is even or odd.
    *   **Example:** If the user enters 7, the program should print "The number is odd".