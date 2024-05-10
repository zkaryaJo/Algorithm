import java.util.OptionalInt;
import java.util.stream.IntStream;

class Solution {
    public double solution(int[] numbers) {
        
        OptionalInt sum = IntStream.of(numbers).reduce((x,y) -> x+y);
        double answer = (double)sum.getAsInt()/numbers.length;
        
        return answer;
    }
}