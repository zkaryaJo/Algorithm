import java.util.*;
import java.io.*;

public class Main{
    public static long gcd(long a, long b){
        if(a%b==0){
            return b;
        }
        return gcd(b, a%b);
    }
    
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            //int count = Integer.parseInt(br.readLine());
        
            //for(int i=0; i<count; i++){
            
                String line = br.readLine();
                long num1 = Long.parseLong(line.split(" ")[0]);
                long num2 = Long.parseLong(line.split(" ")[1]);
                
                if(num1 > num2){
                    bw.write(num1*num2/gcd(num1,num2)+"\n");
                }else{
                    bw.write(num1*num2/gcd(num2,num1)+"\n");
                }
                
                bw.flush();
            
            //}
        }catch(Exception e){
            
        }
    }
}