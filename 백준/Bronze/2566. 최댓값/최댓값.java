import java.util.*;

public class Main{
    public static void main(String[] args){
        int[][] arr = new int[9][9];
        int max = 0;
        int maxI = 0;
        int maxJ = 0;
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                arr[i][j] = scan.nextInt();
                if(arr[i][j]>max){
                    max = arr[i][j];
                    maxI = i;
                    maxJ = j;
                }
                
            }
        }
        
        System.out.println(max);
        System.out.println((maxI+1)+" "+(maxJ+1));
    }
}