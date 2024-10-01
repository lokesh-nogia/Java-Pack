import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindRepatedNumber {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,1,2,6,8,9,3};

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    System.out.println(array[i]);
                    
                }
            }
        }


        List<String> string = Arrays.asList("one","two","three");
        List<String> filteredList = string.stream().filter(s->s.startsWith("t")).collect(Collectors.toList());
        System.out.println(filteredList);
    }
    
}
