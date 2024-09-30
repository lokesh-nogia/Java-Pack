import java.util.ArrayList;

public class Questions {
    
    public static void main(String[] args) {
        
        System.out.println("Factorial: "+fact(5));
        System.out.println("Fibo: "+nthFiboNum(6));
        System.out.println("Sum Digit "+ sumDigit(1234));

    }

    public static int fact(int a){
        
        return a==1 ? 1 :a*fact(a-1);
    }

    public static int nthFiboNum(int a){
        if(a<2){
            return a;
        }
        return nthFiboNum(a-1) + nthFiboNum(a-2); 
    }

    public static int sumDigit(int a){
        return a==0 ? 0 : (a%10) + sumDigit(a/10);
    }


    public static ArrayList<String> stringPermutation(String str){
        return null;
    }
}


