import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int[] sortedArray = Arrays.stream(numbers).sorted().toArray();
    	return sortedArray[sortedArray.length-1]*sortedArray[sortedArray.length-2];
    }
}