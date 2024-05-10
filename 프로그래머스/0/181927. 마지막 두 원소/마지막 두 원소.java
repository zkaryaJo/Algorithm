import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = Arrays.copyOf(num_list, num_list.length+1);
        
        int last = num_list[num_list.length-1];
        int prev = num_list[num_list.length-2];
        if(last - prev > 0){
            answer[answer.length-1] = last-prev;
        }else{
            answer[answer.length-1] = 2*last;
        }
        return answer;
    }
}