import java.util.*;

public class Main{
    
    static int callCount = 0;
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<count; i++){
            String line = scanner.nextLine();
            callCount = 0;
            System.out.println(isPalindrome(line) + " "+ callCount);
        }
        
    }
    
    public static int recursion(String s, int l, int r){
        callCount++;
        if(l>=r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        return recursion(s, l+1, r-1);
    }
    
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    
}