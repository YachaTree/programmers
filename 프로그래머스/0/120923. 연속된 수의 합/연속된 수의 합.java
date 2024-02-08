public class Solution {
    public int[] solution(int num, int total) {
        // 시작 정수 계산
        int start = (total - (num * (num - 1) / 2)) / num;
        
        // 결과 배열 생성
        int[] result = new int[num];
        for (int i = 0; i < num; i++) {
            result[i] = start + i;
        }
        
        return result;
    }
}
