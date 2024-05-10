import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.stream.*;
import java.util.Optional;

class Solution {
    
    //c
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        List<User> users = Arrays.asList(friends).stream().map(name -> new User(name)).collect(Collectors.toList());       
        
        for(User user : users){
            
            user.sendList = 
                Arrays.asList(gifts).stream()
                .filter(item -> user.name.equals(item.split(" ")[0]))
                .map(item -> item.split(" ")[1])
                .collect(Collectors.toList());
            
            user.receiveList = 
                Arrays.asList(gifts).stream()
                .filter(item -> user.name.equals(item.split(" ")[1]))
                .map(item -> item.split(" ")[0])
                .collect(Collectors.toList());
            
             System.out.println(user.name+":"+user.sendList.toString());
             System.out.println(user.name+":"+user.receiveList.toString());
        }
        
        for(User user : users){
            
            for(User friend : users){
                
                //1. 나 자신은 비교대상에서 제외
                if(friend.name.equals(user.name)){ 
                    continue;
                }
                
                //2. 내가 frodo 한테 준 선물갯수 확인
                long sendCount = user.sendList.stream().filter(name -> name.equals(friend.name)).count();
                //3. frodo가 나에게 준 선물갯수 확인
                long receiveCount = user.receiveList.stream().filter(name -> name.equals(friend.name)).count();
                
                if(sendCount>receiveCount){
                    user.beReceiveGiftCount ++;
                }else if(sendCount == receiveCount){
                    if(user.getGiftIndex() > friend.getGiftIndex()){
                        user.beReceiveGiftCount ++;
                    }
                }
            }
            //System.out.println(user.name+":"+user.beReceiveGiftCount);
        }
        
        return users.stream().mapToInt(user -> user.beReceiveGiftCount).max().getAsInt();
    }
    
    class User {
        
        String name;
        List<String> sendList;
        List<String> receiveList;
        int beReceiveGiftCount;
        
        public User(String name){
            this.name = name;
            this.beReceiveGiftCount = 0;
        }
        
        public int getGiftIndex(){
            return sendList.size() - receiveList.size();
        }
    }
}