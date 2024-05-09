import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int count = scan.nextInt();
        int[] sumArr = new int[len];
        
        sumArr[0] = scan.nextInt();
        for(int i=1; i<len; i++) {
        	sumArr[i] = sumArr[i-1]+scan.nextInt();
        }
        
        for(int i=0; i<count; i++){
        	int start = scan.nextInt();
        	int end = scan.nextInt();
            if(start>=2)
                System.out.println(sumArr[end-1] - sumArr[start-2]);
            else
                System.out.println(sumArr[end-1]);
        }
        
    }
}