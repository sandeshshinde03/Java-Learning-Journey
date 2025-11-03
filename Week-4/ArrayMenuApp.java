import java.util.Scanner;

public class ArrayMenuApp {

    static void displayArray(int[] arr) {
        System.out.print("Array: ");
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr)
            if (num > max)
                max = num;
        return max;
    }

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr)
            if (num < min)
                min = num;
        return min;
    }

    static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr)
            sum += num;
        return sum;
    }

    static void reverseArray(int[] arr) {
        System.out.print("Reversed Array: ");
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Display Array");
            System.out.println("2. Find Maximum");
            System.out.println("3. Find Minimum");
            System.out.println("4. Find Sum");
            System.out.println("5. Reverse Array");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> displayArray(arr);
                case 2 -> System.out.println("Maximum: " + findMax(arr));
                case 3 -> System.out.println("Minimum: " + findMin(arr));
                case 4 -> System.out.println("Sum: " + findSum(arr));
                case 5 -> reverseArray(arr);
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);
    }
}
