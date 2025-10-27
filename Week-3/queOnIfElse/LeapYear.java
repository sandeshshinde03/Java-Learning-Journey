//Write a program to check whether a year is a leap year or not using if-else conditions.

import java.util.Scanner;

public class LeapYear {
    public void checkLeapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not Leap Year");
        }
        sc.close();
    }

    public static void main(String[] args) {
        LeapYear obj = new LeapYear();
        obj.checkLeapYear();
    }
}
