import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=1; i<=input; i++){
            deque.offer(i);
        }
        
        while(deque.size() > 1){
            deque.poll(); // 맨위 버리기
            deque.offerLast(deque.poll()); //두번째 맨아래로 옮기기
        }
        
        System.out.print(deque.poll());
    }
}