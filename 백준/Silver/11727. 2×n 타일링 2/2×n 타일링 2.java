import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            System.out.println(1);
            return;
        }
        
        int prev = 1; // dp[i-2]
        int curr = 3; // dp[i-1]
        for (int i = 3; i <= n; i++) {
            int next = (curr + 2 * prev) % 10007; // dp[i]
            prev = curr;
            curr = next;
        }

        System.out.println(curr);
    }
}
