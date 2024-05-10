import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt(); // 5
        int N = scan.nextInt(); // 4
        
        int[] arr = new int[M];
        for(int i=0; i<M; i++){
            arr[i] = i+1;
        }
        
        for(int i=0; i<N; i++){
            int a = scan.nextInt()-1;
            int b = scan.nextInt()-1;
            int temp = 0;
            
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        
        for(int i=0; i<M; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}