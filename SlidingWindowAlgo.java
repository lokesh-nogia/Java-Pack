public class SlidingWindowAlgo {
    
    public static void main(String[] args) {
        int[] arr = {6,4,3,1,9,2,7,5};
        int windowSize = 3;
        System.out.println(maxThreeSetSum(arr, windowSize));
    }

    public static int maxThreeSetSum(int[] arr, int size){
        int max=0;
       

        for(int i=0;i<arr.length - size + 1;i++){
            int sum=0;
            for(int j=0;j<size;j++){
                sum += arr[i+j];
            }

            max = Math.max(max, sum);
        }

        return max;
    }

}
