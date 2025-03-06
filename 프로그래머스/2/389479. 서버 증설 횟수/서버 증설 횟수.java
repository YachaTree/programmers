class Solution {
    public int solution(int[] players, int m, int k) {
        int totalProvisionCount = 0;
        int[] add = new int[24];
        
        for (int i = 0; i < 24; i++) {
            int required = players[i] < m ? 0 : players[i] / m;
            
            int active = 0;
            int start = Math.max(0, i - k + 1);
            for (int j = start; j <= i; j++) {
                active += add[j];
            }
            
            if (active < required) {
                int need = required - active;
                add[i] = need;
                totalProvisionCount += need;
            }
        }
        
        int answer = totalProvisionCount;
        return answer;
    }
}
