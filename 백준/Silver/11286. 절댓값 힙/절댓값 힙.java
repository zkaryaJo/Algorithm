import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        Comparator<Integer> comparator = new Comparator<Integer>(){
            @Override
            public int compare(Integer num1, Integer num2){
                if(Math.abs(num1)<Math.abs(num2)){
                    return -1;    
                }else if(Math.abs(num1)>Math.abs(num2)){
                    return 1;
                }
                return num1-num2;                
            }
        };
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> pq = new PriorityQueue<>(comparator);
        int count = Integer.parseInt(br.readLine());
        
        for(int i=0; i<count; i++){
            int input = Integer.parseInt(br.readLine());
            if(input==0){
                if(pq.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(pq.poll());
                }
            }else{
                pq.offer(input);
            }
        }
    }
}
