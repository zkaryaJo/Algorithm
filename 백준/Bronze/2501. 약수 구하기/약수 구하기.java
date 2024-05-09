import java.util.*;

public class Main{
    public static void main(String[] args){
        
        int[] arr = new int[10000];
        Arrays.fill(arr,0);
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        for(int i=1; i<=a; i++){
            if(a%i==0){
                arr[i] = 1;
            }
        }
        boolean isFind = false;
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                index++;
            }
            if(index==b){
                System.out.println(i);
                isFind = true;
                break;
            }
        }
        if(!isFind) System.out.println(0);
        
    }
}