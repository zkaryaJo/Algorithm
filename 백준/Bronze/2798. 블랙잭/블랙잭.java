import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String line2 = scan.nextLine();
        
        int count = Integer.parseInt(line.split(" ")[0]);
        int num = Integer.parseInt(line.split(" ")[1]);
        
        int[] arr = Arrays.stream(line2.split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int sum = 0;
        int result = 0;
        
        for(int i=0; i<arr.length-2; i++){
            for(int j=i+1; j<arr.length-1; j++){
                for(int k=j+1; k<arr.length; k++){
                    sum = arr[i]+arr[j]+arr[k];
                    if(num<sum){
                        continue;
                    }
                    if(result <= sum){
                        result = sum;    
                    }
                }
            }
        }   
        System.out.println(result);
        
    }
}