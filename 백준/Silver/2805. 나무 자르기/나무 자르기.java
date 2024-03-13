import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        
        long[] trees = new long[N];
        st = new StringTokenizer(br.readLine());
        long max = 0; // 나무의 최대 높이를 저장할 변수
        for (int i = 0; i < N; i++) {
            trees[i] = Long.parseLong(st.nextToken());
            if (trees[i] > max) {
                max = trees[i]; // 나무의 최대 높이 갱신
            }
        }

        long low = 0;
        long high = max; // 나무 중 가장 높은 나무의 높이로 초기화
        long answer = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            long sum = 0;
            for (long tree : trees) {
                if (tree > mid) {
                    sum += (tree - mid);
                }
            }
            if (sum < M) {
                high = mid - 1;
            } else {
                answer = mid;
                low = mid + 1;
            }
        }

        System.out.println(answer);
    }
}
