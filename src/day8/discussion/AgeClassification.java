/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8.discussion;

import java.util.Scanner;

public class AgeClassification {

    public static void main(String[] args) {
        /*
            Age: 0 - 12 -> Child 
                Age: 0 - 5 ->  Specifically, Toddler
                Age: 6 - 12 ->  Specifically, Pre-Teen
            Age: 13 - 19 -> Teenager
                Age: 13 - 15 ->  Specifically, Eary Teen
                Age: 16 - 19 ->  Specifically, Late Teen
            Age: 20 - 59 -> Adult
                Age: 20 - 35 ->  Specifically, Young Adult
                Age: 36 - 59 ->  Specifically, Middle-Aged
            Age: 60 - 120 -> Senior Citizen
                Age: 60 - 75 ->  Specifically, Young Senior
                Age: 76 - 120 ->  Specifically, Elderly
            Invalid Age -> Invalid Input
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = input.nextInt();
        // validation

        if (age >= 0 && age <= 120) {
            if (age >= 0 && age <= 12) {
                System.out.println("You are a child ");
                if (age < - 5) {// toodler inner if
                    System.out.println("Specifically you are a Toddler ");
                } else {
                    System.out.println("Specifically you are a Pre-Teen");
                }
            } else if (age >= 13 && age <= 19) {
                System.out.println("You are a teenager ");
                if (age < - 15) {
                    System.out.println("Specifically, Eary Teen ");
                } else {
                    System.out.println("Specifically, Late Teen ");
                }
            } else if (age >= 20 && age <= 59) {
                System.out.println("You are a Adult ");
                if (age < - 35) {
                    System.out.println("Specifically, Young Adult");
                } else {
                    System.out.println("Specifically, Middle-Aged");
                }
            } else if (age >= 60 && age <= 120) {
                System.out.println("You are a Senior ");
                if (age < - 75) {
                    System.out.println("Specifically, Young Senior");
                } else {
                    System.out.println("Specifically, Elderly ");
                }
            } else {
                System.out.println("Invalid age entered");
            }

        } else {
            System.out.println("Invalid Age Entered.");
        }
        input.close();
    }

}
