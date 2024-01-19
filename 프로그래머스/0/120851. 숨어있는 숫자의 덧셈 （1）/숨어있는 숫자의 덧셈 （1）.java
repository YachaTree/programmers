class Solution {
    public int solution(String my_string) {
         int sum = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isDigit(c)) {
                sum += c - '0'; // 문자를 정수로 변환하고 합계에 추가.
            }
        }
        return sum;
    }
}