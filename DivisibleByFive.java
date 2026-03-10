// Program to check if a number is divisible by 5

import java.util.Scanner;

class DivisibleByFive {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare variable
        int number;

        // Take input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Check divisibility
        if (number % 5 == 0) {
            System.out.println("The number " + number + " is divisible by 5.");
        } else {
            System.out.println("The number " + number + " is NOT divisible by 5.");
        }

        input.close();
    }
}