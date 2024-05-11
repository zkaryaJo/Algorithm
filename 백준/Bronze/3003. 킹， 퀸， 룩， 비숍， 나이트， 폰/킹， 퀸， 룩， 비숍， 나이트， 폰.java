import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int[] arr = {1,1,2,2,2,8};
        
        for(int i=0; i<6; i++){
            int n = scan.nextInt();
            int result = (arr[i]-n);
            System.out.print(result + " ");
        }
    }
}