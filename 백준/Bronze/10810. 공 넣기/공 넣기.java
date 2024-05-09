import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] line = br.readLine().split(" ");
            int col = Integer.parseInt(line[0]);
            int row = Integer.parseInt(line[1]);
            
            int[] arr = new int[col];
            
            Arrays.fill(arr,0);
            
            for(int a=0; a<row; a++){
                String[] arr2 =  br.readLine().split(" ");
                int i = Integer.parseInt(arr2[0]);
                int j = Integer.parseInt(arr2[1]);
                int k = Integer.parseInt(arr2[2]);
                
                for(int b=i-1; b<j; b++){
                    arr[b] = k;
                }
            }
            
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            
        }catch(Exception e){
            
        }
    }
}