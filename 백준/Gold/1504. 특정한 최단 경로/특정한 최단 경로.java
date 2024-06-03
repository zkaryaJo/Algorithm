import java.util.*;
import java.io.*;

public class Main{
    
    public static int N,E;
    public static int[] d = new int[801];
    public static int EOI = 200000000;
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    
    public static class Node implements Comparable<Node>{
        public int index;
        public int distance;
        
        public Node(int index, int distance){
            this.index = index;
            this.distance = distance;
        }
        
        @Override
        public int compareTo(Node other){
            if(this.distance < other.distance){
                return -1;
            }
            return 1;
        }
    }
    
    public static int dijkstra(int start, int end){
    	
    	Arrays.fill(d, EOI);
    	
        PriorityQueue<Node> pq = new PriorityQueue<Node>();
        pq.offer(new Node(start,0));
        d[start] = 0;
        
        while(!pq.isEmpty()){
            Node curr = pq.poll();
            
            int now = curr.index;
            if(d[now] < curr.distance) continue;
            
            for(int i=0; i<graph.get(now).size(); i++){
                Node next = graph.get(now).get(i);
                int cost = next.distance + d[now];
                if(cost < d[next.index]){
                    d[next.index] = cost;
                    pq.offer(new Node(next.index, cost));
                }
                
            }
        }
        return d[end];
    
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String line = br.readLine();
        N = Integer.parseInt(line.split(" ")[0]);
        E = Integer.parseInt(line.split(" ")[1]);
        
        //1. 그래프 초기화
        for(int i=0; i<=N; i++){
            graph.add(new ArrayList<Node>());
        }
        
        //2. 그래프 구성
        for(int i=0; i<E; i++){
            String input = br.readLine();
            int a = Integer.parseInt(input.split(" ")[0]);
            int b = Integer.parseInt(input.split(" ")[1]);
            int c = Integer.parseInt(input.split(" ")[2]);
            graph.get(a).add(new Node(b,c));
            graph.get(b).add(new Node(a,c));
        }
        
        String input = br.readLine();
        int v1 = Integer.parseInt(input.split(" ")[0]);
        int v2 = Integer.parseInt(input.split(" ")[1]);
        
        int sum1 = 0;
        int sum2 = 0;

        //1 > v1 > v2 > N
    	sum1 += dijkstra(1, v1);
    	sum1 += dijkstra(v1, v2); 
    	sum1 += dijkstra(v2, N);
        
        //1 -> v2 > v1 > N
    	sum2 += dijkstra(1, v2);
    	sum2 += dijkstra(v2, v1);
        sum2 += dijkstra(v1, N);
        
        if(sum1>=EOI && sum2 >=EOI) {
        	System.out.println(-1);
        } else {
        	System.out.println(Math.min(sum1, sum2));
        }
        
    }
}