import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<5; i++){
            arr[i] = scan.nextInt();
        }
        arr = Arrays.stream(arr).sorted().toArray();
        
        System.out.println((int)Arrays.stream(arr).average().orElse(0));
        System.out.println(arr[2]);
         
    }
}