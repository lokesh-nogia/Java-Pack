public class factorial {
 
    public static void main(String[] args) {
        int a = 5;
        System.out.println(fact(a));
    }
    public static int fact(int a){
        if(a==1){
            return 1 ;

        }
        else{
            return (a * fact(a-1));
        }
    }
}
