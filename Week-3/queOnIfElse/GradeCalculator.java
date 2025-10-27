//Write a program to input marks and print grades:
// 90–100: A+     75–89: A     60–74: B    below 60: Fail

import java.util.Scanner;

public class GradeCalculator {
    public void gradeCal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks (0-100): ");
        int marks = sc.nextInt();
        if (marks >= 90 && marks <= 100) {
            System.out.println("A+");
        } else if (marks >= 75 && marks <= 89) {
            System.out.println("A");
        } else if (marks >= 60 && marks <= 74) {
            System.out.println("B");
        } else {
            System.out.println("Fail");
        }

    }

    public static void main(String[] args) {
        GradeCalculator obj = new GradeCalculator();
        obj.gradeCal();
    }
}
