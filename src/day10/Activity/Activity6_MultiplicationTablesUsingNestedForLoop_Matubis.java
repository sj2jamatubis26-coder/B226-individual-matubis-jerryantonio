/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10.Activity;

public class Activity6_MultiplicationTablesUsingNestedForLoop_Matubis {

    public static void main(String[] args) {

        /*Part 2: Create another Java program 
        (in a separate class) that displays multiplication tables using Nested For Loops.
        The output should clearly label each table (e.g., "Multiplication Table of 2).
        Each table should list the multiples from 1 up to 10(e.g., 2 x 1 = 2, 2 x 2 = 4, … , 2 x 10 = 20).
         */
        
         // Outer loop for each multiplication table
        for (int table = 1; table <= 12; table++) {

            System.out.println("Multiplication Table of " + table);

            // Inner loop for multiples 1 to 10
            for (int multiplier = 1; multiplier <= 10; multiplier++) {

                System.out.println(table + " x " + multiplier + " = " + (table * multiplier));
            }

            // Blank line after each table
            System.out.println();
        }

    }
}
