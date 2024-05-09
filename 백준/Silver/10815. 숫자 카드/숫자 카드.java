import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count1 = Integer.parseInt(scan.nextLine());
        String[] arr1 = scan.nextLine().split(" ");
        int count2 = Integer.parseInt(scan.nextLine());
        String[] arr2 = scan.nextLine().split(" ");
        
        Set<String> set = new HashSet<>();
        
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");
            }
        }
        
    }
}