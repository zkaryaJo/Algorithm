import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        long count = Arrays.stream(input.split(" ")).filter(i -> i.length() > 0 ).count();
        System.out.println(count);
    }
}