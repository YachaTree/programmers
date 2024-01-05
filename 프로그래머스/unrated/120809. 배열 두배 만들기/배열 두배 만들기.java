public class Solution {
    public int[] solution(int[] numbers) {
        // 입력 배열과 동일한 크기의 배열 생성
        int[] answer = new int[numbers.length];
        
        // 각 원소를 두 배하여 새 배열에 저장
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        
        return answer;
    }
}