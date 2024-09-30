public class LexicographySmallestString {
    
    public static String findSmallestString(String input_str,int k){

        int n = input_str.length();
        int minLength = Integer.MAX_VALUE;
        System.out.println(minLength);
        String result = "";

        for (int i = 0; i < n; i++) {
            int count =0;
            for (int j = i; j < n; j++) {
                if (input_str.charAt(j)=='1') {
                    count++;
                }
                if (count == k) {
                    String currString = input_str.substring(i, j+1);
                    int currLength = j-i+1;

                    if (currLength < minLength || (currLength == minLength && currString.compareTo(result)<0)) {
                        minLength = currLength;
                        result = currString;
                    }
                    break;
                
                }

            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        String inputStr = "1101011001";
        int k=4;
        System.out.println(findSmallestString(inputStr, k));
    }
}
