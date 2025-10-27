
import java.util.Scanner;

//Write a program using switch to print the month name based on a number (1 = Jan, 2 = Feb, …, 12 = Dec).
public class MonthName {

    public void printMonth() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 12: ");
        int month = sc.nextInt();

        switch (month) {
            // Instead of ':' colon, using '->' arrow syntax automatically breaks after each case.
            // No need to write a separate 'break' statement.
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid number! Please enter 1-12.");
        }

        sc.close();
    }

    public static void main(String[] args) {
        MonthName obj = new MonthName();
        obj.printMonth();
    }
}
