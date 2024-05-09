import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            int count = Integer.parseInt(br.readLine());
            
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for(int i=0; i<count; i++){
                String line = br.readLine();
                int sum = Integer.parseInt(line.split(" ")[0])+Integer.parseInt(line.split(" ")[1]);
                bw.write(sum+"\n");
                //System.out.println(sum);
            }
            bw.flush();
            
            
        }catch(Exception e){
            
        }
    }
}