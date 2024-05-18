import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n!=1){
            int mok = 2;
            while(n>1){
                if(n%mok==0){
                    System.out.println(mok);
                    n = n/mok;
                }else{
                    mok++;
                }
            }
        }
        
        
    }
}