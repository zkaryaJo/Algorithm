class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        int xPos = 0;
        int yPos = 0;
        
        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[i].length(); j++){
                if("S".equals(""+park[i].charAt(j))){
                    yPos = i;
                    xPos = j;
                }
            }
        }
        int width = park[0].length();
        int height = park.length;
        
        for(int i=0; i<routes.length; i++){
        
            String direction = routes[i].split(" ")[0];
            int moveValue = Integer.parseInt(routes[i].split(" ")[1]);
            boolean isSuccess = true;
            switch(direction){
                case "E": 
                    for(int j=1; j<=moveValue; j++){
                        if(xPos+j >= width){
                            isSuccess = false;
                            break;
                        }
                        if("X".equals(""+park[yPos].charAt(xPos+j))){
                            isSuccess = false;
                            break;
                        }
                    }
                    if(isSuccess) xPos += moveValue;  break;
                case "W":
                   for(int j=1; j<=moveValue; j++){
                       if(xPos-j < 0){
                            isSuccess = false;
                            break;
                        }
                        if("X".equals(""+park[yPos].charAt(xPos-j))){
                            isSuccess = false;
                            break;
                        }
                    }
                    if(isSuccess) xPos -= moveValue; break;
                case "S": 
                    for(int j=1; j<=moveValue; j++){
                        if(yPos+j >= height){
                            isSuccess = false;
                            break;
                        }
                        if("X".equals(""+park[yPos+j].charAt(xPos))){
                            isSuccess = false;
                            break;
                        }
                    }
                    if(isSuccess) yPos += moveValue;   break;
                   
                case "N": 
                    for(int j=1; j<=moveValue; j++){
                         if(yPos-j < 0){
                            isSuccess = false;
                            break;
                        }
                        if("X".equals(""+park[yPos-j].charAt(xPos))){
                            isSuccess = false;
                            break;
                        }
                    }
                    if(isSuccess) yPos -= moveValue;   break;
            }
        }
        answer[0] = yPos;        
        answer[1] = xPos;

        return answer;
    }
}