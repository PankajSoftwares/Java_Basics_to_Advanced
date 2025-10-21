import java.util.Scanner;

public class _9_FactorialOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        long fact = 1;

        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        System.out.print("The factorial of a num is:" +fact);
    }
}
