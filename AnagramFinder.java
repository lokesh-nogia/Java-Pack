import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramFinder {

    public static List<List<String>> findAnagrams(String words[],String queries[]){
        Map<String,List<String>> map = new HashMap<>();
        for (String word : words) {
            String sortedWord = sortString(word);
            map.putIfAbsent(sortedWord, new ArrayList<>());
            map.get(sortedWord).add(word);
        }

        List<List<String>> result = new ArrayList<>();
        for (String query : queries) {
            String sortedQuery = sortString(query);
            List<String> anagrams = map.getOrDefault(sortedQuery,new ArrayList<>());
            Collections.sort(anagrams);
            result.add(anagrams);
        }
        return result;
    }

    public static String sortString(String word){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    public static void main(String[] args) {
         String[] words = {"listen", "silent", "enlist", "google", "gooegl", "banana"};
        String[] queries = {"silent", "gooegl", "apple"};

        List<List<String>> anagrams = findAnagrams(words, queries);

        // Print the result
        for (List<String> list : anagrams) {
            System.out.println(list);
        }        
    }

}
