/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10.Activity;

import java.util.Scanner;

public class Activity6_MultiplicationTableScanner_Matubis {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /* Create a Java program  that requires the use of the Scanner class.
    The program should ask the user to input which multiplication table they want 
    to display. Only the chosen multiplication table will be shown 
    (e.g., if the user inputs 5, only multiplication of 5 will be displayed).
         */
        System.out.println("Enter the multiplication table you want to display: ");
        int number = input.nextInt();

        System.out.println("\nMultiplication of " + number);

        for (int i = 0; i < 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        input.close();
    }
}
