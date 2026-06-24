
package day5.Activity;


public class Activity2_Matubis {
    public static void main(String[] args) {
        
        // Given values
        double income = 50_000;
        double foodAllowance = 15_000;
        double transportation = 2_500;
        double rent = 4_500;
        double utilityBill = 3_500;

        // Calculate percentages
        double foodPercent = (foodAllowance / income) * 100;
        double transportationPercent = (transportation / income) * 100;
        double rentPercent = (rent / income) * 100;
        double utilityPercent = (utilityBill / income) * 100;

        // Calculate total expenses
        double totalExpenses = foodAllowance + transportation + rent 
                + utilityBill;

        // Calculate remaining balance
        double remainingBalance = income - totalExpenses;
        
        // Println simple text output
        // Uses string concatenation + the operator
        
        // Printf advance formattted output
        // Uses %sign, (%s ->string, %d -> integer, %f -> decimal number,
        // %.0%f -> no decimal, %.1f -> 1digit decimal, %.2f -> 2digit decimal
        // \n -> newline, %% -> print in % symbol
        
        
        // Display results using printf
        System.out.printf("Income: %.0f\n", income);
        System.out.printf("Food Allowance: %.1f %%\n", foodPercent);
        System.out.printf("Transportation: %.1f %%\n", transportationPercent);
        System.out.printf("Rent: %.1f %%\n", rentPercent);
        System.out.printf("Utility Bill: %.1f %%\n", utilityPercent);
        System.out.printf("Remaining Balance: %.2f%n", remainingBalance);
    }
    
}
