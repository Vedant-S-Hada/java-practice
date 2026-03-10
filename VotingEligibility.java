// Program to check voting eligibility

import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variable declaration
        int age;

        // Get user input
        System.out.print("Enter your age: ");
        age = input.nextInt();

        // Check eligibility
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        input.close();
    }
}