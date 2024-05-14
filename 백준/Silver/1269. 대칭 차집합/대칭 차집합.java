import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String line = br.readLine();
            int count1 = Integer.parseInt(line.split(" ")[0]);
            int count2 = Integer.parseInt(line.split(" ")[1]);
            
            String[] arr1 = br.readLine().split(" ");
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            for(int i=0; i<count1; i++){
                set1.add(Integer.parseInt(arr1[i]));
                set2.add(Integer.parseInt(arr1[i]));
            }
            
            Set<Integer> set3 = new HashSet<>();
            Set<Integer> set4 = new HashSet<>();
            String[] arr2 = br.readLine().split(" ");
            for(int i=0; i<count2; i++){
                set3.add(Integer.parseInt(arr2[i]));
                set4.add(Integer.parseInt(arr2[i]));
            }
            
            set1.removeAll(set3);
            set4.removeAll(set2);
            
            System.out.println(set1.size()+set4.size());
            
//            String[] arr1 = br.readLine().split(" ");
//            List list1 = Arrays.stream(arr1).map(item -> new Integer(item))
//                .collect(Collectors.toList());
//            
//            String[] arr2 = br.readLine().split(" ");
//            List list2 = Arrays.stream(arr2).map(item -> new Integer(item))
//                    .collect(Collectors.toList());
//            
//            List listTest1 = new ArrayList<Object>();
//            //List listTest2 = new ArrayList<Object>();
//            listTest1.addAll(list1);
//            //listTest2.addAll(list1);
//            
//            List listTest3 = new ArrayList<Object>();
//            //List listTest4 = new ArrayList<Object>();
//            listTest3.addAll(list2);
//            //listTest4.addAll(list2);
//            
//            listTest1.removeAll(listTest3);
//            list2.removeAll(list1);
//            //listTest4.removeAll(listTest2);
//            
//            System.out.print((listTest1.size()+list2.size()));
            
        }catch(Exception e){
            
        }
    }
}