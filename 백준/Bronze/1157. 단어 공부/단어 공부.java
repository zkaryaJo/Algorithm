import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toUpperCase();
        
        int[] arr = new int[26];
        Arrays.fill(arr, 0);
        
        for(int i=0; i<input.length(); i++){
            int n = (int)input.charAt(i)-65;
            arr[n]++;
        }
        
        int max = 0;
        int maxIndex = 0;
        int maxCount = 0;
        for(int i=0; i<26; i++){
        	
        	if(arr[i]==max && max > 0){
                maxCount++;
            }
        	
            if(arr[i]>max){
                maxCount = 0;
                max = arr[i];
                maxIndex = i;
            }
        }
        
        if(maxCount>0){
            System.out.println("?");
        }else{
            char c = (char)(maxIndex+65);
            System.out.println(""+c);
        }
        
        
    }
}