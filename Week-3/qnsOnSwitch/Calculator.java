
import java.util.Scanner;

//Create a calculator using switch that performs +, -, *, / operations based on user choice.
public class Calculator {
    public void simpleCal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.print("Enter your choice for operation: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Addition: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Division: " + (num1 / num2));
                } else {
                    System.out.println("Division by zero is not allowed!");
                }
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
        sc.close();
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.simpleCal();

    }
}
