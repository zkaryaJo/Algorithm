import java.io.*;

public class Main{
    
    public static int N,M;
    public static int[] arr; 		//
    public static boolean[] visited;//방문여부 
    
    private static void dfs(int depth){
        
        if(depth == M){
            for(int i=1; i<=M; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }else{
            for(int i=1; i<=N; i++){
                if(!visited[i]){
                    visited[i] = true;
                    arr[depth+1] = i;
                    dfs(depth+1);
                    visited[i] = false;
                }
            }    
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
        String line = br.readLine();
        N = Integer.parseInt(line.split(" ")[0]);
        M = Integer.parseInt(line.split(" ")[1]);
        visited = new boolean[N+1];
        arr = new int[M+1];
        
        dfs(0);           
        
    }
}