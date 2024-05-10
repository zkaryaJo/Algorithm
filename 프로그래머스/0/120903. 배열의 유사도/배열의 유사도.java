import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        List<String> list1 = new ArrayList<String>(Arrays.asList(s1));
        List<String> list2 = new ArrayList<String>(Arrays.asList(s2));
        list1.retainAll(list2);
        
        return list1.size();
    }
}