package assign1;
import java.util.Scanner;


/**
 * MyHealthDataTest is a driver class for collecting and displaying patient's health data.
 * It prompts the user for input related to the patient's personal and health information,
 * creates a MyHealthData object with the provided data, and displays the health data to the console.
 *
 * @author Gulnur Ospanova
 * @see MyHealthData
 */

public class MYHealthDataTest {

    /**
     * The main method is the entry point of the program. It collects patient's data from the user,
     * creates a MyHealthData object, and displays the patient's health data.
     *
     * @param args.
     */
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter Patient's Data:");
        
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Gender: ");
        String gender = scanner.nextLine();
        
        System.out.print("Year of Birth: ");
        int birthYear = scanner.nextInt();
        
        System.out.print("Height (in inches): ");
        double height = scanner.nextDouble();
        
        System.out.print("Weight (in pounds): ");
        double weight = scanner.nextDouble();

        MyHealthData patientData = new MyHealthData(firstName, lastName, gender, height, weight, birthYear);

        patientData.displayMyHealthData();
        scanner.close();

	}

}
