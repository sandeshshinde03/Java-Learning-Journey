public class ReverseString {

    public static String reverseWithBuiltIn(String s) {
        return new StringBuilder(s).reverse().toString();
    }


    public static String reverseWithoutBuiltIn(String s) {
        char[] arr = s.toCharArray();
        String rev = "";
        for(int i = arr.length-1; i>=0; i--) {
            rev += arr[i];             
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverseWithBuiltIn("hello"));
        System.out.println(reverseWithoutBuiltIn("hello"));
    }
}
