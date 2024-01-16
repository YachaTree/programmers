class Solution {
    public long solution(int balls, int share) {
        // 조합 공식: nCk = n! / (k! * (n-k)!)
        // 오버플로우 방지를 위해 중간 계산 결과를 나눔
        long result = 1;
        for (int i = 1; i <= share; i++) {
            result *= balls - (share - i);
            result /= i;
        }
        return result;
    }
}