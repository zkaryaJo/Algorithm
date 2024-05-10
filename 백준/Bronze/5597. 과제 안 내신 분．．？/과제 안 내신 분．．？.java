import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int[] arr = new int[31];
        
        Arrays.fill(arr, 0);
        
        for(int i=0;i<28; i++){
            int n = scan.nextInt();    
            arr[n] = n;
        }
        
        for(int i=1; i<31; i++){
            if(arr[i]==0){
                System.out.println(i);
            }
        }
        
    }
}