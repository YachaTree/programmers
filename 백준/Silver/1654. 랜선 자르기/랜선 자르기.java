import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        long[] cables = new long[K];
        long low = 1;
        long high = 0;
        for(int i = 0; i < K; i++) {
            cables[i] = Long.parseLong(br.readLine());
            if (high < cables[i]) {
                high = cables[i];
            }
        }
        
        long max = 0;
        while(low <= high) {
            long mid = (low + high) / 2;
            if(mid == 0) break;
            
            long count = 0;

            for(int i = 0; i < K; i++) {
                count += cables[i] / mid;
            }
            

            if(count >= N) {
                low = mid + 1;
                if(max < mid) max = mid;
            } else {
                high = mid - 1;
            }
        }
        
        System.out.println(max);
    }
}
