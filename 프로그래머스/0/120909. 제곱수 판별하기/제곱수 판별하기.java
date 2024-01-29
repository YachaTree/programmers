class Solution {
    public int solution(int n) {
        // n의 제곱근을 계산.
        double sqrt = Math.sqrt(n);

        // 제곱근을 정수로 변환한 뒤 다시 제곱하여 n과 비교.
        if (n == Math.pow((int) sqrt, 2)) {
            // n이 제곱수인 경우
            return 1;
        } else {
            // n이 제곱수가 아닌 경우
            return 2;
        }
    }
}