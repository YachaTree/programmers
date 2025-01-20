import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        Map<Character, Integer> lastIndexMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (lastIndexMap.containsKey(currentChar)) {
                result[i] = i - lastIndexMap.get(currentChar);
            } else {
                result[i] = -1;
            }

            lastIndexMap.put(currentChar, i);
        }

        return result;
    }
}
