public class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 두 분수의 합 계산
        int numerator = numer1 * denom2 + numer2 * denom1;
        int denominator = denom1 * denom2;

        // 최대공약수를 찾아 기약분수로 만듦
        int gcdVal = gcd(numerator, denominator);

        // 기약분수의 분자와 분모를 배열에 담아 반환
        return new int[]{numerator / gcdVal, denominator / gcdVal};
    }
}