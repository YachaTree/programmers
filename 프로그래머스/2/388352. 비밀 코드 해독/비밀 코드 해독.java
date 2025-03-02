class Solution {
    public int solution(int n, int[][] q, int[] ans) {
        int answer = 0;
        for (int a = 1; a <= n - 4; a++) { 
            for (int b = a + 1; b <= n - 3; b++) { 
                for (int c = b + 1; c <= n - 2; c++) {
                    for (int d = c + 1; d <= n - 1; d++) {
                        for (int e = d + 1; e <= n; e++) {
                            int[] comb = {a, b, c, d, e};

                            if (isValid(comb, q, ans)) {
                                answer++;
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
    
    private boolean isValid(int[] comb, int[][] q, int[] ans) {
        for (int i = 0; i < q.length; i++) {
            int count = 0;
            for (int num : comb) {
                for (int candidate : q[i]) {
                    if (num == candidate) {
                        count++;
                        break;
                    }
                }
            }
            if (count != ans[i]) {
                return false;
            }
        }
        return true;
    }
}
