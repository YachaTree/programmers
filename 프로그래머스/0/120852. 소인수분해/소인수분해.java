import java.util.ArrayList;
import java.util.List;


class Solution {
   public List<Integer> solution(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        // 2로 나누어 떨어지는 동안 계속 나눔.
        while (n % 2 == 0) {
            if (!primeFactors.contains(2)) {
                primeFactors.add(2);
            }
            n /= 2;
        }

        // 이제 홀수 소인수만 남음.
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // i로 나누어 떨어지는 동안 계속 나눔.
            while (n % i == 0) {
                if (!primeFactors.contains(i)) {
                    primeFactors.add(i);
                }
                n /= i;
            }
        }

        // 소인수분해 후에 남은 숫자가 2보다 크면, 이는 n이 소수임을 의미.
        if (n > 2) {
            primeFactors.add(n);
        }

        return primeFactors;
    }
}