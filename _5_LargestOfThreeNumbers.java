
import java.util.Scanner;

public class _5_LargestOfThreeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println("Enter the value of c: ");
        int c = sc.nextInt();

        if (a != b && b != c || c != a) {
            int max = a;

            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }

            System.out.println("Largest is: " + max);

        }
        else System.err.println("There is Equal numbers");

    }
}
