import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i=0; i<participant.length; i++){
            String key = participant[i];
            if(map.containsKey(key)){
                map.replace(key, map.get(key)+1);
            }
            else{
                map.put(key, 1);
            }
        }
        
        for(int i=0; i<completion.length; i++){
            String key = completion[i];
            if(map.get(key)>1){
                map.replace(key, map.get(key)-1);
            }
            else{
                map.remove(key);
            }
        }
        
        return String.join(",", map.keySet());
    }
}