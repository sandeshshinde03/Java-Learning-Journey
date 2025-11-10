import java.util.*;

public class FrequencyCount {

    // WITH inbuilt 
public static void wordFreqBuiltIn(String s) {

    String[] arr = s.split(" ");         
    boolean[] visited = new boolean[arr.length];

    for(int i = 0; i < arr.length; i++){
        if(visited[i]) continue;

        int count = 1;
        for(int j = i+1; j < arr.length; j++){
            if(arr[i].equals(arr[j])){
                count++;
                visited[j] = true;        
            }
        }

        System.out.println(arr[i] + " = " + count);
    }
}


    // WITHOUT inbuilt 
    public static void charFreqWithoutBuiltIn(String s){
        int[] freq = new int[256];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }

        for(int i=0;i<256;i++){
            if(freq[i]>0)
                System.out.println((char)i+" = "+freq[i]);
        }
    }

    public static void main(String[] args){
        wordFreqBuiltIn("apple banana apple");
        charFreqWithoutBuiltIn("aabcc");
    }
}
