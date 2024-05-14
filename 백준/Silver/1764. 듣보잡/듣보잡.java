import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String line = br.readLine();
            int count1 = Integer.parseInt(line.split(" ")[0]);
            int count2 = Integer.parseInt(line.split(" ")[1]);
            
            Set<String> set1 = new HashSet<>();
            Set<String> set2 = new HashSet<>();
            
            for(int i=0; i<count1; i++) {
            	set1.add(br.readLine());
            }
            
            for(int i=0; i<count2; i++) {
            	set2.add(br.readLine());
            }
            
            set1.retainAll(set2);
            Object[] arr = set1.stream().sorted().toArray();
            
            bw.write(arr.length+"\n");
            for(Object item : arr) {
            	bw.write(item+"\n");
            }
            bw.flush();
            
//            List<String> list1 = new ArrayList<>();
//            List<String> list2 = new ArrayList<>();
//            
//            
//            for(int i=0; i<count1; i++){
//                list1.add(br.readLine());
//            }
//            
//            for(int i=0; i<count2; i++){
//                list2.add(br.readLine());
//            }
//            
//            list1.retainAll(list2);
//            Collections.sort(list1);
//            
//            bw.write(list1.size()+"\n");
//            for(String item : list1){
//                bw.write(item+"\n");
//            }
//            bw.flush();
            
        }catch(Exception e){
            
        }
    }
}