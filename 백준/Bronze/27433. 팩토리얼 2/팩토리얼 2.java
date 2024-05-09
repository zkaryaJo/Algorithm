import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println(factorial(input));
        
    }
    
    public static long factorial(long n){
        if(n == 0) return 1;
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        return n*factorial(n-1);
        
    }
}