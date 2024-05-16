import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n];
        
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer[count++] = i;
            }
        }
        answer = Arrays.stream(answer).filter(item -> item>0).toArray();
        
        
        return answer;
    }
}