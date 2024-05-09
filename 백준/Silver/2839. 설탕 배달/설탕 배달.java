import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[5];
        Arrays.fill(arr, -1);
        
        
        if(n%5==0) arr[0]=n/5;
        else if(n%5%3 == 0) arr[1]=n/5+n%5/3;
        else if(n%3 == 0) arr[2]=n/3;
        
    	int rest = n;
    	for(int i=n/5; i>=1; i--) {
    		rest = n-i*5;
    		if(rest%3==0) {
    			arr[3]=i+(n-i*5)/3;
    			break;
    		}
    	}
    	
    	rest = n;
    	for(int i=n/3; i>=1; i--) {
    		rest = n-i*3;
    		if(rest%5==0) {
    			arr[4]=i+(n-i*3)/5;
    			break;
    		}
    	}
    	
    	int result = Arrays.stream(arr).filter(item -> item>-1).min().orElse(-1);
    	System.out.println(result);
    }
}