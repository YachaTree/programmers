
class Solution {
    public String solution(String my_string) {
        // StringBuilder를 사용하여 문자열을 뒤집습니다.
        return new StringBuilder(my_string).reverse().toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // 테스트를 위한 문자열
        String testString = "Hello, World!";
        
        // 뒤집힌 문자열 출력
        System.out.println(sol.solution(testString));
    }
}
