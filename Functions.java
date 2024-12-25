/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

/**
 *
 * @author admin
 */
public class Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

    
        // Basic Function
        greet();

        // Function with Parameters
        greetWithName("Alice");

        // Function with Return Value
        int sum = add(10, 20);
        System.out.println("The sum is: " + sum);

        // Function Overloading
        System.out.println("Sum (int): " + add(5, 15));
        System.out.println("Sum (double): " + add(5.5, 10.5));

        // Recursive Function
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + factorial(number));

        // Static Function
        greetStatic();

        // Non-Static Function
        AllFunctionsExample obj = new AllFunctionsExample();
        obj.greetNonStatic();
    }

    // 1. Basic Function
    public static void greet() {
        System.out.println("Hello, World!");
    }

    // 2. Function with Parameters
    public static void greetWithName(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // 3. Function with Return Value
    public static int add(int a, int b) {
        return a + b;
    }

    // 4. Function Overloading
    public static double add(double a, double b) {
        return a + b;
    }

    // 5. Recursive Function
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // 6. Static Function
    public static void greetStatic() {
        System.out.println("Hello from a static function!");
    }

    // 7. Non-Static Function
    public void greetNonStatic() {
        System.out.println("Hello from a non-static function!");
    }
}

    }
    
}
