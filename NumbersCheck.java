 import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {

                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive Even");
                } else {
                    System.out.println(numbers[i] + " is Positive Odd");
                }

            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } else {
                System.out.println("Number is Zero");
            }

        }

        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last elements are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is greater.");
        } else {
            System.out.println("Last element is greater.");
        }

        input.close();
    }
} 
    

