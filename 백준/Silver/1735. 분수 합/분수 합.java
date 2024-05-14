import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int up1 = scan.nextInt();
        int bottom1 = scan.nextInt();
        int up2 = scan.nextInt();
        int bottom2 = scan.nextInt();
        
        int up = up1*bottom2+up2*bottom1;
        int bottom = bottom1*bottom2;
        
        int gcd = 1;
        for(int i=2; i<up; i++){
            if(up%i == 0 && bottom%i==0){
                gcd = i;
            }
        }
        if(up==bottom) {
        	System.out.println(1 +" "+ 1);
        }else {
        	System.out.print(up/gcd +" "+bottom/gcd);
        }
        
    }
}
