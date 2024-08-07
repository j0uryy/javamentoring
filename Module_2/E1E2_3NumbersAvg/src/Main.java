public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int average = calculator.calculateAverage();

        System.out.println("The average of the three numbers is " + average);
    }
}