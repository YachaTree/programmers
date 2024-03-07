import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // n 입력 받기
        int[] dp = new int[1001]; // n의 최댓값 + 1 크기의 배열 선언

        // 초기 조건 설정
        dp[1] = 1;
        dp[2] = 3;

        // dp[n]을 구하기 위한 반복문 실행
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i-1] + 2*dp[i-2]) % 10007;
        }

        // 결과 출력
        System.out.println(dp[n]);
    }
}
