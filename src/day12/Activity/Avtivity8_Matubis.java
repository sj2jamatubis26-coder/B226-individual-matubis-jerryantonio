/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day12.Activity;

import java.util.Scanner; // Imports the Scanner class for user input

public class Avtivity8_Matubis {
    
    public static void main(String[] args) {
        
        // Creates a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);
        
        // Displays the program title
        System.out.println("====================================");
        System.out.println("        Average Calculator");
        System.out.println("====================================");

        // Ask the user for the number of students
        System.out.print("Enter number of students: ");
        int students = input.nextInt(); // to stores the numbers of students entered by the user
        
         // Ask the user for the number of subjects
        System.out.print("Enter number of subjects: ");
        int subjects = input.nextInt(); // to stores the numbers of subjects entered by the user
        input.nextLine();// This prevents the nextLine() from being skipped.

        // Creates a one-dimensional array to store subject names
        String[] subjectNames = new String[subjects];

        // Ask the user to enter the name of each subject
        System.out.println("\nEnter subject names:");
        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");  // Display the subject number
            subjectNames[i] = input.nextLine(); // Store the subject name in the array
        }

        // Creates a one-dimensional array to store student names
        String[] studentNames = new String[students];

        // Creates a two-dimensional array to store grades
        // Rows = Students
        // Columns = Subjects
        double[][] grades = new double[students][subjects];

         // Creates an array to store each student's average
        double[] averages = new double[students];

         // Loop through each student
        for (int i = 0; i < students; i++) {

            // Ask for the student's name
            System.out.print("\nName of Student " + (i + 1) + ": ");
            studentNames[i] = input.nextLine();

            double total = 0; // Variable used to compute the total grades

            System.out.println("Enter grades for each subject:");

             // Loop through every subject
            for (int j = 0; j < subjects; j++) {
                
                // Ask for the student's grade in each subject
                System.out.print(subjectNames[j] + ": ");
                grades[i][j] = input.nextDouble(); // Store the grade in the 2D array

                total += grades[i][j]; // Add the grade to the total
            }

            averages[i] = total / subjects; // Compute the student's average

            input.nextLine(); // Removes the leftover Enter key after nextDouble()
        }

        // Display Report title
        System.out.println("\n====================================");
        System.out.println("           Grades Report");
        System.out.println("====================================");

        // Print the Table Header
        System.out.printf("%-15s", "Student");

        // Display every subject name as the column heading
        for (int i = 0; i < subjects; i++) {
            System.out.printf("%-10s", subjectNames[i]);
        }

         // Display the Average column
        System.out.printf("%-10s\n", "Average");

        // Print a separator line
        System.out.println("--------------------------------------------------------------");

        // Display student grades
        for (int i = 0; i < students; i++) {

            // Display the grades and averages of every student
            System.out.printf("%-15s", studentNames[i]);

            // Print each subject grade
            for (int j = 0; j < subjects; j++) {
                System.out.printf("%-10.0f", grades[i][j]);
            }

            // Print the average with two decimal places
            System.out.printf("%-10.2f\n", averages[i]);
        }

        input.close();  // Close the Scanner to free system resources
    }
}    
   

