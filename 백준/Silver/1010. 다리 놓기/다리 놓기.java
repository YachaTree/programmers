import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]); // 서쪽 사이트 개수
            int M = Integer.parseInt(input[1]); // 동쪽 사이트 개수

            sb.append(combination(M, N)).append("\n");
        }

        System.out.print(sb.toString());
    }


    public static long combination(int M, int N) {
        if (N == 0 || M == N) {
            return 1;
        }

        long result = 1;
        for (int i = 0; i < N; i++) {
            result *= (M - i);
            result /= (i + 1);
        }
        return result;
    }
}
