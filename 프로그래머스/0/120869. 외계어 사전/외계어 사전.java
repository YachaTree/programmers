import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Set<String> permutations = new HashSet<>();
        generatePermutations(permutations, spell, "", new boolean[spell.length]);

        // 생성된 순열 중 하나라도 dic에 존재하면 1 반환
        for (String word : permutations) {
            if (Arrays.asList(dic).contains(word)) {
                return 1;
            }
        }

        // 아무것도 매치되지 않으면 2 반환
        return 2;
    }

    private void generatePermutations(Set<String> permutations, String[] spell, String current, boolean[] used) {
        if (current.length() == spell.length) {
            permutations.add(current);
            return;
        }

        for (int i = 0; i < spell.length; i++) {
            if (!used[i]) {
                used[i] = true;
                generatePermutations(permutations, spell, current + spell[i], used);
                used[i] = false; // 백트래킹
            }
        }
    }
}