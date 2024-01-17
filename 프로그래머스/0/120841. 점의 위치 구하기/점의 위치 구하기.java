class Solution {
    public int solution(int[] dot) {
       // x 좌표는 dot 배열의 첫 번째 원소, y 좌표는 두 번째 원소로 저장
        int x = dot[0];
        int y = dot[1];
        
        // x와 y 좌표의 부호에 따라 사분면을 결정
        if (x > 0 && y > 0) {
            // 제1사분면
            return 1;
        } else if (x < 0 && y > 0) {
            // 제2사분면
            return 2;
        } else if (x < 0 && y < 0) {
            // 제3사분면
            return 3;
        } else if (x > 0 && y < 0) {
            // 제4사분면
            return 4;
        } else {
            // 점이 축 위에 있는 경우는 사분면에 속하지 않음
             throw new IllegalArgumentException("점이 축 위에 있어 사분면에 속하지 않습니다.");
        }
    }
}