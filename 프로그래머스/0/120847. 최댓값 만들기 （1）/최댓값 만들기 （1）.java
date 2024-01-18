import java.util.Arrays;

class Solution {
    public static int solution(int[] numbers) {
        // 배열을 오름차순으로 정렬
        Arrays.sort(numbers);

        // 배열의 마지막 두 수를 곱하거나, 첫 번째(가장 작은 음수) 두 수를 곱한 값 중 더 큰 값을 반환
        int maxProduct = Math.max(numbers[numbers.length - 1] * numbers[numbers.length - 2],
                                  numbers[0] * numbers[1]);

        return maxProduct;
    }
}