import java.util.Scanner;

public class _7_LeapYearCheck {

    public void leapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("This is a Leap Year: " + year);
        } else {
            System.out.println("This is not a Leap Year: " + year);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // create object to call non-static method
        _7_LeapYearCheck obj = new _7_LeapYearCheck();
        obj.leapYear(year);

        sc.close();
    }
}
