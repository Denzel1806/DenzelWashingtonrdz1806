/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresexample;
import java.util.*;

public class DataStructuresExample {
    public static void main(String[] args) {
        // 1. Array
        System.out.println("=== Array ===");
        int[] array = {1, 2, 3, 4, 5};
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 2. ArrayList
        System.out.println("\n=== ArrayList ===");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        for (String fruit : arrayList) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 3. LinkedList
        System.out.println("\n=== LinkedList ===");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        for (int num : linkedList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 4. Stack
        System.out.println("\n=== Stack ===");
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        // 5. Queue
        System.out.println("\n=== Queue ===");
        Queue<Double> queue = new LinkedList<>();
        queue.add(1.1);
        queue.add(2.2);
        queue.add(3.3);
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();

        // 6. HashMap
        System.out.println("\n=== HashMap ===");
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

