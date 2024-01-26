class Solution {
    public int solution(int num, int k) {
        String numStr = String.valueOf(num);
        int index = numStr.indexOf(String.valueOf(k));

        if (index == -1) {
            return -1;
        } else {
            // 자리 수를 반환하기 위해 1을 더함 (인덱스는 0부터 시작하지만, 자리수는 1부터 시작하기 때문에)
            return index + 1;
        }
    }
}