

import java.util.Scanner;

//Print numbers from 1 to n using a for loop.
public class PrintNum {
    public static void printNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number (n): ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    public static void main(String[] args) {
        PrintNum.printNumber();
    }
}
