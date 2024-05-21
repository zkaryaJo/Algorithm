import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int prev = -1;
        int[] arr = new int[8];
        for(int i=0; i<8; i++){
            arr[i] = scan.nextInt();
        }
        
        String order = "";
        
        if(arr[0] > arr[1]){
            order = "descending";
        }else if(arr[0] < arr[1]){
            order = "ascending";
        }else{
            order = "mixed";
        }
        if(!"mixed".equals(order)){
            for(int i=1; i<8; i++){
                if("ascending".equals(order)){
                    if(arr[i-1] >= arr[i]){
                        order = "mixed";
                        break;
                    }
                }else{
                    if(arr[i-1] <= arr[i]){
                        order = "mixed";
                        break;
                    }
                }
            }   
        }
        System.out.println(order);
    }
}