class Solution {
    public int solution(int i, int j, int k) {
        int count = 0; // k가 등장하는 횟수를 카운트할 변수
        
        // i부터 j까지 순회
        for (int num = i; num <= j; num++) {
            // 현재 숫자를 문자열로 변환
            String numStr = Integer.toString(num);
            
            // 문자열에서 k를 찾아 등장 횟수를 카운트
            for (int index = 0; index < numStr.length(); index++) {
                // 문자열의 각 문자를 숫자로 변환하여 k와 비교
                if ((numStr.charAt(index) - '0') == k) {
                    count++;
                }
            }
        }
        
        return count;
    }
}