import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);    
        int hh = scan.nextInt();
        int mm = scan.nextInt();
        int mm2 = scan.nextInt();
        
        if(mm+mm2 >= 60){
            int plusHour = (mm+mm2)/60;
            mm = (mm+mm2)%60;
            hh += plusHour;
            if(hh>=24){
                hh = hh%24;
            }
        }else {
			mm=mm+mm2;
		}
        
        System.out.println(""+hh+" "+mm);
        
    }
}