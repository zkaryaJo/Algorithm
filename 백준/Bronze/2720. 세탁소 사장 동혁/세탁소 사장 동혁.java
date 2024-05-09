import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        for(int i=0; i<count; i++){
            
            int input = scan.nextInt();
            
            //쿼터(Quarter, $0.25)의 개수
            System.out.print(input/25);
            input = input%25;
            
            //다임(Dime, $0.10)의 개수
            System.out.print(" "+input/10);
            input = input%10;
        
            //니켈(Nickel, $0.05)의 개수
            System.out.print(" "+input/5);
            input = input%5;
            
            //페니(Penny, $0.01)의 개수
            System.out.println(" "+input);
        }
        
    }
}