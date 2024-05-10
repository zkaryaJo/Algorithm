import java.util.stream.*;

class Solution {
    public int solution(int n) {
		int answer = 0;

		// 짝수
		if (n % 2 == 0) {
			answer = IntStream.range(0, n + 1).filter(x -> x % 2 == 0).map(x -> x*x).sum();
		} else {
			answer = IntStream.range(0, n+1).filter(x -> x % 2 != 0).sum();
		}

		return answer;
	}
}