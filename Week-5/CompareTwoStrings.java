public class CompareTwoStrings {

    public static boolean withBuiltIn(String a,String b){
        return a.equals(b);
    }

    public static boolean withoutBuiltIn(String a,String b){
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(withBuiltIn("abc","abc"));
        System.out.println(withoutBuiltIn("abc","adc"));
    }
}
