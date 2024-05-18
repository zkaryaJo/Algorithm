import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(br.readLine());
            boolean start = false;
            String names = "";
            for(int i=0; i<count; i++){
                String[] arr = br.readLine().split(" ");
                if(!start){
                    if("ChongChong".equals(arr[0]) || "ChongChong".equals(arr[1])){
                        names += arr[0]+" "+arr[1];
                        start = true;
                        continue;
                    }    
                }else{
                    if(names.contains(arr[0]) && !names.contains(arr[1])){
                        names += " " + arr[1];
                    }
                    if(names.contains(arr[1]) && !names.contains(arr[0])){
                        names += " " + arr[0];
                    }
                }
            }
            String[] arr = names.split(" ");
            System.out.println(arr.length);
            
        }catch(Exception e){
            
        }
    }
}