class Solution {
    public int solution(int order) {
        String orderStr = String.valueOf(order);
        int clapCount = 0;

        for (int i = 0; i < orderStr.length(); i++) {
            char ch = orderStr.charAt(i);
            if (ch == '3' || ch == '6' || ch == '9') {
                clapCount++;
            }
        }

        return clapCount;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(3));    // 1
        System.out.println(sol.solution(29423)); // 2
    }
}
