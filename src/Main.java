import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meters = 0;
        boolean validInput = false;

        // Loop for inputting measurement in meters
        do {
            System.out.print("Enter measurement in meters: ");
            if (in.hasNextDouble()) {
                meters = in.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.next(); // Clear the invalid input
            }
        } while (!validInput);

        // Convert meters to miles
        double miles = meters * 0.000621371;
        // Convert meters to feet
        double feet = meters * 3.28084;
        // Convert meters to inches
        double inches = meters * 39.3701;

        // Output the results
        System.out.println("Measurement in meters: " + meters);
        System.out.println("Measurement in miles: " + miles);
        System.out.println("Measurement in feet: " + feet);
        System.out.println("Measurement in inches: " + inches);

        in.close();
    }
}
