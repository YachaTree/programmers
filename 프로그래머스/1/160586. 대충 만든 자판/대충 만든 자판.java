import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {

    public int[] solution(String[] keymap, String[] targets) {
        int[] minPress = new int[26];
        for (int i = 0; i < 26; i++) {
            minPress[i] = -1; 
        }

        for (String keys : keymap) {
            for (int i = 0; i < keys.length(); i++) {
                char c = keys.charAt(i);
                int idx = c - 'A';

                if (minPress[idx] == -1 || (i + 1) < minPress[idx]) {
                    minPress[idx] = i + 1;
                }
            }
        }

        int[] result = new int[targets.length];

        for (int t = 0; t < targets.length; t++) {
            String target = targets[t];
            int pressCount = 0;
            boolean impossible = false;

            for (int i = 0; i < target.length(); i++) {
                char c = target.charAt(i);
                int idx = c - 'A';

                if (minPress[idx] == -1) {
                    impossible = true;
                    break;
                } else {
                    pressCount += minPress[idx];
                }
            }

            result[t] = (impossible) ? -1 : pressCount;
        }

        return result;
    }
}
