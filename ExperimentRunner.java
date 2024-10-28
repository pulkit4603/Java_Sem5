import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import jplsemfive.exp1.Armstrong;
import jplsemfive.exp1.MersennePrime;
import jplsemfive.exp3.Line;
import jplsemfive.exp4.bookRating.BookRatings;
//import jplsemfive.exp4.employee.Tester; // Assuming Tester is the main class for employee management
import jplsemfive.exp4.shoppingCart.ShoppingCart; // Adjust as necessary
import jplsemfive.exp5.inheritance_v2.Main; // Adjust as necessary
import jplsemfive.exp5.stack.Test; // Assuming Test is the main class for stack implementation
import jplsemfive.exp6.hospital.HospitalTest; // Adjust as necessary
import jplsemfive.exp6.playlist.Tester; // Assuming this is the main class for playlist

public class ExperimentRunner {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Select an experiment to run:");
        System.out.println("1. Armstrong");
        System.out.println("2. Mersenne Prime");
        System.out.println("3. Line");
        System.out.println("4. Book Ratings");
        System.out.println("5. Employee Management");
        System.out.println("6. Shopping Cart");
        System.out.println("7. Inheritance Example");
        System.out.println("8. Stack Implementation");
        System.out.println("9. Hospital Test");
        System.out.println("10. Playlist Test");
        
        try {
            System.out.print("Enter your choice (1-10): ");
            String choice = reader.readLine();
            
            switch (choice) {
                case "1":
                    Armstrong.main(new String[]{});
                    break;
                case "2":
                    MersennePrime.main(new String[]{});
                    break;
                case "3":
                    Line.main(new String[]{});
                    break;
                case "4":
                    BookRatings.main(new String[]{});
                    break;
                case "5":
                    //Tester.main(new String[]{});
                    System.out.println("Not available, sorry!!");
                    break;
                case "6":
                    ShoppingCart.main(new String[]{});
                    break;
                case "7":
                    Main.main(new String[]{});
                    break;
                case "8":
                    Test.main(new String[]{});
                    break;
                case "9":
                    HospitalTest.main(new String[]{});
                    break;
                case "10":
                    jplsemfive.exp6.playlist.Tester.main(new String[]{}); // Adjust as necessary
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}
