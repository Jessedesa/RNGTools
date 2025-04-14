# RNGTools Library

RNGTools is a simple Java library that provides utilities for generating random numbers. It is designed to be easy to use and integrate into any Java project.

## Features:
- Generate random numbers within a specified range.
- Supports both integers and floating-point numbers.

## How to Use:

### 1. Download the `.jar` File
You can download the `.jar` file from the **Releases** section of this repository, or you can include the library in your project by using the following Maven dependency (once it's published to Maven).

### 2. Add the Library to Your Project

- **Using the `.jar` File:**
  - Download the `.jar` file (e.g., `RNGTools-1.0-SNAPSHOT.jar`).
  - Add it to your project’s classpath.

- **Using Maven:**
  Add this to your `pom.xml` file (once published to Maven, for now, refer to the `.jar`).

### 3. Import the Library in Your Java Project

```java
import org.example.RNGTools;
```

## Example Usage:

```java
public class Main {
    public static void main(String[] args) {
        // Generate a random integer between 1 and 100
        int randomNumber = RNGTools.getRandomNumber(1, 100);
        System.out.println("Random integer: " + randomNumber);

        // Generate a random double between 0 and 1
        double randomDouble = RNGTools.getRandomDouble();
        System.out.println("Random double: " + randomDouble);
    }
}

