package assign1;

/**
* MyHealthDataBase is a base class to be extended for the Electronic Health Records (EHR) System,
* also known as Assignment 1.  It contains a method to calculate BMI and will contain other methods.
* @author Gulnur Ospanova
* @version 1.1
* @since Java 1_8.301
* @see MyHealthData
*/

public class MyHealthDataBase
{
    /** 
    * This method returns the calculated Body Mass Index (BMI) from data provided.
    * @param weightParam Weight of the patient in pounds.
    * @param heightParam Height of the patient in inches.
    * @return the calculated BMI for the patient.
    */
    public double calculateBMI(double weightParam, double heightParam)
    {
        return weightParam * 703 / (heightParam * heightParam);
    }
    
    /**
     * Calculates and returns the maximum heart rate for the patient based on their age.
     *
     * @param age - age of the patient in years.
     * @return the calculated maximum heart rate.
     */
    public int calculateMaximumHeartRate(int age) {
    	return 220 - age;
    }
    
    /**
     * Calculates and returns the minimum target heart rate for the patient based on their maximum heart rate.
     *
     * @param maxHeartRate - the maximum heart rate of the patient.
     * @return the calculated minimum target heart rate.
     */
    public int calculateMinimumTargetHeartRate(int maxHeartRate) {
        return (int) (maxHeartRate * 0.50);
    }
    
    
    /**
     * Calculates and returns the maximum target heart rate for the patient based on their maximum heart rate.
     *
     * @param maxHeartRate -the maximum heart rate of the patient.
     * @return the calculated maximum target heart rate.
     */
    public int calculateMaximumTargetHeartRate(int maxHeartRate) {
        return (int) (maxHeartRate * 0.85); 
    }
    
}
