import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int scov : scoville) {
            minHeap.offer(scov);
        }
        
        int mixCount = 0;
        
        while (minHeap.size() > 1) {
            if (minHeap.peek() >= K) {
                return mixCount;
            }
            
            int first = minHeap.poll();
            int second = minHeap.poll();
            int newScoville = first + (second * 2);
            
            minHeap.offer(newScoville);
            mixCount++;
        }
        
        return minHeap.peek() >= K ? mixCount : -1;
    }
}