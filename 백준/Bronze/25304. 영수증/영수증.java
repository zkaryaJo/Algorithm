import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
            int amount = Integer.parseInt(br.readLine());
            int count = Integer.parseInt(br.readLine());
            
            for(int i=0; i<count; i++){
                String line = br.readLine();
                amount -= Integer.parseInt(line.split(" ")[0])*Integer.parseInt(line.split(" ")[1]);
            }
            if(amount == 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            
        }catch(Exception e){
            
        }
    }
}