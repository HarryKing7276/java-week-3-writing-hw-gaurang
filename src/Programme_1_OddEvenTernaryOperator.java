import java.util.Scanner;

public class Programme_1_OddEvenTernaryOperator {
/**
 *  1. Write a java program that tells us that input number is odd or even?
 *    HINT : use ternary operator ( ? :)
 */

public static void main(String[] args) {
    // Scanner declaration for reading input from console
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number:");
    int number = scanner.nextInt();
    isItOddEvenNumber(number);
    // Closing the scanner
    scanner.close();

}
// Checking the number is even or odd

    public static void isItOddEvenNumber(int number){
         // ternary operator is used
        String evenOrOdd = ( number / 2 == 0) ? "Even" : "Odd";
        System.out.println("The"+number+"is"+evenOrOdd+"number");

    }




}
