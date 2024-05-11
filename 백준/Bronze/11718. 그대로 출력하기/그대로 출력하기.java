import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String result = "";
            while(true){
                String line = br.readLine();
                if(line == null){
                    break;
                }
                result+=line;
                result+="\n";
            }
            System.out.println(result);
            
        }catch(Exception e){
            
        }
    }
}