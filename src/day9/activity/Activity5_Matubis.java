/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9.activity;

public class Activity5_Matubis {

    public static void main(String[] args) {

        // Activity 5.1 - Summation of 1 to N
        System.out.println("Activity 5.1 - Summation of 1 to N");

        int N = 5;
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum = sum + i;
            System.out.println("i = " + i + ", sum = " + sum);
        }

        System.out.println("Final Sum: " + sum);

        // Activity 5.2 - Product of 1 to N
        System.out.println("\nActivity 5.2 - Product of 1 to N");

        int product = 1;

        for (int i = 1; i <= N; i++) {
            product = product * i;
            System.out.println("i = " + i + ", product = " + product);
        }

        System.out.println("Final Product: " + product);

        // Activity 5.3 - Arithmetic Sequence (Sum Only)
        System.out.println("\nActivity 5.3 - Arithmetic Sequence (Sum Only)");

        int startNumber = 1;
        int commonDifference = 5;
        int n = 5;

        int current = startNumber;
        sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(current);

            sum = sum + current;

            if (i < n) {
                System.out.print(" + ");
            }

            current = current + commonDifference;
        }

        System.out.println(" = " + sum);

        // Activity 5.4 - Arithmetic Sequence (Sum and Product)
        System.out.println("\nActivity 5.4 - Arithmetic Sequence (Sum and Product)");

        startNumber = 1;
        commonDifference = 5;
        n = 10;

        // Sum
        current = startNumber;
        sum = 0;

        System.out.print("Sum: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(current);

            sum = sum + current;

            if (i < n) {
                System.out.print(" + ");
            }

            current = current + commonDifference;
        }

        System.out.println(" = " + sum);

        // Product
        current = startNumber;
        long sequenceProduct = 1;

        System.out.print("Product: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(current);

            sequenceProduct = sequenceProduct * current;

            if (i < n) {
                System.out.print(" * ");
            }

            current = current + commonDifference;
        }

        System.out.println(" = " + sequenceProduct);
    }

}
