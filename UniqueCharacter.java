/**
 * UniqueCharacter
 */
public class UniqueCharacter {

    public static void main(String[] args) {
        
        String str = "world";
        System.out.println(isUnique(str, 0));
    }

    // public static boolean isUnique(String str, int i){
    //     for (int j = 0; j < str.length(); j++) {
    //         for (int j2 = j+1; j2 < str.length(); j2++) {
    //             if(str.charAt(j) == str.charAt(j2)){
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }

    public static boolean isUnique(String str, int index){
        if(index == str.length()-1){
            return true;
        }
        for (int i = index+1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(index)){
                return false;
            }
        }
        return isUnique(str, index+1);
    }
}