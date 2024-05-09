import java.util.*;

public class Main{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i] = scan.nextInt();
        }
        
        arr = Arrays.stream(arr).sorted().toArray();
        
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
    }
    
}