import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map typeScoreMap = new HashMap<Character, Integer>();
        typeScoreMap.put('R', 0); typeScoreMap.put('T', 0);
        typeScoreMap.put('C', 0); typeScoreMap.put('F', 0);
        typeScoreMap.put('J', 0); typeScoreMap.put('M', 0);
        typeScoreMap.put('A', 0); typeScoreMap.put('N', 0);
        
        char type;
        int score;
        for(int i=0; i < choices.length; i++){
            if(choices[i]==4){
                continue;
            }
            //앞쪽에 점수를
            if(choices[i] <= 3){
                type = survey[i].charAt(0);
                score = (int)typeScoreMap.get(type);
                
                typeScoreMap.put(type, (score+(4-choices[i])));
            }
            //뒤쪽에 점수를
            else{
                type = survey[i].charAt(1);
                score = (int)typeScoreMap.get(type);
                typeScoreMap.put(type, (score+choices[i]-4));
            }
        }
        
        answer =    ( (int)typeScoreMap.get('R') >= (int)typeScoreMap.get('T') ? "R" : "T" ) +
                    ( (int)typeScoreMap.get('C') >= (int)typeScoreMap.get('F') ? "C" : "F" ) +
                    ( (int)typeScoreMap.get('J') >= (int)typeScoreMap.get('M') ? "J" : "M" ) +
                    ( (int)typeScoreMap.get('A') >= (int)typeScoreMap.get('N') ? "A" : "N" );
        
        
        return answer;
    }
}