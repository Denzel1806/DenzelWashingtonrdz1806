package collectionframeworkexample;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

public class CollectionFrameworkExample {
    public static void main(String[] args) {
        // List Example (ArrayList)
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        // Set Example (HashSet)
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Dog");
        hashSet.add("Cat");
        hashSet.add("Rabbit");
        hashSet.add("Dog"); // Duplicates will not be added
        System.out.println("HashSet: " + hashSet);

        // Map Example (HashMap)
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "John");
        hashMap.put(2, "Alice");
        hashMap.put(3, "Bob");
        System.out.println("HashMap: " + hashMap);

        // Iterating through the List
        System.out.println("Iterating over ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Iterating through the Set
        System.out.println("Iterating over HashSet:");
        for (String animal : hashSet) {
            System.out.println(animal);
        }

        // Iterating through the Map
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Queue Example (PriorityQueue)
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(15);
        System.out.println("PriorityQueue: " + priorityQueue);

        // Polling elements from the PriorityQueue
        System.out.println("Polling from PriorityQueue:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}

