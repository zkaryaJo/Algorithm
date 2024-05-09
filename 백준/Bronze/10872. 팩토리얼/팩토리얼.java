import java.util.*;

public class Main{
    public static int fac(int n){
        if(n == 0) return 1;
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        return n*fac(n-1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println(fac(scan.nextInt()));
    }
}