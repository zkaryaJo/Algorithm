import java.util.*;
import java.io.*;
import java.util.stream.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n];
        Arrays.fill(arr, 1);
        
        for(int i=0; i<lost.length; i++){
            arr[lost[i]-1] = 0;
        }
        
        for(int i=0; i<reserve.length; i++){
            if(arr[reserve[i]-1] == 0){
                arr[reserve[i]-1] = 1;
            }else{
                arr[reserve[i]-1] = 2;  
            } 
        }
        
        
        for(int i=0; i<arr.length; i++){
            int prev = 0;
            int next = 0;
            int nextnext = 0;
            
            if(arr[i] == 0){
                if(i>0){
                    prev = arr[i-1];
                }
                if(i+1 < arr.length){
                    next = arr[i+1];
                }
                
                if(prev > 1){
                    arr[i-1]--;
                    arr[i] = 1;
                    continue;
                }
                if(next > 1){
                    arr[i+1]--;
                    arr[i] = 1;
                    continue;
                }
            }
        }
        
        answer = (int)Arrays.stream(arr).filter(item -> item>0).count();
        
        return answer;
    }
    
}