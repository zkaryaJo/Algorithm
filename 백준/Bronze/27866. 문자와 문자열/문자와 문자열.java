import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            int index = Integer.parseInt(br.readLine());
            System.out.println(input.charAt(index-1));
        }catch(Exception e){
            
        }
    }
}