import java.util.*;
import java.time.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {

        String[] todayArr = today.split("\\.");
        List<Integer> list = new ArrayList<>();
        
        LocalDate todayDate = LocalDate.of(Integer.parseInt(todayArr[0]), Integer.parseInt(todayArr[1]), Integer.parseInt(todayArr[2]));
        
        for(int i=0; i<privacies.length; i++){
            String[] privacyArr = privacies[i].split(" ");
            String[] privacyDateArr = privacyArr[0].split("\\.");
            
            LocalDate privacyDate = LocalDate.of(Integer.parseInt(privacyDateArr[0]), Integer.parseInt(privacyDateArr[1]), Integer.parseInt(privacyDateArr[2]));
            
            for(int j=0; j<terms.length; j++){
                
                int termMonth = Integer.parseInt(terms[j].split(" ")[1]);
                String type = terms[j].split(" ")[0];

                if(privacyArr[1].equals(type)){
                    LocalDate expiredDate = privacyDate.plusMonths(termMonth);
                    if(!todayDate.isBefore(expiredDate)){
                        list.add(i+1);
                        break;
                    }
                }    
            }            
        }
 
        return list.stream().mapToInt(i->i).toArray();
        
    }
}