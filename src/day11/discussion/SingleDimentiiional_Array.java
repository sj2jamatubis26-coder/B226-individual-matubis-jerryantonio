/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day11.discussion;

//import java.util.Scanner;

public class SingleDimentiiional_Array {

    public static void main(String[] args) {
        // syntax for single dimentional array
        // collection of ages: 24 43 35 18 38
        int[] ages = {24, 43, 35, 18, 28, 25};
        // Traverse an ages array using for loop and for-each loop

        // Using for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < ages.length; i++) {
            System.out.println("Age: " + ages[i]);
        }
        // for loop uses index (i) to access element

        System.out.println();

        // Using for-each loop
        System.out.println("Using for-each loop:");
        for (int age : ages) {
            System.out.println("Age: " + age);
        }
        // for-each loop directly access each value (age) without using a index
        
        
//        System.out.println(ages[2]);

        String[] names = {"Michael", "Les", "Kent", "Ray", "Jeff"};
//        System.out.println(names.length - 1); // maximum index(.lengyh)

        // Traversing an array using for loop
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
        // Traversing an array using for-each loop / enhanced for loop
//        for (String name : names) {
//            System.out.println(name);
//    }
//
//        // Array Declaration with specified size only
//        Scanner scanner = new Scanner(System.in);
//        String[] anime = new String[5];
//        
//        for (int i = 0; i < anime.length; i++) {
//            System.out.println("Enter Anime Title: ");
//            anime[i] = scanner.nextLine();            
//        }
//        
//        System.out.println("\nAnime you Entered: ");
//        for (String title : anime) {
//            System.out.println(title);
//        }
//        
//        String[] anime = new String[5];
//        
//        anime[0] =  "Jujutsu Kaisen";
//        anime[1] = "One Piece";
//        anime[2] = "Ghost Fighter";
//        anime[3] = "Dragon Ball Z";
//        anime[4] = "Naruto Shipuden"

}

}
