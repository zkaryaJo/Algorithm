import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];
        int[] arrCnt = new int[8001];
        for(int i=0; i<count; i++){
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
            arrCnt[n+4000]++;
        }
        
        arr = Arrays.stream(arr).sorted().toArray();

        int average = (int)Math.round(Arrays.stream(arr).average().orElse(0));
        int middle = arr[count/2];
        int range = arr[count-1]-arr[0];
        
        //최빈값
        int manyIndex = -1;
        int manyValue = -1;
        boolean flag = false;
        for(int i=0; i<=8000; i++) {
        	if(manyValue < arrCnt[i]) {
        		manyValue = arrCnt[i];
        		manyIndex = i;
        		flag = true;
        		continue;
        	}
        	if(manyValue == arrCnt[i] && flag==true) {
        		manyValue = arrCnt[i];
        		manyIndex = i;
        		flag = false;
        	}
        }
        
        int many = manyIndex-4000;

        bw.write(average+"\n");
        bw.write(middle+"\n");
        bw.write(many+"\n");
        bw.write(range+"\n");
        bw.flush();
        
        
    }
}