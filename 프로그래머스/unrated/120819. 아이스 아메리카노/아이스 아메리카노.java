class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int count = money / 5500;
        int change = money - count * 5500;
        answer[0] = count;
        answer[1] = change;
        return answer;
    }
}