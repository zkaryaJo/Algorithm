import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int count = Integer.parseInt(line.split(" ")[0]);
        int cut = Integer.parseInt(line.split(" ")[1]);
        String[] arr = scan.nextLine().split(" ");
        int[] arr2 = new int[count];
        for(int i=0; i<arr.length; i++){
            arr2[i] = Integer.parseInt(arr[i]);
        }
        
        arr2 = Arrays.stream(arr2).sorted().toArray();
        System.out.println(arr2[count-cut]);
        
    }
}