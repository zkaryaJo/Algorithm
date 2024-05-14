import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(br.readLine());
            int result = count;
            int[] arr = new int[26];
            
            for(int i=0; i<count; i++){
                String line = br.readLine();
                Arrays.fill(arr,0);
                int prev = -1;
                for(int j=0; j<line.length(); j++){
                    int ascii = line.charAt(j)-'a';
                    if(prev==-1){
                        prev = ascii;
                        arr[ascii]++;
                    }else{
                        if(ascii != prev && arr[ascii] > 0){
                            result--;
                            break;
                        }else{
                            prev = ascii;
                            arr[ascii]++;
                        }
                    }
                    
                }
            }
            System.out.print(result);
            
        }catch(Exception e){
            
        }
        
    }
}