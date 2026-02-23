// Program 4: User Input and Type Conversion

import java.util.Scanner;

public class UserInputExample {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Variables
        String name;
        int age;
        double height;

        // Taking input
        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter your height (in cm): ");
        height = input.nextDouble();

        // Type conversion (cm to meters)
        double heightInMeters = height / 100;

        // Output
        System.out.println("\nUser Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + heightInMeters + " meters");

        input.close();
    }
}