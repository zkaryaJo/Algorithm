import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int size = Integer.parseInt(br.readLine());
            String[] arr = br.readLine().split(" ");
            String v = br.readLine();
            int count = 0;
            
            for(int i=0; i<size; i++){
                if(v.equals(arr[i])) 
                    count++;
            }
            System.out.println(count);
        }catch(Exception e){
            
        }
        
    }
}