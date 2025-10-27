
import java.util.Scanner;

public class LargestNumbtwThreeNum {
    public void largestNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is largest number");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is largest number");
        } else {
            System.out.println(num3 + " is largest number");
        }
    }

    public static void main(String[] args) {
        LargestNumbtwThreeNum obj = new LargestNumbtwThreeNum();
        obj.largestNum();
    }
}
