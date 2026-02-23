// Program 2: Total Income

import java.util.Scanner;

public class TotalIncome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salary, bonus;

        System.out.print("Enter salary: ");
        salary = input.nextDouble();

        System.out.print("Enter bonus: ");
        bonus = input.nextDouble();

        double totalIncome = salary + bonus;

        System.out.println("Salary: INR " + salary +
                ", Bonus: INR " + bonus +
                "\nTotal Income: INR " + totalIncome);

        input.close();
    }
}