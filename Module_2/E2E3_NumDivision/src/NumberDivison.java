public class NumberDivison {
    public int divideIfPositive(int num1, int num2) {
        if (num1 > 0 && num2 > 0 ) {
            return num1 / num2;
        }
        else {
            return 0;
        }
    }
}