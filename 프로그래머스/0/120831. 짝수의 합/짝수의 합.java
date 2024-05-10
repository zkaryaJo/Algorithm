class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int myNum = 2;
        while(myNum <= n){
            answer += myNum;
            myNum+=2;
        }
        
        return answer;
    }
}