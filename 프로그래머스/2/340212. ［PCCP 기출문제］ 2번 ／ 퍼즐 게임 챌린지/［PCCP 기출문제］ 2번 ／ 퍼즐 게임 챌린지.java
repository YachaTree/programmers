import java.util.*;

class Solution {
    public static int solution(int[] diffs, int[] times, long limit) {
        int n = diffs.length;
        int left = 1;
        int right = 100000;
        int result = right;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (canSolveAllPuzzles(diffs, times, limit, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    private static boolean canSolveAllPuzzles(int[] diffs, int[] times, long limit, int level) {
        long totalTime = 0;
        for (int i = 0; i < diffs.length; i++) {
            int diff = diffs[i];
            int timeCur = times[i];
            int timePrev = (i == 0) ? 0 : times[i - 1];

            if (diff <= level) {
                totalTime += timeCur;
            } else {
                int mistakes = diff - level;
                totalTime += (long) mistakes * (timeCur + timePrev) + timeCur;
            }

            if (totalTime > limit) {
                return false;
            }
        }
        return true;
    }
}