import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        while(scanner.hasNextLine()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();    
            if(a==0 && b==0){
                break;
            }
            
            if(a%b==0){
                System.out.println("multiple");
            }else if(b%a==0){
                System.out.println("factor");
            }else{
                System.out.println("neither");
            }
        }
    }
}