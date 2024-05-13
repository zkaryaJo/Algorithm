import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
            int count = Integer.parseInt(br.readLine());
            int[] arrX = new int[count];
            int[] arrY = new int[count];
            for(int i=0; i<count; i++){
                String line = br.readLine();
                arrX[i] = Integer.parseInt(line.split(" ")[0]);
                arrY[i] = Integer.parseInt(line.split(" ")[1]);
            }
            
            arrX = Arrays.stream(arrX).sorted().toArray();
            arrY = Arrays.stream(arrY).sorted().toArray();
            
            int result = (arrX[count-1]-arrX[0]) * (arrY[count-1]-arrY[0]);
            System.out.println(result);
        }catch(Exception e){
            
        }
        
        
    }
}