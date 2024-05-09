import java.util.Arrays;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext()){
            int input = scan.nextInt();
            if(input == -1){
                break;
            }
            
            int[] arr = new int[100000];
            Arrays.fill(arr, 0);
            for(int i=1; i<input; i++){
                if(input%i==0){
                    arr[i] = i;    
                }
            }
            int sum = Arrays.stream(arr).filter(item -> item>0).sum();
            
            if(input == sum) {
            	int[] arr2 = Arrays.stream(arr).filter(item -> item>0).toArray();
            	System.out.print(input+" = "+arr2[0]);
            	for(int i=1; i<arr2.length; i++) {
            		System.out.print(" + "+arr2[i]);
            	}
            	System.out.println();
            	
            } else {
            	System.out.println(input+" is NOT perfect.");
            }
        }
        
    }
}