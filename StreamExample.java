/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamexample;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {
    public static void main(String[] args) {

        // Sample data
        List<String> names = Arrays.asList("John", "Sarah", "Alex", "Michael", "Sophia", "Emily", "Alex");

        System.out.println("1. Filtering Stream:");
        List<String> filteredNames = names.stream()
                                          .filter(name -> name.startsWith("A")) // Names starting with 'A'
                                          .collect(Collectors.toList());
        System.out.println("Filtered Names: " + filteredNames);

        System.out.println("\n2. Mapping Stream:");
        List<Integer> nameLengths = names.stream()
                                         .map(String::length) // Map each name to its length
                                         .collect(Collectors.toList());
        System.out.println("Name Lengths: " + nameLengths);

        System.out.println("\n3. Sorting Stream:");
        List<String> sortedNames = names.stream()
                                        .sorted() // Sort names alphabetically
                                        .collect(Collectors.toList());
        System.out.println("Sorted Names: " + sortedNames);

        System.out.println("\n4. Distinct Elements:");
        List<String> distinctNames = names.stream()
                                          .distinct() // Remove duplicates
                                          .collect(Collectors.toList());
        System.out.println("Distinct Names: " + distinctNames);

        System.out.println("\n5. Limiting Elements:");
        List<String> limitedNames = names.stream()
                                         .limit(3) // Take the first 3 elements
                                         .collect(Collectors.toList());
        System.out.println("Limited Names: " + limitedNames);

        System.out.println("\n6. Reduce Operation:");
        Optional<String> concatenatedNames = names.stream()
                                                  .reduce((name1, name2) -> name1 + ", " + name2); // Combine names
        concatenatedNames.ifPresent(System.out::println);

        System.out.println("\n7. Parallel Stream:");
        names.parallelStream()
             .forEach(name -> System.out.println("Processing: " + name)); // Parallel processing

        System.out.println("\n8. Numeric Stream:");
        int sum = IntStream.range(1, 6) // Range of numbers from 1 to 5
                           .sum(); // Sum of numbers
        System.out.println("Sum of numbers from 1 to 5: " + sum);

        System.out.println("\n9. Collecting Stream Data:");
        Map<Integer, List<String>> groupedByLength = names.stream()
                                                          .collect(Collectors.groupingBy(String::length)); // Group by length
        System.out.println("Grouped By Length: " + groupedByLength);

        System.out.println("\n10. Stream from Arrays:");
        int[] numbers = {1, 2, 3, 4, 5};
        List<Integer> doubledNumbers = Arrays.stream(numbers)
                                             .map(num -> num * 2) // Double each number
                                             .boxed() // Convert int to Integer
                                             .collect(Collectors.toList());
        System.out.println("Doubled Numbers: " + doubledNumbers);
    }
}
