import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int sum = Arrays.stream(num_list).sum();        
        int multipleAll = Arrays.stream(num_list).reduce((x,y)->x*y).getAsInt();
        
        return multipleAll>sum*sum ? 0 : 1;
    }
}