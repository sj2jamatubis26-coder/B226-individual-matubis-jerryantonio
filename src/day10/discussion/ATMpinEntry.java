/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10.discussion;

import java.util.Scanner;

public class ATMpinEntry {

    public static void main(String[] args) {
        // syntax of while loop

        // Print your name 10 times using while loop
        // Program for ATM PIN Entry -> max attempts 3
        Scanner input = new Scanner(System.in);

        int maxAttempts = 3;

        int pin = 123456; // registered pin / PIN set in the system
        int enteredPin;

        System.out.println("* Welcome to BDO *");

        boolean accessGranted = false; // Flag to track if PIN is correct

        // Allow up to 3 attempts
        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Enter your PIN! (Attempt " + attempt + " of 3): "); // Feedback if wrong
            enteredPin = input.nextInt(); // Read new input

            if (pin != enteredPin) {

                System.out.print("\nIncorrect PIN. ");

            } else {
                System.out.println("\nAccess Granted!");
                accessGranted = true;
                break; // Exit the loop immediately
            }
        }

        // After loop, check if access was granted
        if (!accessGranted) {
            System.out.println("Too many failed attempts. Your account is locked");
            input.close(); // Close the Scanner to free resources
        }
    }
}
        // If the loop ends, it means the PIN is correct
//System.out.println("Access Granted!");
