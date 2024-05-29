import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt(); 
        
        if(input==1){
            System.out.println(1);
        }else{
            int mul = 1; 
            int sum = 1;
            while(sum < input){
                sum += 6*mul++;
            }
            System.out.println(mul);
        }
    }
}