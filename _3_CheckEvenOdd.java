
import java.util.Scanner;

public class _3_CheckEvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the numbers: ");
        int n = sc.nextInt();
        //int n = new java.util.Scanner(System.in).nextInt();

        System.out.println(n%2 == 0 ? n+" is Even.":n+" is Odd.");

        sc.close();
    }
    
}
