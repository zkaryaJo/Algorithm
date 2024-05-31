import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        //[0,1,3,5,6] => h:3
        //[0,0,0,0,0] => h:0
        //[0,1,1,1,1] => h:1
        //[0,1,2,3,4] => h:2 n-i = 5-2 = 3
        
        Arrays.sort(citations);
        
        answer = citations.length;
        for(int i=0; i<citations.length; i++){
            if(answer <= citations[i]){
                break;
            }
            answer--;
            //System.out.println(citations[i]);
            //System.out.println(citations[citations.length-1-i]);
        }
        
        return answer;
    }
}