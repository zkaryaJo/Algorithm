import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int len = Integer.parseInt(br.readLine());
            String[] arr = br.readLine().split("");
            long sum = Arrays.stream(arr).mapToInt(Integer::parseInt).sum();
            System.out.println(sum);
        }catch(Exception e){
            
        }
    }
}