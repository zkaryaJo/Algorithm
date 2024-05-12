import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();
        
        int resultX = 0;
        int resultY = 0;
        
        if(x1 == x2){
            resultX = x3;
        }else if(x1 == x3){
            resultX = x2;
        }else{
            resultX = x1;
        }
        
        if(y1 == y2){
            resultY = y3;
        }else if(y1 == y3){
            resultY = y2;
        }else{
            resultY = y1;
        }
        
        System.out.print(resultX + " " + resultY);
        
    }
}