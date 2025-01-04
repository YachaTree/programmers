import java.util.HashSet;
import java.util.Set;

class Solution {
    
    public int solution(int[] nums) {
        int selectableCount = nums.length / 2;
        
        Set<Integer> uniquePokemons = new HashSet<>();
        for (int num : nums) {
            uniquePokemons.add(num);
        }
        
        return Math.min(selectableCount, uniquePokemons.size());
    }
}