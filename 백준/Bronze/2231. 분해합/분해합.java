import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int sum = 0;
        int result = 0;
        for(int i=1; i<input; i++){
            String num = ""+i;
            sum = i;
            for(int j=0; j<num.length(); j++) {
            	sum+=Integer.parseInt(""+num.charAt(j));
            }
            
            if(input == sum){
                result = i;
                break;
            }
        }
        
        System.out.println(result);
    }
}