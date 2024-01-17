class Solution {
    public int solution(int hp) {
        int[] dp = new int[hp + 1];

        // 초기값 설정
        dp[0] = 0; // 체력이 0인 경우 필요한 병력은 0
        for (int i = 1; i <= hp; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        // 동적 프로그래밍을 이용한 최소 병력 계산
        for (int i = 1; i <= hp; i++) {
            if (i >= 1 && dp[i - 1] != Integer.MAX_VALUE) {
                dp[i] = Math.min(dp[i], dp[i - 1] + 1); // 일개미 사용
            }
            if (i >= 3 && dp[i - 3] != Integer.MAX_VALUE) {
                dp[i] = Math.min(dp[i], dp[i - 3] + 1); // 병정개미 사용
            }
            if (i >= 5 && dp[i - 5] != Integer.MAX_VALUE) {
                dp[i] = Math.min(dp[i], dp[i - 5] + 1); // 장군개미 사용
            }
        }

        return dp[hp];
    }
}