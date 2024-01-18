class Solution {
       public static int solution(int n) {
        int i = 1;
        long factorial = 1;
        
        // 팩토리얼 값을 계산하면서 n을 초과하지 않을 때까지 i 증가
        while (factorial <= n) {
            i++;
            factorial *= i;
        }
        
        // n을 초과하기 전의 i 값을 반환해야 하므로 i-1을 반환합니다.
        return i - 1;
    }
}