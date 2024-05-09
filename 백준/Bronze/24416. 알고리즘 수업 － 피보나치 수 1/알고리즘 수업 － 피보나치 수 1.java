import java.util.*;

public class Main {
    
	static int[] arr = new int[45];
    static int countRecur = 0;
    static int countDP = 0;
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        fibByRecur(n);
        fibByDP(n);
        System.out.println(""+countRecur+" "+countDP);
    }    
    
    //재귀
    public static int fibByRecur(int n){
        
        if(n==1 || n==2) {
        	countRecur++;
        	return n;
        }
        
        return fibByRecur(n-1) + fibByRecur(n-2);
    }
    
    //DP
    public static int fibByDP(int n){
        arr[1] = 1;
        arr[2] = 1;
        
        if(n>2){
            for(int i=3; i<=n; i++){
                countDP++;
                arr[i] = arr[i-1]+arr[i-2];
            }
        }
        return arr[n];
    }
    
}