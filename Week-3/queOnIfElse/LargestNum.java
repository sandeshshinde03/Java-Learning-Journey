
import java.util.Scanner;

//Write a program to find the largest of two numbers using if-else.
public class LargestNum {


    public void findLargest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println("Both numbers are equal");
        } else if (num1 > num2) {
            System.out.println(num1 + " is largest number");
        } else {
            System.out.println(num2 + " is largest number");
        }
        sc.close();
    }


    public static void main(String[] args) {
        LargestNum obj = new LargestNum();
        obj.findLargest();
    }
}
