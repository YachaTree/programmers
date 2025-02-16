class Solution {
    public long solution(int[] sequence) {
        long answer = 0;
        int n = sequence.length;
        
        long[] dp1 = new long[n];
        long[] dp2 = new long[n];
        
        dp1[0] = sequence[0];
        dp2[0] = -sequence[0];
        answer = Math.max(Math.abs(dp1[0]), Math.abs(dp2[0]));
        
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                dp1[i] = Math.max(dp1[i-1] + sequence[i], sequence[i]);
                dp2[i] = Math.max(dp2[i-1] - sequence[i], -sequence[i]);
            } else {
                dp1[i] = Math.max(dp1[i-1] - sequence[i], -sequence[i]);
                dp2[i] = Math.max(dp2[i-1] + sequence[i], sequence[i]);
            }
            
            answer = Math.max(answer, Math.max(Math.abs(dp1[i]), Math.abs(dp2[i])));
        }
        
        return answer;
    }
}
