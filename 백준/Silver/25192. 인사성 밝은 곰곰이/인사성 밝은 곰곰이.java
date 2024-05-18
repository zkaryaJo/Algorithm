import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(br.readLine());
            Set<String> set = new HashSet<>();
            int result = 0;
            boolean start = false;
            for(int i=0; i<count; i++){
                String line = br.readLine();
                if("ENTER".equals(line)){
                    result+= set.size();
                    set = new HashSet<>();
                    start = true;
                    continue;
                }
                if(start){
                    set.add(line);    
                }
            }
            
            result += set.size();
            System.out.println(result);
            
        }catch(Exception e){
            
        }
    }
}