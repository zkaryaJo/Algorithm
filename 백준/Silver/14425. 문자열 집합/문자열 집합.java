import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String line = scan.nextLine();
        int count1 = Integer.parseInt(line.split(" ")[0]);
        int count2 = Integer.parseInt(line.split(" ")[1]);

        Set<String> set = new HashSet<String>();
        
        for(int i=0; i<count1; i++){
            set.add(scan.nextLine());
        }
        
        int includeCount = 0;
        
        for(int i=0; i<count2; i++){
            if(set.contains(scan.nextLine())){
                includeCount++;
            }
        }
        
        System.out.println(includeCount);
    }
}