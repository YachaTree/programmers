import java.util.*;

public class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();
        int[] result = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            hallOfFame.add(score[i]);
            
            if (hallOfFame.size() > k) {
                hallOfFame.poll();
            }
            
            result[i] = hallOfFame.peek();
        }
        
        return result;
    }
}
