import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        // 문자열을 소문자로 변환
        my_string = my_string.toLowerCase();

        // 문자열을 문자 배열로 변환
        char[] chars = my_string.toCharArray();

        // 문자 배열 정렬
        Arrays.sort(chars);

        // 정렬된 문자 배열을 문자열로 다시 결합
        return new String(chars);
    }
}