import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        try{
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int rows = Integer.parseInt(br.readLine());
            for(int i=0; i<rows; i++){
                String line = br.readLine();
                int count = Integer.parseInt(line.split(" ")[0]);
                String word = line.split(" ")[1];
                String result = "";
                for(int j=0; j<word.length(); j++){
                    char[] arr = new char[count];
                    Arrays.fill(arr, word.charAt(j));
                    result+=String.valueOf(arr);
                }
                System.out.println(result);
            
            }
        }catch(Exception e){
                
        }
    }
}
