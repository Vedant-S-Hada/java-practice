// Program to check Leap Year

import java.util.Scanner;

class LeapYearCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year;

        System.out.print("Enter a year: ");
        year = input.nextInt();

        if (year >= 1582 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {

            System.out.println(year + " is a Leap Year.");

        } else {

            System.out.println(year + " is NOT a Leap Year.");

        }

        input.close();
    }
}