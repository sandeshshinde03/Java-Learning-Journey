import java.util.Scanner;

public class Factorial {
    public static void fact() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is : " + fact);
    }

    public static void main(String[] args) {
        Factorial.fact();
    }
}
