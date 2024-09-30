public class Bubblesort {

    public static void main(String[] args) {
        int[] array = {1,2,8,7,6,9,4,3};

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }

        for (int i : array) {
            System.out.print(i+" ");
        }
    }
    
}
