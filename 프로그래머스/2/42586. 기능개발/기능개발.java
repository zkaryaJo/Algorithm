import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
         int[] answer = new int[progresses.length];
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=0; i<progresses.length; i++){
            queue.add((int)Math.ceil((double)(100-progresses[i])/speeds[i]));
        }

        int answerIndex = 0;

        while(!queue.isEmpty()){
            int startValue = queue.poll();
            answer[answerIndex]++;

            while(!queue.isEmpty() && startValue >= queue.peek()){
                queue.poll();
                answer[answerIndex]++;
            }
            answerIndex++;
        }
        answer = Arrays.stream(answer).filter(x -> x > 0).toArray();

        return answer;
    }
}