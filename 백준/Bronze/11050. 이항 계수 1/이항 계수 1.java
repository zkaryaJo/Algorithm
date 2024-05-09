import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(fac(a)/fac(a-b)/fac(b));
    }
    
    public static int fac(int n){
        if(n == 0) return 1;
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        return n*fac(n-1);
        
    }
}