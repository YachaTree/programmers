import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int currentWeight = 0;
        int index = 0; 
        
        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }
        
        while (!bridge.isEmpty()) {
            time++;
            
            int exitingTruck = bridge.poll();
            currentWeight -= exitingTruck;
            
            if (index < truck_weights.length) {
                int nextTruck = truck_weights[index];
                if (currentWeight + nextTruck <= weight) {
                    bridge.add(nextTruck); 
                    currentWeight += nextTruck;
                    index++;
                } else {
                    bridge.add(0);
                }
            }
        }
        
        return time;
    }
}