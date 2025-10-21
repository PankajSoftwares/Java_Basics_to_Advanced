import java.util.Scanner;

public class _2_SumOfTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the numbers a and b respectively: ");
        int a = sc.nextInt(), b = sc.nextInt(), sum=a+b;

        System.out.println("The sum of a and b is:" +sum);

        sc.close();

    }
}

// import java.util.Scanner;

// public class _2_SumOfTwoNumbers {
//     //static int a, b;

//     public static int sumOfTwo(int a, int b){
        
//         return a+b;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
        
//         System.out.println(sumOfTwo(a,b));

//         sc.close();
//     }
// }


// import java.util.Scanner;

// public class _2_SumOfTwoNumbers {
//     static int a, b;

//     public static int sumOfTwo(int a, int b) {
//         return a + b;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         a = sc.nextInt();
//         b = sc.nextInt();
//         System.out.println(sumOfTwo(a, b));
//         sc.close();
//     }
// }
