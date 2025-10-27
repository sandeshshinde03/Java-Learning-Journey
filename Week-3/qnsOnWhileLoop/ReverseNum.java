
import java.util.Scanner;

public class ReverseNum {

    public static void reverse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();
        int reversed = 0;


        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed number: " + reversed);
        sc.close();
    }

    public static void main(String[] args) {
        reverse();
    }
}
