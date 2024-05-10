import java.util.*;

class Solution {
    public String solution(String[] arr) {
        
        
        return Arrays.stream(arr).reduce((x,y)->x+y).get();
        
        
    }
}