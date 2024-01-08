class Solution {
    public int[] solution(int n) {
         int count = (n + 1) / 2;

        // 홀수를 저장할 배열 생성
        int[] answer = new int[count];

        // 홀수 찾아서 배열에 저장
        int num = 1;
        for (int i = 0; i < count; i++) {
            answer[i] = num;
            num += 2; // 다음 홀수
        }

        return answer;
    }
}