// Program 3: Operator Precedence Example

public class OperatorPrecedenceDemo {

    public static void main(String[] args) {

        int result1 = 9 + 3 / 2 * 4 - 2;
        int result2 = (9 + 3) / 2 * 4 - 2;

        System.out.println("Without Parenthesis: " + result1);
        System.out.println("With Parenthesis: " + result2);
    }
}