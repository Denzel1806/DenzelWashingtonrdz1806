/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandlingexample;

// Demonstrating Exception Handling in Java
public class ExceptionHandlingExample {

    public static void main(String[] args) {
        System.out.println("1. Handling ArithmeticException:");
        try {
            int result = 10 / 0; // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        System.out.println("\n2. Handling ArrayIndexOutOfBoundsException:");
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        System.out.println("\n3. Multiple Catch Blocks:");
        try {
            String text = null;
            System.out.println(text.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        }

        System.out.println("\n4. Finally Block:");
        try {
            int number = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("\n5. Using throw:");
        try {
            validateAge(15); // Custom validation
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        System.out.println("\n6. Using throws:");
        try {
            riskyOperation();
        } catch (Exception e) {
            System.out.println("Caught Exception from riskyOperation: " + e.getMessage());
        }

        System.out.println("\n7. Custom Exception:");
        try {
            checkBalance(-500);
        } catch (CustomException e) {
            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }

    // Example of using throw
    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        }
        System.out.println("Valid age: " + age);
    }

    // Example of using throws
    static void riskyOperation() throws Exception {
        throw new Exception("An error occurred in riskyOperation.");
    }

    // Example of Custom Exception
    static void checkBalance(int balance) throws CustomException {
        if (balance < 0) {
            throw new CustomException("Balance cannot be negative.");
        }
        System.out.println("Balance is: " + balance);
    }
}

// Custom Exception Class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
