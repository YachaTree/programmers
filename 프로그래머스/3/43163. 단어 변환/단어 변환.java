import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        List<String> wordList = Arrays.asList(words);
        
        if (!wordList.contains(target)) return 0;

        Queue<WordStep> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(new WordStep(begin, 0));
        visited.add(begin);

        while (!queue.isEmpty()) {
            WordStep current = queue.poll();

            if (current.word.equals(target)) {
                return current.steps;
            }

            for (String word : wordList) {
                if (!visited.contains(word) && isOneLetterDifferent(current.word, word)) {
                    queue.add(new WordStep(word, current.steps + 1));
                    visited.add(word);
                }
            }
        }

        return 0;
    }

    private boolean isOneLetterDifferent(String word1, String word2) {
        int diffCount = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                diffCount++;
                if (diffCount > 1) return false;
            }
        }
        return diffCount == 1;
    }

}

class WordStep {
    String word;
    int steps;

    WordStep(String word, int steps) {
        this.word = word;
        this.steps = steps;
    }
}
