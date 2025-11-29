# A Deep Dive into Object-Oriented Programming (OOP) in Java

This project provides a hands-on demonstration of core Object-Oriented Programming (OOP) principles in Java. It builds upon basic concepts like variables and loops and introduces you to the world of classes, objects, inheritance, and more.

## Deconstructing the Code: Core OOP Concepts

This project is structured into several files, each demonstrating a different facet of OOP. The main execution starts in `oops.java`.

### 1. Classes and Objects (`dog.java`, `oops.java`)

In Java, a **class** is a blueprint for creating **objects**. An object is an instance of a class.

-   **`dog.java`**: This file defines the `dog` class, which acts as a blueprint for creating dog objects. It has properties (like `color` and `name`) and behaviors (like `feedDog()`).
-   **`oops.java`**: This is where we create an *instance* of our `dog` class.

```java
// In oops.java
// We are creating a new object of the 'dog' class.
dog dog = new dog("Blue", "Java", birthdays.stov);
```

### 2. Constructors (`dog.java`)

A **constructor** is a special method that is called when an object is created. It's used to initialize the object's state. A class can have multiple constructors with different parameters (constructor overloading).

The `dog` class has three constructors:

```java
// In dog.java

// 1. A constructor that takes color, name, and owner's birthday
public dog(String color, String name, birthdays OwnerBirthday) {
    this.color = color;
    this.name = name;
    this.OwnerBirthday = OwnerBirthday;
}

// 2. A default (no-argument) constructor
public dog() {
    color = "White";
    name = "Dog";
}

// 3. A constructor that takes an integer
public dog(int value) {
   System.out.println(value * value);
}
```

### 3. Inheritance (`doat.java` extends `dog.java`)

**Inheritance** allows a class to inherit the properties and methods of another class. The `doat` class *extends* the `dog` class, meaning a `doat` is a specialized type of `dog`.

-   `doat` automatically has the `color` and `name` fields from `dog`.
-   `doat` adds its own unique properties: `doesItHaveCatEyes` and `isItPlayFull`.

```java
// In doat.java
public class doat extends dog {
    Boolean doesItHaveCatEyes;
    Boolean isItPlayFull;

    doat(String color, String name, Boolean doesItHaveCatEyes, Boolean isItPlayFull) {
        // It can access and set the properties of the parent 'dog' class
        dog.name = name;
        dog.color = color;
        this.doesItHaveCatEyes = doesItHaveCatEyes;
        this.isItPlayFull = isItPlayFull;
    }
    // ...
}
```

### 4. Polymorphism and Type Casting (`oops.java`)

**Polymorphism** means "many forms." In OOP, it allows an object to be treated as an instance of its parent class.

In `oops.java`, we create a `doat` object but store it in a `dog` reference. This is possible because a `doat` **is a** `dog` (due to inheritance).

```java
// In oops.java

// 1. We create a 'doat' object and assign it to a 'dog' variable.
dog = new doat("Pink", "meow", true, false);
dog.feedDog(); // This still works!

// To access the 'doat'-specific properties, we must cast it back.
doat doat = (doat) dog;
System.out.println(doat.doesItHaveCatEyes); // Now we can access doat's unique properties
```

### 5. Enums (`birthdays.java`)

An **enum** is a special data type that enables for a variable to be a set of predefined constants. Use enums any time you have a fixed set of related constants.

In this project, `birthdays.java` defines an enum for birthdays, where each constant (`hellf0rg0d`, `stov`) has associated data (birthday string and age). This prevents errors from using invalid string values.

```java
// In birthdays.java
public enum birthdays {
    hellf0rg0d("09-11-2006", 19),
    stov("01-04-2006", 19);

    private String birthday;
    int age;

    birthdays(String birthday, int age) {
        this.birthday = birthday;
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }
}
```

### 6. Records (`dairy.java`)

Introduced in Java 14, a **record** is a concise way to create immutable data-carrier classes. It automatically generates the constructor, `equals()`, `hashCode()`, and `toString()` methods.

`dairy.java` is a perfect use case for a record, as it simply holds data.

```java
// In dairy.java
// This one line is equivalent to a class with a constructor and getter methods for 'date' and 'content'.
public record dairy(String date, String content) {
}

// Usage in oops.java
dairy page1 = new dairy("29-11-2025", "The day was aweful and boring i suck at teaching");
System.out.println(page1); // Prints a clean, readable string representation
```

## How to Compile and Run

1.  **Compile all `.java` files:**
    From the `java-learn` directory, run:
    ```bash
    javac oops/*.java
    ```

2.  **Run the main application:**
    To run the program, you need to specify the package and the main class:
    ```bash
    java oops.oops
    ```