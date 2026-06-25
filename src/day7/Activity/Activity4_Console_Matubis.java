
package day7.Activity;

import java.util.Scanner;

public class Activity4_Console_Matubis {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Printing a Main Menu
        System.out.println("");
        System.out.println("=== Main Menu === ");
        
        // Printing for 1 to 4 option
        System.out.println("1. Start Game ");
        System.out.println("2. Load Game ");
        System.out.println("3. Settings ");
        System.out.println("4. Exit ");
        
        // Printing the choices from 1-4
        System.out.print("Enter a number (1-4): ");
        int choice = input.nextInt();
        
            // Using if/ if-else/ if-else-if ladder 
            if (choice == 1){
                System.out.println("\nYou selected Option 1: Start Game");
            } else if (choice == 2){
                System.out.println("\nYou selected Optio 2: Load Game");
            } else if (choice == 3){
                System.out.println("\nYou selected Option 3: Settings");
            } else if (choice == 4){
                System.out.println("\nYou selected Option 4: Exit");
            } else {
                System.out.println("\nInvalid Choice. Please try again.");
            }

    
    }
    
}
