import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
            int count = Integer.parseInt(br.readLine());
            
            Map<String, Integer> map = new HashMap<>();
            for(int i=0; i<count; i++){
                String word = br.readLine();
                map.put(word, word.length());
            }
            
            List<String> list = new ArrayList<>(map.keySet());
            Collections.sort(list, new Comparator<String>(){
                
                @Override
                public int compare(String s1, String s2){
                    if(map.get(s1) < map.get(s2)){
                        return -1;
                    }else if(map.get(s1) > map.get(s2)){
                        return 1;
                    }
                    return s1.compareTo(s2);
                }
            });
            
            for(int i=0; i<list.size(); i++){
                bw.write(list.get(i)+"\n");
            }
            bw.flush();
            
        }catch(Exception e){
            
        }
    }
}