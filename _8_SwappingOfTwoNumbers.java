import java.util.Scanner;

public class _8_SwappingOfTwoNumbers{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter a or num1: ");
        int a = sc.nextInt();
        //int num1 = sc.nextInt();
        
        System.out.print("Enter b or Num2: ");
        int b = sc.nextInt();
        //int num2 = sc.nextInt();
        
        System.out.println("Before Swapping: a = "+a+" And Num2= "+b);
        //System.out.println("Before Swapping: Num1 = "+num1+" And Num2= "+num2);

        // Without using 3rd Variable
        a ^= b;
        b ^= a;
        a ^= b;
        
        
        // // Using 3rd Variable
        // int temp = num1;
        // num1 = num2;
        // num2 = temp;

        System.out.println("After Swapping: a = "+a+" And b= "+b);
        //System.out.println("After Swapping: Num1 = "+num1+" And Num2= "+num2);

        sc.close();

    }
}