/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9.Discussion;

import java.util.Scanner;
public class ForLoopStatements {

    public static void main(String[] args) {

        // Syntax
//        for (int i = 0; i < 10; i++) {
//        System.out.println(i + 1 + ": Jerry ");


        // Mini-Activity: calcute the product of numbers from 1 to 5:
       
//        Scanner input = new Scanner(System.in);
//        
//        System.out.print("Enter a number");
//        int num = input.nextInt();
//        
//        
//        long product = 1;
//        for (int 1 = 1; i <= num; i++){
//            product *=1;
//        
        int product = 1;

        for (int i = 1; i <= 5; i++) {
            product = product * i;
            // 1 * 2 * 3 * 4 * 5 = 120
        }

        System.out.println("The product of numbers from 1 to 5 is: " + product);

    }
}

}