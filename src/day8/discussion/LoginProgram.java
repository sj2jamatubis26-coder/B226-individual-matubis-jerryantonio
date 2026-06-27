/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8.discussion;

import java.util.Scanner;

public class LoginProgram {
    
    public static void main(String[] args) {
        
             // User Login
        String username = "admin";
        String password = "admin123";
        
        Scanner input = new Scanner(System.in);
       
        System.out.println("Login");
        System.out.println("Enter Username ");  // Ask the user for the username
        String LoginUsername = input.nextLine(); //Read user input and stores to LggInusername variable
        System.out.println("Enter Password "); // Ask user for Password
        String LoginPassword = input.nextLine(); //Read user input and stores to LogInpassword variable 
        
        // Check if both username and password match the predefined value
        
        if (LoginUsername.equals(username) && LoginPassword.equals(password)){
            
            System.out.println("\nLogin Successful!");
        } else {
            System.out.println("\nInvalid Username and Password");
        }
        
        // Close the scanner
        input.close();
        
        
    }
    
    }
    
    
}
