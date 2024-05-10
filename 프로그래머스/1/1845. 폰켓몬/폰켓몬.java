import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int[] distinctNums = Arrays.stream(nums).distinct().toArray();
        return distinctNums.length > nums.length/2 ? nums.length/2 : distinctNums.length;
        
    }
}