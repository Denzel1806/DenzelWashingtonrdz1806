/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

public class LoopsExample {
    public static void main(String[] args) {

        System.out.println("1. For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        System.out.println("\n2. Enhanced For Loop:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        System.out.println("\n3. While Loop:");
        int i = 1;
        while (i <= 3) {
            System.out.println("While Loop Iteration: " + i);
            i++;
        }

        System.out.println("\n4. Do-While Loop:");
        int j = 1;
        do {
            System.out.println("Do-While Loop Iteration: " + j);
            j++;
        } while (j <= 3);

        System.out.println("\n5. Nested Loops:");
        for (int row = 1; row <= 2; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.println("Row " + row + ", Column " + col);
            }
        }

        System.out.println("\n6. Break Statement:");
        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                System.out.println("Breaking loop at k = " + k);
                break;
            }
            System.out.println("Value of k: " + k);
        }

        System.out.println("\n7. Continue Statement:");
        for (int l = 1; l <= 5; l++) {
            if (l == 3) {
                System.out.println("Skipping iteration for l = " + l);
                continue;
            }
            System.out.println("Value of l: " + l);
        }
    }
}
