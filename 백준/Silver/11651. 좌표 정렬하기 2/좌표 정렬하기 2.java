import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(br.readLine());
            
            List<Pos> list = new ArrayList<>();
            for(int i=0; i<count; i++){
                String line = br.readLine();
                int x = Integer.parseInt(line.split(" ")[0]);
                int y = Integer.parseInt(line.split(" ")[1]);
            
                Pos pos = new Pos(x,y);
                list.add(pos);
            }
            Collections.sort(list);
            
            for(Pos p : list){
                System.out.println(p);
            }
            
        }catch(Exception e){
            
        }
    }
    
    public static class Pos implements Comparable<Pos>{
        public int x;
        public int y;
        
        public Pos(int x, int y){
            this.x = x;
            this.y = y;
        }
        
        @Override
        public String toString(){
            return this.x + " " + this.y;
        }
        
        @Override
        public int compareTo(Pos p){
            
            if(y < p.y){
                return -1;
            }else if(y > p.y){
                return 1;
            }
            
            if(x < p.x){
                return -1;
            }
            
            return 1;
        }
        
    }
}