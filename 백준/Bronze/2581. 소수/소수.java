import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        int[] arr = new int[N+1];

        for(int i=2; i<=N; i++){
            arr[i] = i;
        }
        
        for(int i=2; i<=N; i++){ //i : 소수가 되는지 판별하는 대상
            if(arr[i] == 0) continue;
            for(int j=i+i; j<=N; j=j+i){ // j : 곱하기 할 대상.
                arr[j]=0;
            }
        }
        int result = 0;
        int min = 0;
        for(int i=M; i<=N; i++){
            if(min==0 && arr[i]>0){
                min = arr[i];
            }
            result+=arr[i];
        }
        if(result==0){
            System.out.println(-1);
        }else{
            System.out.println(result);
            System.out.println(min);    
        }
    }
}