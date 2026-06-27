/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8.discussion;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SwitchStatement {

    public static void main(String[] args) {
        // Printing a Main Menu
        System.out.println("");
        System.out.println("=== Main Menu === ");

//        // Printing for 1 to 4 option
        System.out.println("1. Start Game ");
        System.out.println("2. Load Game ");
        System.out.println("3. Settings ");
        System.out.println("4. Exit ");

//        // Printing the choices from 1-4
        System.out.print("Enter a number (1-4): ");
        Scanner input = new Scanner(System.in);// is used to allow the user to enter data
        int num = input.nextInt();

        switch (num) {
            case 1:
                System.out.println("\nYou selected Option 1: Start Game");
                break;
            case 2:
                System.out.println("\nYou selected Option 2: Load Game");
                break;
            case 3:
                System.out.println("\nYou selected Option 3: Settings");
                break;
            case 4:
                System.out.println("\nYou selected Option 4: Exit");
                break;
            default:
                System.out.println("\nInvalid choice. Please select a valid choice");
        }

//        // Printing a Main Menu
//        System.out.println("");
//        System.out.println("=== Main Menu === ");
//
//        // Printing for 1 to 4 option
//        System.out.println("1. Start Game ");
//        System.out.println("2. Load Game ");
//        System.out.println("3. Settings ");
//        System.out.println("4. Exit ");
//
//        // Printing the choices from 1-4
//        System.out.print("Enter a number (1-4): ");
//        int choice = input.nextInt();
//
//        // Using if/ if-else/ if-else-if ladder 
//        if (choice == 1) {
//            System.out.println("\nYou selected Option 1: Start Game");
//        } else if (choice == 2) {
//            System.out.println("\nYou selected Optio 2: Load Game");
//        } else if (choice == 3) {
//            System.out.println("\nYou selected Option 3: Settings");
//        } else if (choice == 4) {
//            System.out.println("\nYou selected Option 4: Exit");
//        } else {
//            System.out.println("\nInvalid Choice. Please try again.");
//        }
        input.close();
    }

}
