import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int n = sequence.length;
        int left = 0, right = 0;
        int sum = sequence[0];
        int minLength = Integer.MAX_VALUE;
        int[] result = new int[2];

        while (right < n) {
            if (sum == k) {
                int currentLength = right - left + 1;
                if (currentLength < minLength) {
                    minLength = currentLength;
                    result[0] = left;
                    result[1] = right;
                }
                sum -= sequence[left];
                left++;
            } else if (sum < k) {
                right++;
                if (right < n) {
                    sum += sequence[right];
                }
            } else {
                sum -= sequence[left];
                left++;
            }
        }
        return result;
    }
}
