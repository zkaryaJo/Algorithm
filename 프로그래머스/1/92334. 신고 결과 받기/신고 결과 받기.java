import java.util.*;

class Solution {
     // 유저 ID	유저가 신고한 ID	        정지된 ID
        // "muzi"	["frodo", "neo"]	    ["frodo", "neo"]
        // "frodo"	["neo"]	["neo"]
        // "apeach"	["muzi", "frodo"]	    ["frodo"]
        // "neo"	없음	                    없음
        
        //["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]
    
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        
        Map reportMap = new HashMap<String, HashMap<String, Object>>();
        
        for(int i=0; i<id_list.length; i++){
            HashMap<String, Object> userMap = new HashMap<String, Object>();
            userMap.put("userID", id_list[i]);
            userMap.put("userReportIDSet", new HashSet<String>());
            userMap.put("victimUserIDSet", new HashSet<String>());
            userMap.put("reportedCount", 0);
            reportMap.put(id_list[i], userMap);
        }
       
        for(int i=0; i<report.length; i++){
            String userID = report[i].split(" ")[0];
            String victimID = report[i].split(" ")[1];
            
            Map userMap = (Map)reportMap.get(userID);
            Map victimMap = (Map)reportMap.get(victimID);
            Set userReportIDSet = (Set)userMap.get("userReportIDSet");
            userReportIDSet.add(victimID);
            userMap.put("userReportIDSet",userReportIDSet);
            reportMap.put(userID, userMap);
            
            //신고당한 횟수 
            Set victimUserIDSet = (Set)victimMap.get("victimUserIDSet");
            victimUserIDSet.add(userID);
        }
        
        for(int i=0; i<id_list.length; i++){
            Map userMap = (Map)reportMap.get(id_list[i]);
            Set userReportIDSet = (Set)userMap.get("userReportIDSet");
            
            for(Object item : userReportIDSet){
                String reportID = ""+item;
                
                Map victimMap = (Map)reportMap.get(reportID);
                Set victimUserIDSet = (Set)victimMap.get("victimUserIDSet");
                if(victimUserIDSet.size()>=k){
                    answer[i]++;
                }
            }
        }
        
        
        return answer;
    }
}