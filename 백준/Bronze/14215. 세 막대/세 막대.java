import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        
        if(arr[0]+arr[1]>arr[2]){
            System.out.println(arr[0]+arr[1]+arr[2]);
        }else{
            //작은 두 변의 길이의 합이 가장 긴변의 길이보다 커야한다.
            //arr[0]+arr[1]>arr[2]
            //arr[0]+arr[1]-1 = 인 경우가 arr[2]가 최대가 된다.
            
            System.out.println((arr[0]+arr[1])*2-1);
            
            
        }
        
    }
}