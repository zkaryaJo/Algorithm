import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        return (int)Arrays.stream(array).filter(item -> item == n).count();
    }
}