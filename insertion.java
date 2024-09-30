public class insertion {
    public static void main(String[] args) {
        int[] array = {1,2,7,6,4,9,12,11};

        for(int i=0;i<array.length;i++){
            int n=i;
            while (n>0 && array[n-1]>array[n]) {
                int k = array[n];
                array[n] = array[n-1];
                array[n-1] = k;
                n--;
            }
        }

        for (int i : array) {
            System.out.print(i+" ");
        }
    }
}
