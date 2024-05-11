import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            int N = Integer.parseInt(line.split(" ")[0]);
            int M = Integer.parseInt(line.split(" ")[1]);

            int[] arr = new int[N];
            for(int i=0; i<N; i++){
                arr[i] = i+1;
            }
        
            for(int i=0; i<M; i++){
            
                line = br.readLine();
                int start = Integer.parseInt(line.split(" ")[0])-1;
                int end = Integer.parseInt(line.split(" ")[1])-1;
                
                while(start<=end){
                    int temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }
            }
        
            for(int i=0; i<N; i++){
                System.out.print(arr[i]+" ");
            }
        }catch(Exception e){
                
        }
        
    }
}