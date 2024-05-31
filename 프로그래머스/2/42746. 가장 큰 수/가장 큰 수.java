import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] arr = Arrays.stream(numbers).mapToObj(Integer::toString).toArray(String[]::new);
        
        Arrays.sort(arr, (o1, o2) -> (o2+o1).compareTo(o1+o2));
        
        if("0".equals(arr[0])){
            return "0";
        }
        
         for(int i=0; i<arr.length; i++){
             answer += arr[i];
         }
        
        return answer;
    }
}