
import java.util.Scanner;

public class SumOfDigit {

    public static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int res = num % 10;
            sum = sum + res;
            num /= 10;
        }
        System.out.print("Addition: " + sum);
        sc.close();
    }

    public static void main(String[] args) {
        SumOfDigit.sum();

    }
}
