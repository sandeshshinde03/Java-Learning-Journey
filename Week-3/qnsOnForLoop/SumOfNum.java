

//Print the sum of numbers from 1 to n.

import java.util.Scanner;

public class SumOfNum {
    public static void sumOfNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number (n): ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("sum of numbers 1 to " + n + " : " + sum);
        sc.close();
    }

    public static void main(String[] args) {
        SumOfNum.sumOfNumbers();

    }
}
