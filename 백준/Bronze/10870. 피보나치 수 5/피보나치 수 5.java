import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.print(pivo(scan.nextInt()));
        
    }
    public static long pivo(long n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        
        return pivo(n-1)+pivo(n-2);
    }
    
}