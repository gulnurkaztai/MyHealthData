package assign1;
import java.time.*; 

/**
 * MyHealthData represents a patient's health data and extends MyHealthDataBase.
 * It includes information such as the patient's name, gender, birth year, height, weight, and calculates health-related values.
 *
 * @author Gulnur Ospanova
 * @see MyHealthDataBase
 */

public class MyHealthData extends MyHealthDataBase{

	private String firstName;
	private String lastName;
	private String gender;
	private int birthYear;
	private int currentYear;
	private double height;
	private double weight;

    /**
     * Constructs a new MyHealthData object with the specified patient data.
     *
     * @param firstName The first name of the patient.
     * @param lastName  The last name of the patient.
     * @param gender    The gender of the patient.
     * @param height    The height of the patient in inches.
     * @param weight    The weight of the patient in pounds.
     * @param birthYear The birth year of the patient.
     */
	
    public MyHealthData(String firstName, String lastName, String gender, double height, double weight, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.birthYear = birthYear;
    }

    /**
     * Gets the first name of the patient.
     *
     * @return The first name of the patient.
     */
    
    public String getFirstName() {
    	return this.firstName;
    }
    
    /**
     * Sets the first name of the patient.
     *
     * @param firstName The first name of the patient.
     */

    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }
    
    /**
     * Gets the last name of the patient.
     *
     * @return The last name of the patient.
     */
    public String getLastName() {
    	return this.lastName;
    }
    
    /**
     * Sets the last name of the patient.
     *
     * @param lastName The last name of the patient.
     */
    public void setLastName(String lastName) {
    	this.lastName = lastName;
    }
    
    /**
     * Gets the gender of the patient.
     *
     * @return The gender of the patient.
     */
    public String getGender() {
    	return this.gender;
    }
    
    /**
     * Sets the gender of the patient.
     *
     * @param gender The gender of the patient.
     */
    public void setGender(String gender) {
    	this.gender = gender;
    }
    
    /**
     * Gets the birth year of the patient.
     *
     * @return The birth year of the patient.
     */
    public int getBirth() {
    	return this.birthYear;
    }
    
    /**
     * Sets the birth year of the patient.
     *
     * @param birthYear The birth year of the patient.
     */
    public void setBirthYear(int birthYear) {
    	this.birthYear = birthYear;
    }
    
    /**
     * Calculates and returns the current year.
     *
     * @return The current year.
     */
    public int getCurrentYear() {
    	Year thisYear = Year.now(); 
    	this.currentYear = thisYear.getValue();
    	return this.currentYear;
    }
    
    /**
     * Gets the height of the patient in inches.
     *
     * @return The height of the patient in inches.
     */
    public double getHeight() {
    	return this.height;
    }
    
    /**
     * Sets the height of the patient in inches.
     *
     * @param height The height of the patient in inches.
     */
    public void setHeight(double height) {
    	this.height = height;
    }
    
    /**
     * Gets the weight of the patient in pounds.
     *
     * @return The weight of the patient in pounds.
     */
    public double getWeight() {
    	return this.weight;
    }
    
    /**
     * Sets the weight of the patient in pounds.
     *
     * @param weight The weight of the patient in pounds.
     */
    public void setWeight(double weight) {
    	this.weight = weight;
    }
    
    /**
     * Calculates and returns the age of the patient in years.
     *
     * @return The age of the patient in years.
     */
    public int getAge() {
    	getCurrentYear();
    	return this.currentYear - this.birthYear;
    }
    
    /**
     * Displays the patient's health data
     */ 
	public void displayMyHealthData(){ 

	        System.out.println("Patient's Health Data:");
	        System.out.printf("Name: %s %s%n", firstName, lastName);
	        System.out.printf("Gender: %s%n", gender);
	        System.out.printf("Birth Year: %d%n", birthYear);
	        System.out.printf("Age: %d%n", getAge());
	        System.out.printf("Height: %.2f inches%n", height);
	        System.out.printf("Weight: %.2f pounds%n", weight);
	        
	        System.out.printf("Maximum Heart Rate: %d%n", calculateMaximumHeartRate(getAge()));
	        System.out.printf("Minimum Target Heart Rate: %d%n", calculateMinimumTargetHeartRate(calculateMaximumHeartRate(getAge())));
	        System.out.printf("Maximum Target Heart Rate: %d%n", calculateMaximumTargetHeartRate(calculateMaximumHeartRate(getAge())));

	        System.out.printf("BMI: %.2f%n", calculateBMI(weight, height));

	       System.out.println("BMI VALUES");
	       System.out.println("Underweight: less than 18.5");
	       System.out.println("Normal:      between 18.5 and 24.9");
	       System.out.println("Overweight:  between 25 and 29.9");
	       System.out.println("Obese:       30 or greater");   
	} 
}
