import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        int N = Integer.parseInt(line.split(" ")[0]);
        int K = Integer.parseInt(line.split(" ")[1]);
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] sum = new int[N-K+1];
        for(int i=0; i<N-K+1; i++){
            for(int j=i; j<i+K; j++){
                sum[i] += arr[j];
            }
        }
        
        int max = Arrays.stream(sum).sorted().max().orElse(0);
        System.out.print(max);
    }    
}