import java.util.Scanner;

public class Factorial {
    public static long factorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Factorial can be calculated only for numbers between 0 and 20");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
