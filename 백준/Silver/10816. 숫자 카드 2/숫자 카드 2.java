import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Map<Integer, Integer> map = new HashMap<>();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
            int count1 = Integer.parseInt(br.readLine());
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int i=0; i<arr.length; i++){
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            }
            
            int count2 = Integer.parseInt(br.readLine());
            int[] arr2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int i=0; i<arr2.length; i++){
                bw.write(map.getOrDefault(arr2[i], 0)+" ");
            }
            bw.flush();
            
        }catch(Exception e){
            
        }
  
    }
}