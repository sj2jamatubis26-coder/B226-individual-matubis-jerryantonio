
package day6.Activity;


public class Activity3_Matubis {
    
    public static void main(String[] args) {

        // Given 
        int age = 20;
        boolean hasValidID = true;
        
        // Logical AND Operator (&&)  
        // Using if else statement
        if (age >= 18 && hasValidID) {
            System.out.println("Access Granted"); 
        } else {
            System.out.println("Access Denied");
        }

        // Given 
        boolean isWeekend = true;
        boolean isHoliday = false;

        // Logical OR Operator (||)
        if (isWeekend || isHoliday){
            System.out.println("No Classes Today");
        } else {
            System.out.println("With Classes Today");
        }

        // Given 
        int score = 85;
        
        // Ternary Operator (? :)
        String result = (score >= 75) ? "Passed" : "Failed";

        System.out.println( result);

        // Given 
        int num1 = 10;
        int num2 = 25;

        int largerNumber = (num1 > num2) ? num1 : num2;

        // Ternary Operator (? :) 
        System.out.println("Larger Number: " + largerNumber);
    }
    
}
