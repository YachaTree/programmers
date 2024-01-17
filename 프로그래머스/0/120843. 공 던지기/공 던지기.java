class Solution {

    public int solution(int[] numbers, int k) {
        // 게임은 사람들이 원을 이루고 서 있는 상황에서, 공이 한 사람을 건너뛰는 것과 같다.
        // 따라서 'k'번 던진 후의 공의 위치는 (k-1)*2 % 원의 길이가 된다.
        int circleLength = numbers.length;
        int finalPosition = ((k - 1) * 2) % circleLength;
        return numbers[finalPosition];
    }
}