import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] array1 = {1,3,5};
        int[] array2 = {2,4,6};

        print(merge(array1, array2));
    }

    public static void print(int[] merge){
        System.out.println("Merged");
        for (int i : merge) {
            System.out.println(i+" ");
        }
    }

    public static int[] merge(int[] array1,int[] array2){

        //Approach one using Collections

       int mergeResult[] = new int[array1.length+array2.length];

       for (int i = 0; i < array1.length; i++) {
        if(array1[i]<array2[i]){
            mergeResult[i] = array1[i];
            for (int j = 0; j < array2.length; j++) {
                if (array1[j]>array2[j]) {
                    mergeResult[j] = array1[j];
                }
            }
        }
            System.out.println(array1[i]+"  "+array2[i]);
       }
       return mergeResult;

    }
    
}
