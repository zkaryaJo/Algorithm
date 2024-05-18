import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            while(!"0 0 0".equals(line) && line !=null ){
                int[] arr = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
                int a = arr[0];
                int b = arr[1];
                int c = arr[2];
                if(a+b <= c){
                    System.out.println("Invalid");
                }else{
                    if(a==b && b==c){
                        System.out.println("Equilateral");
                    }else if(a==b || b==c || a==c){
                        System.out.println("Isosceles");
                    }else{
                        System.out.println("Scalene");
                    }
                }
                line = br.readLine();
            }
            
        }catch(Exception e){
            
        }
    }
}