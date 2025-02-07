import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int idx = 0; idx < commands.length; idx++) {
            int i = commands[idx][0];
            int j = commands[idx][1];
            int k = commands[idx][2];

            int[] temp = Arrays.copyOfRange(array, i - 1, j);

            Arrays.sort(temp);

            answer[idx] = temp[k - 1];
        }
        return answer;
    }
}
