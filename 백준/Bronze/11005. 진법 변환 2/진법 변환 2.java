import java.util.*;

public class Main{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int powNum = scan.nextInt();
        
        System.out.println(Integer.toString(input, powNum).toUpperCase());
        
    }
}