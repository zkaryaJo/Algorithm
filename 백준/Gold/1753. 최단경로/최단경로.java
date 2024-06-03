import java.util.*;
import java.io.*;

public class Main{
    
    public static int V,E;
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    public static int INF = (int)1e9;
    public static int[] d = new int[20001];
    
    private static class Node implements Comparable<Node>{
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
    
    public static void dijkstra(int start){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start,0));
        d[start] = 0; //필수!
        
        while(!pq.isEmpty()){
            Node curr = pq.poll(); //현재노드
            int now = curr.index;
            
            if(d[now] < curr.distance) continue;
            
            for(int i=0; i<graph.get(now).size(); i++) {
            	Node next = graph.get(now).get(i);
            	int cost = d[now]+next.distance; //현재까지의 거리 + 다음까지의 경로
            	if(cost < d[next.index]) { //기존에 저장되어있던 다음까지의 경로와 비교
            		d[next.index] = cost;
            		pq.offer(new Node(next.index, cost));
            	}
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String line = br.readLine(); // 1
        V = Integer.parseInt(line.split(" ")[0]);
        E = Integer.parseInt(line.split(" ")[1]);
        int start = Integer.parseInt(br.readLine()); // 2
        
        Arrays.fill(d,INF); // 거리 좌표
        
        //그래프 초기화
        for(int i=0; i<=V; i++){
            graph.add(new ArrayList<Node>());
        }
        
        for(int i=0; i<E; i++){
            String input = br.readLine(); //3
            int u = Integer.parseInt(input.split(" ")[0]); //
            int v = Integer.parseInt(input.split(" ")[1]); // 
            int w = Integer.parseInt(input.split(" ")[2]); //
            graph.get(u).add(new Node(v, w));
        }
        
        dijkstra(start);
        
        for(int i=1; i<=V; i++){
            if(i==start){
                bw.write("0\n");
            }else if(d[i] == INF){
                bw.write("INF\n");
            }else{
                bw.write(""+d[i]+"\n");
            }
        }
        bw.flush();
        
    }
}