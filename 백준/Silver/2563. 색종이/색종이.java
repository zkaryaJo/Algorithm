import java.util.*;

public class Main{
    public static void main(String[] args){
        boolean[][] arr = new boolean[100][100];
        
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int result = 0;
        for(int i=0; i<count; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            
            for(int j=0; j<10; j++){
                for(int k=0; k<10; k++){
                    if(!arr[x+j][y+k]){
                        arr[x+j][y+k] = true;
                        result++;
                    }
                }
            }
            
        }
        System.out.println(result);
        
    }
}