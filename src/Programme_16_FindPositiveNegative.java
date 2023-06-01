import java.util.Scanner;

public class Programme_16_FindPositiveNegative {

    /**
     * Write the java program to check if entered number is "POSITIVE" , "NEGATIVE" or "ZERO"
     */
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        // Close the scanner
        scanner.close();

    }

    // Finding the number is POSITIVE , NEGATIVE OR ZERO
    public static void findNumberIsPositiveNegativeOrZero(int number) {
        if (number > 0) {
            System.out.println(number + "   is a POSITIVE number");
        } else if (number < 0) {
            System.out.println(number + "   is a NEGATIVE number");
        } else {
            System.out.println(number + "   is ZERO");
        }

    }
}