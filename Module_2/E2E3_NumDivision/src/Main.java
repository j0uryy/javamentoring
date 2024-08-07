import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberDivison divisionChecker = new NumberDivison();

        System.out.println("Input your first number:");
        int num1 = scanner.nextInt();

        System.out.println("Input your second number:");
        int num2 = scanner.nextInt();

        int result = divisionChecker.divideIfPositive(num1, num2);

        if (result == 0 && (num1 <= 0 || num2 <= 0)) {
            System.out.println("Division cannot be performed. Either the numerator or denominator is not greater than zero.");
        } else {
            System.out.println("Result of the division is: " + result);
        }
    }
}
