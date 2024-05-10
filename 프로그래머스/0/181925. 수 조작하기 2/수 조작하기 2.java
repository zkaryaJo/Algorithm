class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i=1; i< numLog.length; i++){
            int prev = numLog[i-1];
            int cur = numLog[i];
            int diff = cur-prev;
            
            if(diff == 1) answer += "w";
            else if(diff == -1) answer += "s";
            else if(diff == 10) answer += "d";
            else answer += "a";
            
        }
        
        return answer;
    }
}