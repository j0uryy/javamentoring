import java.util.Scanner;

public class Calculator {
    public int calculateAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your first number");
        int num1 = scanner.nextInt();

        System.out.println("Input your second number");
        int num2 = scanner.nextInt();

        System.out.println("Input your third number");
        int num3 = scanner.nextInt();

        int average = (num1 + num2 + num3) / 3;

        return average;
    }
}
