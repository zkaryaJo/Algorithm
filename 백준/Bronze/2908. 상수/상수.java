import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input1 = scan.next();
        String input2 = scan.next();
        StringBuffer sb = new StringBuffer(input1);
        input1 = sb.reverse().toString();
        sb = new StringBuffer(input2);
        input2 = sb.reverse().toString();
        
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        
        System.out.println(num1>num2 ? num1:num2);
    }
}