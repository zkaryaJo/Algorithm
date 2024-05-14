import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        Set<String> set = new HashSet<>();
        for(int i=1; i<=line.length(); i++){ //1개, 2개, ... n개
            
            for(int j=0; j<=line.length()-i; j++){
                set.add(line.substring(j,j+i));
            }
        }
        System.out.print(set.size());
        
    }
}