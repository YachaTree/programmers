class Solution {
    public int solution(int[] wallet, int[] bill) {
        int walletSmall = Math.min(wallet[0], wallet[1]);
        int walletLarge = Math.max(wallet[0], wallet[1]);
        
        int a = bill[0];
        int b = bill[1];
        
        int answer = 0;
        while (Math.min(a, b) > walletSmall || Math.max(a, b) > walletLarge) {
            if (a > b) {
                a /= 2;
            } else {
                b /= 2;
            }
            answer++;
        }
        return answer;
    }
}
