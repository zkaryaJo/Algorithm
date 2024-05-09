import java.util.*;

public class Main{
    public static void main(String[] args){
        
        char[][] arr = new char[5][15];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<5; i++){
            String line = scan.nextLine();
            arr[i] = line.toCharArray();
        }
        
        for(int j=0; j<15; j++){
            for(int i=0; i<5; i++){
                if(j<arr[i].length){
                    System.out.print(""+arr[i][j]);
                }
            }
        }
        
    }
}