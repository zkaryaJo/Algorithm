import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        
        for(int i=0; i<input.length(); i++){
            int index = input.charAt(i)-97;
            if(arr[index]==-1){
                arr[index] = i;
            }
            
        }
        
        for(int i=0; i<26; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}