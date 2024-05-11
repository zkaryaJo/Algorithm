import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuffer sb = new StringBuffer(input);
        String reverseString = sb.reverse().toString();
        
        if(input.equals(reverseString)){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
        
    }
}