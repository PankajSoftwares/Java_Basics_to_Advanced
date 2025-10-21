import java.util.Scanner;

public class _10_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        long a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long fib = a + b;
            a = b;
            b = fib;
        }

        sc.close();
    }
}
