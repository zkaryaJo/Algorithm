class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        if(hp>=5){
            answer += hp/5;
            hp = hp%5;
        }
        
        //4 - 2
        //3 - 1
        //2 - 2
        //1 - 1
        
        switch(hp){
                case 4: answer = answer+2; break;
                case 3: answer = answer+1; break;
                case 2: answer = answer+2; break;
                case 1: answer = answer+1; break;
            default: break;
        }
        
        return answer;
    }
}