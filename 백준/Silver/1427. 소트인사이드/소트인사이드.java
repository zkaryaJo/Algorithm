import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int[] arr = new int[input.length()];
        
        for(int i=0; i<input.length(); i++){
            arr[i]=Integer.parseInt(""+input.charAt(i));
        }
        
        arr = Arrays.stream(arr).sorted().toArray();
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
        
    }
}