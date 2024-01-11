import java.lang.StringBuilder;

class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        // 문자열의 각 문자를 n번 반복하여 result에 추가합니다.
        for (char ch : my_string.toCharArray()) {
            for (int i = 0; i < n; i++) {
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}