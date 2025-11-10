public class SentenceSplit {

    public static String[] splitWithBuiltIn(String sentence){
        return sentence.split(" ");
    }

    public static String[] splitWithoutBuiltIn(String sentence){

        int count = 1;
        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' ') count++;
        }

        String[] words = new String[count];
        String word = "";
        int idx = 0;

        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                words[idx] = word;
                idx++;
                word = "";
            } else {
                word = word + sentence.charAt(i);
            }
        }
        words[idx] = word;

        return words;
    }

    public static void main(String[] args) {

        String[] a = splitWithBuiltIn("hi hello world");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

        String[] b = splitWithoutBuiltIn("hi hello world");
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }
}
