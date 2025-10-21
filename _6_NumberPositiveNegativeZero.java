import java.util.Scanner;

public class _6_NumberPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        double n = sc.nextDouble();
        
        if (n == 0) {
            System.out.println("Number is zero!");
        } else if (n > 0) {
            System.out.println("Positive number!");
        } else if (n < 0) {
            System.out.println("Negative number!");
        } else {
            System.out.println("Enter a correct number!");
        }
        
        sc.close();
    }
}



// import java.util.Scanner;

// public class _6_NumberPositiveNegativeZero {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter a number: ");
//         double n = sc.nextDouble();
        
//         if(n == 0) System.out.println(" Number is zero!");
//         if(n > 0) System.out.println("Positve number!");
//         if(n < 0) System.out.println("Negative number!");
//         //else { System.out.println("Enter Correct number!");}
    
//         sc.close();
//     }
// }
