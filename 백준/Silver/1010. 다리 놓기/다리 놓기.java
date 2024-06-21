import java.math.BigInteger;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        //nCr => n!/(n-r)!/r!
        for(int i=0; i<count; i++){
        	int N = scan.nextInt();
        	int M = scan.nextInt();
            System.out.println(
            		factorial(BigInteger.valueOf(M))
            		.divide(factorial(BigInteger.valueOf(M-N)))
            		.divide(factorial(BigInteger.valueOf(N)))
    		);   
        }
    }
    
    public static BigInteger factorial(BigInteger n){
    	
        if(n.compareTo(BigInteger.valueOf(0))==0) return BigInteger.valueOf(1);
        if(n.compareTo(BigInteger.valueOf(1))==0) return BigInteger.valueOf(1);
        
        return n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
    }
}