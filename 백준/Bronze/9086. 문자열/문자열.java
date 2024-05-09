import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(br.readLine());
            
            for(int i=0; i<count; i++){
                 String input = br.readLine();
                System.out.println(input.charAt(0)+""+input.charAt(input.length()-1));
            }
            
        }catch(Exception e){
            
        }
    }
}