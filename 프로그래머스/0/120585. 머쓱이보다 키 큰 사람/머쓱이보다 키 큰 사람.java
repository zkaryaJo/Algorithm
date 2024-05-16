import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        answer = Integer.parseInt(""+Arrays.stream(array).filter(item -> item>height).count());
        
        
        return answer;
    }
}