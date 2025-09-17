import java.util.Scanner;

/**
* Get mass of an object and determine energy released.
* @author  Jack Turcotte
* @version 1.0
* @since   2025-09-17
*/

// Defines the class
public final class Einstein {

    /**
     * This is a private constructor used to
     * satisfy the style checker.
     * @exception IllegalStateException Utility Class
     * @see IllegalStateException
     */
    private Einstein() {
        throw new IllegalStateException("Utility Class");
    }

    /**
     * Main method.
     *
     * @param args Unused.
     */

    // Get input, calculate energy released to show user

    public static void main(final String[] args) {
        // Get user input
        System.out.println("Energy release calculator");
        System.out.println("Enter mass of your object: ");

        // Create scanner, get input
        final Scanner scanner = new Scanner(System.in);
        final String massString = scanner.nextLine();

        final double SPEED_OF_LIGHT = 2.998 * Math.pow(10, 8);

        // Check if input was a valid number
        try {
            double mass = Double.parseDouble(massString);
            if (mass > 0) {
                double energy = mass * Math.pow(SPEED_OF_LIGHT, 2);
                System.out.println("The energy released by your object"
                + "moving at the speed of light is " + energy + "J");
            } else {
                System.out.println("Please enter a positive mass");
            }

        } catch (NumberFormatException e) {

            //If number format exception, warn user
            System.out.println("Please enter a positive mass that is a number");
        } finally {

            // Either way, close the scanner
            scanner.close();
        }
    }
}
