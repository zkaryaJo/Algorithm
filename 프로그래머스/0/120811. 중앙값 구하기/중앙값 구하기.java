import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        return Arrays.stream(array).sorted().toArray()[array.length/2];
        
    }
}