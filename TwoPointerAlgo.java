import java.util.HashMap;

public class TwoPointerAlgo {

    //Famous TwoSum like question.

    public static void main(String[] args) {
        int[] arr = {1,9,5,8,6,2,10};
        int target = 11;

        TwoSum solu = new TwoSum();
        for (int i : solu.viaBruteForce(arr, target)) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i : solu.viaHashMap(arr, target)) {
            System.out.print(i+" ");
        }
    }
    
}

class TwoSum{

    //in this 2 forloop used- with 2 pointer
    // i, j.
    int[] viaBruteForce(int[] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }

    int[] viaHashMap(int[] arr,int target){
        HashMap<Integer,Integer> checkIndexMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
           Integer element = checkIndexMap.get(arr[i]);
           if (element!= null) {
                return new int[]{element,i};
           }
           else{
                checkIndexMap.put(target-arr[i], i);
           }  
        }

        return new int[]{0,0};
        
    }
}
