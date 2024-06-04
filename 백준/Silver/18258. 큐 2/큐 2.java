import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        Queue q = new Queue();
        for(int i=0; i<count; i++){
            String line = br.readLine();
            String command = line.split(" ")[0];
            switch(command){
                    case "push": q.push(Integer.parseInt(line.split(" ")[1])); break; 
                    case "pop": bw.write(q.pop()+"\n"); break;
                    case "size": bw.write(q.size()+"\n"); break;
                    case "empty": bw.write((q.isEmpty()?1:0)+"\n"); break;
                    case "front": bw.write(q.front()+"\n"); break;
                    case "back": bw.write(q.back()+"\n"); break;
                    default: break;
            }
        }
        bw.flush();
    }
    
    private static class Node {
        public int data;
        public Node next;
            
        public Node(int data){
            this.data = data;
        }
    }
    
    private static class Queue {
        private Node head;
        private Node tail;
        private int size;
        
        public Queue(){
            this.head = null;
            this.tail = null;
            this.size = 0;
        }
        
        public void push(int n){
            if(head==null){
                head = new Node(n);
                tail = head;
            }else{
                Node curr = new Node(n);
                tail.next = curr;
                tail = curr;
            }
            this.size++;
        }
        
        public int pop(){
            if(isEmpty()) return -1;
            int result = head.data;
            head = head.next;
            
            this.size--;
            
            return result;
        }
        
        public boolean isEmpty(){
            return this.size == 0 ? true : false;
        }
        
        public int size(){
            return this.size;
        }
        
        public int front(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
        
        public int back(){
            if(isEmpty()){
                return -1;
            }
            return tail.data;
        }
    }
}