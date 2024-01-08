class Solution {
    public int solution(int[] array) {
        int[] frequency = new int[1000];

        // 각 숫자의 빈도 계산
        for (int num : array) {
            frequency[num]++;
        }

        int maxFrequency = 0;
        int answer = -1;

        // 최빈값 찾기
        for (int i = 0; i < 1000; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                answer = i;
            } else if (frequency[i] == maxFrequency) {
                answer = -1; // 최빈값이 여러 개인 경우
            }
        }

        return answer;
    }
}