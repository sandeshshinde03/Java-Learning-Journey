
//Print all perfect numbers between 1 and 1000.(A perfect number = sum of its divisors (excluding itself) equals the
// number itself, e.g., 6 → 1 + 2 + 3 = 6)
public class PerfectNum {
    public static void perfectNumbers() {
        for (int i = 1; i <= 1000; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        PerfectNum.perfectNumbers();
    }
}
