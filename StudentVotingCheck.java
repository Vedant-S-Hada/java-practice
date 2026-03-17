import java.util.Scanner;

public class StudentVotingCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfStudents = 10;
        int[] ages = new int[numberOfStudents];

        // Taking input
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        System.out.println("\nVoting Eligibility:");

        // Checking voting eligibility
        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < 0) {
                System.err.println("Invalid age entered.");
            }
            else if (ages[i] >= 18) {
                System.out.println("Student with age " + ages[i] + " can vote.");
            }
            else {
                System.out.println("Student with age " + ages[i] + " cannot vote.");
            }

        }

        input.close();
    }
}