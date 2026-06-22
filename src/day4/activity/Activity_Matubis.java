
package day4.activity;


public class Activity_Matubis {
    
    public static void main(String[] args) {
        
        // class declaire / initialize variable.
        boolean isStudent = true;
        byte age = 20;
        short schoolYear = 2026;
        int studentNumber = 20260004;
        long contactNumber = 639760000004L;
        float temp = 31.5f;
        double grade = 1.50;
        char section = 'A';
       String firstName = "Jerry Antonio", middleInitial = "Z.", 
                lastName = "Matubis Jr.";
       
       
        // print value with appropriate message and identify the data        
        System.out.println("Are you a Student? Please Answer True or False.: "
                + isStudent);
        System.out.println("Age: " + age);
        System.out.println("Year: " + schoolYear);
        System.out.println("Studentid: " + studentNumber);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Body Temperature: " + temp +" Celsius");
        System.out.println("Grade: " + grade);
        System.out.println("Section: " + section);
       System.out.println("Full Name: " +firstName + " " + middleInitial + " " 
                + lastName);
    }
    
}
