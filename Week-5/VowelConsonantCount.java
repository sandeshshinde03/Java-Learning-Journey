public class VowelConsonantCount {

    static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }

    // WITH inbuilt
    public static void withBuiltIn(String s){
        int v=0,c=0;
        for(char ch : s.toLowerCase().replace(" ","").toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                if("aeiou".contains(ch+"")) v++;
                else c++;
            }
        }
        System.out.println("v="+v+" c="+c);
    }

    // WITHOUT inbuilt
    public static void withoutBuiltIn(String s){
        int v=0,cnt=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z') ch=(char)(ch+32); // convert manually
            if(ch>='a'&&ch<='z'){
                if(isVowel(ch)) v++;
                else cnt++;
            }
        }
        System.out.println("v="+v+" c="+cnt);
    }

    public static void main(String[] args){
        withBuiltIn("Hello");
        withoutBuiltIn("Hello");
    }
}
