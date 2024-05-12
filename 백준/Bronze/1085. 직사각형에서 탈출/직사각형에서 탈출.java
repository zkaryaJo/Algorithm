import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();
        
        int dist1 = h-y;
        int dist2 = w-x;
        int dist3 = x;
        int dist4 = y;
        int min = 99999;
        
        if(min> dist1){
            min = dist1;
        }
        if(min> dist2){
            min = dist2;
        }
        if(min> dist3){
            min = dist3;
        }
        if(min> dist4){
            min = dist4;
        }
        
        System.out.print(min);
        
    }
}