class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = true;
        
        for(int i=0; i<code.length(); i++){
            String ch = ""+code.charAt(i);
            if("1".equals(ch)){
                mode = !mode;
            }else{
                if(mode && i % 2 == 0){
                    answer += ch;
                }else if(!mode && i%2 != 0){
                    answer += ch;
                }
            }
        }
        
        if("".equals(answer)) return "EMPTY";
        
        return answer;
    }
}