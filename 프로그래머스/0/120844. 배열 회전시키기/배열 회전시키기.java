import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] result = new int[numbers.length];
        
        if ("right".equals(direction)) {
            // 오른쪽으로 회전할 때 마지막 요소가 첫 번째가 된다.
            result[0] = numbers[numbers.length - 1];
            // 나머지 배열을 복사한다.
            System.arraycopy(numbers, 0, result, 1, numbers.length - 1);
        } else if ("left".equals(direction)) {
            // 왼쪽으로 회전할 때 첫 번째 요소가 마지막이 된다.
            result[numbers.length - 1] = numbers[0];
            // 나머지 배열을 복사.
            System.arraycopy(numbers, 1, result, 0, numbers.length - 1);
        }
        
        return result;
    }
}