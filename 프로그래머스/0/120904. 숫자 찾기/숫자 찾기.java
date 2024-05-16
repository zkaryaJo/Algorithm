class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String strNum = ""+num;
        
        for(int i=0; i<strNum.length(); i++){
            int n = Integer.parseInt(""+strNum.charAt(i));
            if(n == k){
                answer = i+1;
                break;
            }
        }
        
        if(answer == 0){
            answer = -1;
        }
        
        
        return answer;
    }
}