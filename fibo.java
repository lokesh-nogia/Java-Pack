public class fibo {

    public static int  fiboNaci(int a){
    
        if(a == 0 ) return 0;
        if (a == 1) {
            return 1;
        }else{
            return fiboNaci(a-1)+fiboNaci(a-2);
        }
    }

    public static void main(String[] args) {
     int n = 5;
    System.out.println(fiboNaci(n));
        
    }
    
}
