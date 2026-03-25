package preformanceNet;
import java.util.Scanner;
public class MyProgram {
   public static void main(String[] args) {
       System.out.println("Welcome to PerformanceNet"); // Greeting Client
       Scanner scanner = new Scanner(System.in); // Create a Scanner object
       while (true) {
           System.out.println("Type chosen sport:"); // Client must type in sport they wish to view
           System.out.println("1. Cross Country\n2. Track and Field");
           String sport = scanner.nextLine(); // Read user input
           if (sport.equals("1")) { // Code will run from CrossCountry class when Cross Country is typed in.
               CrossCountry objA = new CrossCountry();
               objA.crossCountry(); // method crossCountry called`
               break; // Exit the loop after successful input
           } else if (sport.equals("2")) { // Code will run from TrackAndField class when Track and Field is typed in.
               TrackAndField objB = new TrackAndField();
               objB.trackNField(); // method trackNField called
               break; // Exit the loop after successful input
           } else {
               System.out.println("Invalid choice. Choose a valid option.");
           }
       }
      
       scanner.close(); // Close the Scanner object
   }
}
