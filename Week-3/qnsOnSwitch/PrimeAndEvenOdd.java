
//Write a menu-driven program using switch: 1 → Check Even/Odd      2 → Check Prime      3 → Exit

import java.util.Scanner;

public class PrimeAndEvenOdd {
    public static void MenuDrivenProgram() {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Check Even/Odd");
            System.out.println("2. Check Prime");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num1 = sc.nextInt();
                    if (num1 % 2 == 0)
                        System.out.println(num1 + " is Even.");
                    else
                        System.out.println(num1 + " is Odd.");
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int num2 = sc.nextInt();
                    boolean isPrime = true;

                    if (num2 <= 1) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i <= num2 / 2; i++) {
                            if (num2 % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }

                    if (isPrime)
                        System.out.println(num2 + " is Prime.");
                    else
                        System.out.println(num2 + " is Not Prime.");
                    break;

                case 3:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (ch != 3);

        sc.close();
    }

    public static void main(String[] args) {
        PrimeAndEvenOdd.MenuDrivenProgram();
    }
}
