import java.util.Arrays;

class Solution {
    
     public int solution(int[] num_list) {
        int answer = 0;
        int[] even = Arrays.stream(num_list).filter(x -> x%2 == 0).toArray();
        int[] odd = Arrays.stream(num_list).filter(x -> x%2 != 0).toArray();
        
        String evenStr = "";
        for(int i=0; i<even.length; i++) {
        	evenStr += even[i];
        }
        String oddStr = "";
        for(int i=0; i<odd.length; i++) {
        	oddStr += odd[i];
        }
        
        answer = Integer.valueOf(evenStr) + Integer.valueOf(oddStr) ;
        
        return answer;
    }
}