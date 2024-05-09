import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        int y = scan.nextInt();
        
        int[][] arr1 = new int[x][y];
        int[][] arr2 = new int[x][y];
        int[][] sum = new int[x][y];
        
        
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                arr1[i][j] = scan.nextInt();
            }
        }
        
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                arr2[i][j] = scan.nextInt();
            }
        }
        
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                sum[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                if(j==0){
                    System.out.print(sum[i][j]);    
                }else{
                    System.out.print(" "+sum[i][j]);    
                }
                
            }
            System.out.println();
        }
        
    }
}