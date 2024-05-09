import java.util.*;

public class Main{
    public static void main(String[] args){
        
        char[] arr = new char[36];
        
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String input = line.split(" ")[0];
        int num = Integer.parseInt(line.split(" ")[1]);
        
        //n진법 중 2진법
        //10진법
        System.out.println(Integer.parseInt(input, num));
        
        
        //int powNum = 0;
        //for(int i=input.length-1; i>0;i--){
//            result += Math.pow(num,powNum);
//        }
    }
}