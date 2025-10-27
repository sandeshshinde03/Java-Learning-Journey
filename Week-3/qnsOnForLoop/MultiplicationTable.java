//Print the multiplication table of any number.
public class MultiplicationTable {
    public static void multiTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        MultiplicationTable.multiTable(5);
    }
}
