import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        String[] arr = new String[11];
        //A, B, C = 2+1
        //D, E, F = 3+1
        //G, H, I = 4+1
        //..
        //W,X,Y,Z = 9+1
        
        arr[3] = "ABC";
        arr[4] = "DEF";
        arr[5] = "GHI";
        arr[6] = "JKL";
        arr[7] = "MNO";
        arr[8] = "PQRS";
        arr[9] = "TUV";
        arr[10] = "WXYZ";
        
        int result = 0;
        
        for(int i=0; i<input.length(); i++){
            
            char c = input.charAt(i);
            
            for(int j=3; j<=10; j++){
                if(arr[j].contains(""+c)){
                    result+=j;
                    break;
                }
            }
        }
        
        System.out.print(result);
        
        
    }
}