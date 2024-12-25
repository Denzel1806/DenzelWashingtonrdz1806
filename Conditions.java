/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditions;

/**
 *
 * @author admin
 */
public class Conditions {

    /**
     * @param args the command line arguments
     */
   
        
    
    public static void main(String[] args) {
        int number = 10;

        // If-else conditional
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }

        // Else-if ladder
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is negative.");
        }

        // Ternary operator
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println("The number is " + result + ".");

        // Switch-case conditional
        switch (number) {
            case 1:
                System.out.println("The number is one.");
                break;
            case 10:
                System.out.println("The number is ten.");
                break;
            default:
                System.out.println("The number is neither one nor ten.");
        }
    }
}
    
        
        
        
        
        
        
        
        
        
        
        
    
    
}
