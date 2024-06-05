import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String line = br.readLine();
        int[] arr = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        
        System.out.println(arr[0]*arr[arr.length-1]);
    }
}