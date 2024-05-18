import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int count = 1;
        int result = 666;
        while(count<input){    
            result++;
            String str = ""+result;
            if(str.contains("666")){
                count++;
            }
        }
        System.out.println(result);
        
    }
}