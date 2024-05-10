import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(stack.size() == 0) {
				stack.push(arr[i]);
			}else {
				if(stack.peek() != arr[i]) {
					stack.push(arr[i]);
				}
			}
		}
		int[] answer = new int[stack.size()];
		while(!stack.isEmpty()) {
			answer[stack.size()-1] = stack.pop();
		}
        
        return answer;
        
    }
}