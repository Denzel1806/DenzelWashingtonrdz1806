/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericsexample;

// Demonstrating Generics in Java
import java.util.ArrayList;
import java.util.List;

// Generic Class
class Box<T> {
    private T item;

    // Setter method
    public void setItem(T item) {
        this.item = item;
    }

    // Getter method
    public T getItem() {
        return item;
    }
}

// Generic Method
class Utility {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    // Bounded Type Example: T must extend Number
    public static <T extends Number> double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
}

public class GenericsExample {
    public static void main(String[] args) {
        System.out.println("1. Generic Class Example:");
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello Generics!");
        System.out.println("String Box contains: " + stringBox.getItem());

        Box<Integer> intBox = new Box<>();
        intBox.setItem(42);
        System.out.println("Integer Box contains: " + intBox.getItem());

        System.out.println("\n2. Generic Method Example:");
        String[] stringArray = {"Java", "Generics", "Example"};
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("String Array:");
        Utility.printArray(stringArray);
        System.out.println("Integer Array:");
        Utility.printArray(intArray);

        System.out.println("\n3. Bounded Types Example:");
        double sumResult = Utility.sum(10.5, 20.3);
        System.out.println("Sum of two numbers: " + sumResult);

        System.out.println("\n4. Generics with Collections:");
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Generics");
        list.add("Collections");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("\n5. Wildcards in Generics:");
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        printList(integers);

        List<Double> doubles = List.of(1.1, 2.2, 3.3);
        printList(doubles);
    }

    // Method with Wildcard (Accepts any List of Numbers)
    public static void printList(List<? extends Number> list) {
        System.out.println("Printing list of numbers:");
        for (Number number : list) {
            System.out.println(number);
        }
    }
}
