    public class Main {
        public static void main(String[] args) {
            Calculator calculator = new Calculator();
            int sum = calculator.AddTwoNumbers(7, 2);
            System.out.println("Sum is " + sum);

            int difference = calculator.SubtractTwoNumbers(10, 2);
            System.out.println("The difference is " + difference);

            int result = calculator.SubtractTwoNumbers(sum, difference);
            System.out.println("Result of subtracting  is " + result);
        }
    }
