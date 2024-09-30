public class SecondHigest {
    public static void main(String[] args) {
        int[] array = {1,6,7,3,9,2,44,55,685,12,1222,475,632,5514};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i:array) {
            if (i>highest) {
                secondHighest = highest;
                highest = i;
            }
            else if(i>secondHighest){
                secondHighest = i;
            }
        }

        System.out.println(secondHighest);
    }
}
