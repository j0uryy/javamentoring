import java.util.Scanner;

public class PasswordChecker {
    public void CheckPasswordLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password:");
         String password = scanner.nextLine();

        if(password.length() > 8 && password.length() < 12) {
            System.out.println("Your password is great! "); }
        else {
            System.out.println("Your password doesn't look too secure... It should be longer than 8 and shorter than 12 characters");
        }
    }
}

