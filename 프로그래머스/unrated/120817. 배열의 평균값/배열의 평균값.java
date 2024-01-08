class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i = 0; i <= numbers.length - 1; i++) {
            answer += numbers[i];
        }
        return answer / numbers.length;
    }
}