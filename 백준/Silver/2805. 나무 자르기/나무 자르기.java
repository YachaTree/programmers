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
        for (int i = 0; i < N; i++) {
            trees[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(trees);

        long low = 0;
        long high = trees[N - 1];
        long answer = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            long sum = 0;
            for (int i = 0; i < N; i++) {
                if (trees[i] > mid) {
                    sum += (trees[i] - mid);
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
