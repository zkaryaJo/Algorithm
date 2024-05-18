import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(br.readLine());
            int order = 1;
            String result = "Nice";
            Stack<Integer> stack = new Stack<>();
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            
            for(int i=0; i<arr.length; i++){

            	while(!stack.isEmpty() && stack.peek() == order){
                    stack.pop();
                    order++;
                }
            	
                if(order == arr[i]){
                    order++;
                }else{
                    if(!stack.isEmpty() && stack.peek() < arr[i]){
                        result = "Sad";
                        break;
                    }
                    stack.push(arr[i]);
                }
            }
            
            while(!stack.isEmpty()){
            	//System.out.println(stack.peek());
                if(stack.peek()!=order){
                    result = "Sad";
                    break;
                }else{
                    stack.pop();
                    order++;
                }
            }
            System.out.println(result);
            
        }catch(Exception e){
            
        }
        
    }
}