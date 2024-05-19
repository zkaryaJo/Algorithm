import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
            
            Map<String, Integer> map = new HashMap<>();
            
            String result = "";
            
            int N = arr[0]; // 단어개수
            int M = arr[1]; // 단어길이

            for(int i=0; i<N; i++){
                String line = br.readLine();
                if(line.length()>=M){
                    map.put(line, map.getOrDefault(line,0)+1);
                }
            }
            List<String> list = new ArrayList<>(map.keySet());
            Collections.sort(list, new Comparator<String>(){
               
                @Override
                public int compare(String s1, String s2){
                    if(map.get(s1) > map.get(s2)){
                         return -1;   
                    }else if(map.get(s1) < map.get(s2)){
                        return 1;   
                    }
                    
                    if(s1.length() > s2.length()){
                        return -1;
                    }else if(s1.length() < s2.length()){
                        return 1;
                    }
                    
                    return s1.compareTo(s2);
                }
            });
            
            for(int i=0; i<list.size(); i++){
                bw.write(list.get(i)+"\n");
                //result +=list.get(i)+"\n";
            }
            bw.flush();

        }catch(Exception e){
            
        }
    }
    
    
    
}