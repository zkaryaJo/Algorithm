import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int amount = scan.nextInt();
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i]=scan.nextInt();
        }
        
        int result = 0;
        
        for(int i=arr.length-1; i>=0; i--){
            if(amount>=arr[i]){
                result+=amount/arr[i];
                amount = amount%arr[i];
            }
        }
        
        System.out.print(result);
    }
}