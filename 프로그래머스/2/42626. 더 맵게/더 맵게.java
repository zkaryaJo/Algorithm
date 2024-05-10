import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i=0; i<scoville.length; i++){
            minHeap.add(scoville[i]);
        }

        while(!minHeap.isEmpty()){
            if(minHeap.peek() >= K){
                return answer;
            }else{
                if(minHeap.size()>=2){
                    int mix = minHeap.poll() + minHeap.poll()*2;
                    minHeap.add(mix);
                }else{
                    return -1;
                }
            }
            answer++;
        }

        return -1;
    }
}