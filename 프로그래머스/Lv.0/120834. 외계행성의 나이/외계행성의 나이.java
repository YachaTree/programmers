class Solution {
    public String solution(int age) {
        StringBuilder result = new StringBuilder();

        // 나이를 문자열로 변환
        String ageStr = String.valueOf(age);

        // 각 자릿수를 순회하며 알파벳으로 변환
        for (int i = 0; i < ageStr.length(); i++) {
            // 각 자릿수 숫자를 알파벳으로 변환 ('0'을 빼서 정수로 변환한 후 'a'를 더함)
            char converted = (char) (ageStr.charAt(i) - '0' + 'a');
            result.append(converted);
        }

        return result.toString();
    }
}