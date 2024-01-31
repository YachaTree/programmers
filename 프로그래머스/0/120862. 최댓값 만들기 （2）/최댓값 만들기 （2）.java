import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers); // 배열 정렬

        int n = numbers.length;
        // 가장 큰 두 양수 또는 가장 작은 두 음수 중 더 큰 값을 선택
        return Math.max(numbers[0] * numbers[1], numbers[n - 1] * numbers[n - 2]);
    }
}
