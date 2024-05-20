import java.io.*;

public class Main {
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int count = Integer.parseInt(br.readLine());
            
            Stack<Integer> stack = new Stack<>();
            for(int i=0; i<count; i++){
                String line = br.readLine();
                switch(line){
                    case "2": 
                        if(!stack.isEmpty()){
                            bw.write(stack.peek()+"\n");
                            stack.pop();
                        }else{
                            bw.write(-1+"\n");
                        }
                        break;
                    case "3": 
                        bw.write(stack.size()+"\n"); 
                        break;
                    case "4": 
                        if(stack.isEmpty()){
                            bw.write(1+"\n");
                        }else{
                            bw.write(0+"\n");
                        }
                        break;
                    case "5": 
                        if(stack.isEmpty()){
                            bw.write(-1+"\n");
                        }else{
                            bw.write(stack.peek()+"\n");
                        }
                        break;
                    default: 
                        stack.push(Integer.parseInt(line.split(" ")[1]));
                        break;
                }
            }
            bw.flush();
            
        }catch(Exception e){
            
        }
        
    }
    
    public static class Stack<T> {
        public static class Node<T>{
            private T data;
            private Node<T> next;
            
            public Node(T data){
                this.data = data;
            }
        }
        
        private Node<T> top;
        private int size = 0;
        
        public void push(T data){
            
            Node<T> item = new Node(data);
            if(top == null){
                top = item;
            }else{
                item.next = top;
                top = item;
            }
            size++;
        }
        
        public T pop() throws Exception {
            if(top == null){
                throw new Exception();
            }
            
            Node<T> item = top;
            top = top.next;
            
            size--;
            
            return item.data;
        }
        
        public T peek() throws Exception{
            if(top == null){
                throw new Exception();
            }
            return top.data;
        }
        
        public boolean isEmpty(){
            return top == null;
        }
        
        public int size(){
            return size;
        }
    }
}