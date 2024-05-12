import java.util.*;
import java.io.*;

public class Main{
    public static int gcd(int a, int b){
        if(a%b==0){
            return b;
        }
        return gcd(b, a%b);
    }
    
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int count = Integer.parseInt(br.readLine());
        
            for(int i=0; i<count; i++){
            
                String line = br.readLine();
                int num1 = Integer.parseInt(line.split(" ")[0]);
                int num2 = Integer.parseInt(line.split(" ")[1]);
                
                if(num1 > num2){
                    bw.write(num1*num2/gcd(num1,num2)+"\n");
                }else{
                    bw.write(num1*num2/gcd(num2,num1)+"\n");
                }
                
                bw.flush();
            
            }
        }catch(Exception e){
            
        }
    }
}