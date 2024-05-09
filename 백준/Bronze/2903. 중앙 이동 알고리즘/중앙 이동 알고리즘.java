import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        double row = Math.pow(2,input)+1;
        double height = Math.pow(2,input)+1;
        System.out.println((long)(row*height));
    }
}