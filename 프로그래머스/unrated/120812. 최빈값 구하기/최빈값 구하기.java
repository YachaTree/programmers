import java.util.HashMap;
class Solution {
    public int solution(int[] array) {
         HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // 각 숫자의 빈도 계산
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
        int answer = -1;

        // 최빈값 찾기
        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                answer = key;
            } else if (frequency == maxFrequency) {
                answer = -1; // 최빈값이 여러 개인 경우
            }
        }

        return answer;
    }
}