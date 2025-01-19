import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        List<Character> alphabet = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            if (!skip.contains(String.valueOf(c))) {
                alphabet.add(c);
            }
        }

        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            int currentIndex = alphabet.indexOf(c);
            int newIndex = (currentIndex + index) % alphabet.size();
            result.append(alphabet.get(newIndex));
        }

        return result.toString();
    }
}