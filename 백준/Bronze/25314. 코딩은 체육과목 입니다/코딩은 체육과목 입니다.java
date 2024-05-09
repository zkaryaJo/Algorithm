import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input =scan.nextInt();
        //4 -> long int
        String result = "";
        for(int i=0; i<input/4; i++){
            result+="long ";
        }
        result+="int";
        System.out.println(result);
        
    }
}