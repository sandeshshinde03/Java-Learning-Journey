
import java.util.Scanner;

//Write a program to check whether a number is even or odd using if-else.
public class EvenOrOdd {

    public void checkEvenOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check even of odd: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        sc.close();
    }

    public static void main(String[] args) {
        EvenOrOdd obj = new EvenOrOdd();
        obj.checkEvenOdd();
    }
}
