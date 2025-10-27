import java.util.Scanner;

//Write a switch program to check if a character is a vowel or consonant (a, e, i, o, u → vowel).
public class CheckIsVowel {

    public static void isVowel() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        switch (ch) {
            case 'a':
                System.out.println(ch + " is a vowel.");
                break;
            case 'e':
                System.out.println(ch + " is a vowel.");
                break;
            case 'i':
                System.out.println(ch + " is a vowel.");
                break;
            case 'o':
                System.out.println(ch + " is a vowel.");
                break;
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                if (ch >= 'a' && ch <= 'z')
                    System.out.println("Consonant");
                else
                    System.out.println("Invalid input! Please enter an alphabet character.");
        }
        sc.close();
    }

    public static void main(String[] args) {
        CheckIsVowel.isVowel();
    }
}
