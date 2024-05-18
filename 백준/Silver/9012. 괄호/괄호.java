import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(br.readLine());
            
            for(int i=0; i<count; i++){
                String input = br.readLine();
                Stack<Character> stack = new Stack<>();
                String result = "YES";
                for(int j=0; j<input.length(); j++){
                    if('(' == input.charAt(j)){
                        stack.push(input.charAt(j));
                    }else{
                        if(stack.isEmpty()){
                            result = "NO";
                            break;
                        }
                        stack.pop();
                    }
                }
                if(!stack.isEmpty()){
                    result = "NO";
                }
                System.out.println(result);
            }
            
        }catch(Exception e){
            
        }
    }
}