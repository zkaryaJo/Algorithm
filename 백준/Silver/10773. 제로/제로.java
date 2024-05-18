import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            int count = Integer.parseInt(br.readLine());
            Stack<Integer> stack = new Stack<>();
            for(int i=0; i<count; i++){
                int n = Integer.parseInt(br.readLine());
                if(n==0){
                    stack.pop();
                }else{
                    stack.push(n);
                }
            }    
            
            int result = 0;
            while(!stack.isEmpty()){
                result+=stack.peek();
                stack.pop();
            }
            
            System.out.println(result);
            
        }catch(Exception e){
            
        }
        
    }
}