public class Solution {
    public int solution(int[] array) {
        int count = 0;

        for (int number : array) {
            while (number > 0) {
                if (number % 10 == 7) {
                    count++;
                }
                number /= 10;
            }
        }

        return count;
    }
}