import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int count = Integer.parseInt(br.readLine());
            String line = br.readLine();
            int[] arr = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(arr); //int[] arr = {-10, -9, 2, 4, 4}; 
            
            int index = 0;
            
            Map<String, Integer> map = new HashMap<>(); 
            for(int i=0; i<arr.length; i++){
            	if(i==0) {
            		map.put(""+arr[i], 0);
            	}else {
            		if(arr[i-1] == arr[i]) {
            			map.put(""+arr[i], index);
            		}else {
            			map.put(""+arr[i], ++index);
            		}
            	}
            }
            
            String[] strArr = line.split(" ");
            
            for(int i=0; i<strArr.length; i++) {
            	bw.write(map.get(strArr[i])+" ");
            }
            bw.flush();
            
            
        }catch(Exception e){
            
        }
    }
    
    
}