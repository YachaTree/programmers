import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int minPackagePrice = Integer.MAX_VALUE;
        int minSinglePrice = Integer.MAX_VALUE;
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int packagePrice = Integer.parseInt(st.nextToken());
            int singlePrice = Integer.parseInt(st.nextToken());
            
            if (packagePrice < minPackagePrice) {
                minPackagePrice = packagePrice;
            }
            if (singlePrice < minSinglePrice) {
                minSinglePrice = singlePrice;
            }
        }
        
        int totalCost = 0;
        
        if (minPackagePrice <= minSinglePrice * 6) {
            totalCost = (N / 6) * minPackagePrice;
            N %= 6;
            if (minPackagePrice < minSinglePrice * N) {
                totalCost += minPackagePrice;
            } else {
                totalCost += minSinglePrice * N;
            }
        } else {
            totalCost = N * minSinglePrice;
        }
        
        System.out.println(totalCost);
    }
}
