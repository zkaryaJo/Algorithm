import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int blank = n-1;
        int line = 2*n-1;
        int starCount = 1;
        
        
        
        for(int i=1; i<=n; i++){
        	String result = "";
            //1.공백
            for(int j=0; j<blank; j++){
                result +=" ";
            }
            
            //2. *
        	for(int k=0; k<starCount; k++){
                result += "*";
            }
            System.out.println(result);
            blank--;
            starCount += 2;
            
        }
        starCount -= 4;
        
        
    	for(int i=1; i<n; i++){
    		String result = "";
            //1.공백
            for(int j=0; j<i; j++){
                result +=" ";
            }
            
            //2. *
        	for(int k=0; k<starCount; k++){
                result += "*";
            }
        	System.out.println(result);
            blank--;
            starCount -= 2;
            
        }
        
    }
}