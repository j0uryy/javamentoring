import java.util.Scanner;

public class ArgumentChecker {
    public void CheckArgument() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = scanner.nextInt();

        if(number < 0) {
            System.out.println("Your number is negative "); }
            else if (number > 0) {
                System.out.println("Your number is positive"); }
                else {
                    System.out.println("Your number equals zero!");
                }
            }
        }
