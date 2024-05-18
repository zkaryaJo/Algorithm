import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            
            String line = br.readLine();
            while(!line.equals(".")){
                Stack<Character> stack = new Stack<>();    
                String result = "yes";
                for(int i=0; i<line.length(); i++){
                    char c = line.charAt(i);
                    if(c == '(' || c == '['){
                        stack.push(c);
                    }else if(c == ')'){
                        if(stack.isEmpty() || stack.peek()!='('){
                            result = "no";
                            break;
                        }
                        stack.pop();
                    }else if(c == ']'){
                        if(stack.isEmpty() || stack.peek()!='['){
                            result = "no";
                            break;
                        }
                        stack.pop();
                    }
                }
                if(!stack.isEmpty()){
                    result = "no";
                }
                
                System.out.println(result);
                line = br.readLine();
            }
            
        }catch(Exception e){
            
        }
    }
}