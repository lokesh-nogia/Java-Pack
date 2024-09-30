import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * NonRepeat
 */
public class NonRepeat {

    public static Character nonRepeatChar(String str){

        HashMap<Character,Integer> countMap = new HashMap<>();

        for(char ch : str.toCharArray()){
            countMap.put(ch, countMap.getOrDefault(ch, 0)+1);
        }
        System.out.println(countMap);
        for (char ch : str.toCharArray()) {
            if(countMap.get(ch) == 1){
                return ch;
            }
        }
        return null;
     }
     public static int findSubStringLength(String str){

        int n = str.length();
        int max=0;
        int left=0, right=0;
        Set<Character> ch = new HashSet<>();
System.out.println(ch);
        while(right<n){
            if (!ch.contains(str.charAt(right))) {
                ch.add(str.charAt(right));
                right++;
                max = Math.max(max, right-left);
                System.out.println(ch);
            }
            else{
                ch.remove(str.charAt(left));
                left++;
                System.out.println(ch);
            }
        }
        return max;
     }
    public static void main(String[] args) {
        String str = "swiss";
        System.out.println(nonRepeatChar(str));
       //nonRepeatChar(str);
       String str1 = "abcdeafbc";
       System.out.println(findSubStringLength(str1));

    }
}