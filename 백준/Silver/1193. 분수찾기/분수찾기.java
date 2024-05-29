import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        
        int sum = 0, n = 0;
        
        while(sum+n < input){
            sum += n++;
        }
        int index = input-sum;
        
        int x,y;
        //System.out.println("n:"+n+", sum:"+sum+" index:"+index);
        if(n%2==0) {
        	x=index;
        	y=n-index+1;
        }else {
        	x=n-index+1;
        	y=index;
        }
        
        System.out.println(x + "/" + y);
    }
}