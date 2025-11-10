public class PalindromeString {

    public static boolean withBuiltIn(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static boolean withoutBuiltIn(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(withBuiltIn("madam"));
        System.out.println(withoutBuiltIn("madam"));
    }
}
