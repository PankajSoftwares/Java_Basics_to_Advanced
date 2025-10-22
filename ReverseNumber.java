public class ReverseNumber {

    public static void main(String[] args) {
        int num = 12345;
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;   // Get last digit
            rev = rev * 10 + digit; // Add digit to reversed number
            num = num / 10;         // Remove last digit
        }

        System.out.println("Reversed Number: " + rev);
    }
}
