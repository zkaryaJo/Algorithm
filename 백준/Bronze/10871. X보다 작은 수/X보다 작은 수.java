import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] arr1 = br.readLine().split(" ");
            int count = Integer.parseInt(arr1[0]);
            int limit = Integer.parseInt(arr1[1]);
            
            String[] arr2 = br.readLine().split(" ");
            for(int i=0; i<arr2.length; i++){
                int num = Integer.parseInt(arr2[i]);
                if(num < limit){
                     System.out.print(num+" ");
                }
            }
            
        }catch(Exception e){
            
        }
    }
}