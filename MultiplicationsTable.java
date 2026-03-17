
import java.util.Scanner;

public class MultiplicationsTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int[] result = new int[10];

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            result[i - 1] = number * i;
        }

        for (int i = 1; i <= result.length; i++) {
            System.out.println(number + " * " + i + " = " + result[i - 1]);
        }

        input.close();
    }
}