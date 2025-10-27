
//Print numbers from 1 to 5 using a while loop.
public class PrintNum {

    public static void printNumber() {
        int num = 1;
        while (num <= 5) {
            System.out.print(num + " ");
            num++;
        }
    }

    public static void main(String[] args) {
        PrintNum.printNumber();

    }
}
