class Solution {
    public String solution(String cipher, int code) {
        StringBuilder result = new StringBuilder();

        for (int i = code - 1; i < cipher.length(); i += code) {
            result.append(cipher.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("dfjardstddetckdaccccdegk", 4)); // "attack"
        System.out.println(sol.solution("pfqallllabwaoclk", 2));         // "fallback"
    }
}
