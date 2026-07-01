/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day11.Activity;

import java.util.Scanner; // to accept user input.

public class Activity7_Matubis {
    
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);
        
        // Declares an integer array that can store 5 numbers.
        int[] numbers = new int[5];
        /*  Array name: numbers
            Type: Int[] ->(integer Array)
            Size: 5
        */
        
        // Variable to store the total sum of the numbers.
        int sum = 0;
        
        // Ask the user to input 5 numbers
        System.out.println("Enter 5 Numbers: ");  // Prompts the user to enter 5 numbers.
        
        // Loop to ask the user for 5 numbers.
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + (": ")); // Displays the number being entered (Number 1, Number 2, etc.).
            numbers[i] = input.nextInt(); // Stores the user's input into the array.
            sum += numbers[i]; // Adds the entered number to the sum.            
        }
        
        // Display all numbers entered
        System.out.println("\nYou entered:");
        
         // Loop to print each element in the array.
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("index " + i + (": ") + numbers[i]);            
        }
        
        // Compute Average
        double average = (double) sum / numbers.length; // (double) is used to make sure the result includes decimals.
        
        // Display sum and average
        System.out.println("\nSum = " + sum); // Displays the total sum.
        System.out.printf("Average = %.2f\n", average); // Displays the average with 2 decimal places.
        
        // Stretch Goal: Find highest and lowest numbers
        
         // Assumes the first element is both the highest and lowest value.
        int highest = numbers[0];
        int lowest = numbers[0];
        
        // Loop starts at index 1 because index 0 is already assigned.
        for (int i = 1; i < numbers.length; i++) {
             // If the current number is greater than the highest,
            // update the highest value.
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
            
            // If the current number is less than the lowest,
            // update the lowest value.
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }
        
         // Display highest and lowest
        System.out.println("Highest Number = " + highest); // Displays the highest number entered.
        System.out.println("Lowest Number = " + lowest); // Displays the lowest number entered.

        input.close(); // Closes the Scanner to free system resources.
    }
    
}
