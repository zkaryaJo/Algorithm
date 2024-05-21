import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(br.readLine());
            
            List<Member> list = new ArrayList<>();
            for(int i=0; i<count; i++){
                String line = br.readLine();
                int age = Integer.parseInt(line.split(" ")[0]);
                String name = line.split(" ")[1];
                
                Member member = new Member(age, name, i);
                list.add(member);
            }
            
            Collections.sort(list);
            
            for(Member m : list){
                System.out.println(m);
            }
            
        }catch(Exception e){
            
        }
        
    }
    
    public static class Member implements Comparable<Member>{
        public int age;
        public int order;
        public String name;
        
        public Member(int age, String name, int order){
            this.age = age;
            this.name = name;
            this.order = order;
        }
        
        @Override 
        public String toString(){
            return this.age +" " + this.name;
        }
        
        @Override
        public int compareTo(Member m){
            if(age < m.age){
                return -1;
            }
            if(age > m.age){
                return 1;
            }
            
            if(order < m.order){
                return -1;
            }
            
            return 1;
        }
    }
}