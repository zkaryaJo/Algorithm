import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int count = Integer.parseInt(br.readLine());
            int[] arr = new int[count];
            
            for(int i=0; i<count; i++){
                arr[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(arr);
            
            for(int i=0; i<count; i++){
                bw.write(arr[i]+"\n");
            }
            bw.flush();
            
        }catch(Exception e){
            
        }
    }
}