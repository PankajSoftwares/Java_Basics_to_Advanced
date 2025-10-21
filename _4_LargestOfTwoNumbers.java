
import java.util.Scanner;

public class _4_LargestOfTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number a: ");
        int a = sc.nextInt();

        System.out.print("Enter the number b: ");
        int b = sc.nextInt();

        if (a != b) System.out.println(a > b ? "a: " + a + " is Largest" : "b: " + b + " is largest");
        else System.out.println("a and b Both are Equals");
    
        sc.close();
    }
}
