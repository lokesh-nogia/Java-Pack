import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

    // public static String[] findAnagrams(String words){

        
    //     return wordsArray;

    // }
    // public static String sortedWord(String word){
    //     char[] ch = word.toCharArray();
    //     Arrays.sort(ch);
    //     return new String(ch);
    // }
    // public static void main(String[] args) {
    //     String word = "eat tea ate tan nat bat";
    //     System.out.print("[");
    //     for(String str: findAnagrams(word)){
    //         System.out.print("'"+str+"',");
    //     }
    //     System.out.print("]");
    //     System.out.println();

    // }

    public static void main(String[] args) {

        String str = "eat";
        String str1 = "tea";
        
        boolean anagram = false;
        if(str.length() != str1.length()){
            anagram=false;
        }
        else{
            char[] ch1 = str.toCharArray();
            char[] ch2 = str1.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            anagram = Arrays.equals(ch1, ch2);

            
        }

        if(anagram == true){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }
    }

}