import java.util.Scanner;

//Write a program to check if a person is eligible to vote (age ≥ 18) and print “Eligible” or “Not Eligible”.
public class EligibleForVote {
    public void checkEligibility() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
        sc.close();
    }

    public static void main(String[] args) {
        EligibleForVote obj = new EligibleForVote();
        obj.checkEligibility();
    }
}
