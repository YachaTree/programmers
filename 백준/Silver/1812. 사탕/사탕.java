import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int[] sums = new int[N];
        
        for (int i = 0; i < N; i++) {
            sums[i] = Integer.parseInt(br.readLine());
        }
        
        int[] candies = new int[N];
        
        int totalCandies = 0;
        for (int i = 0; i < N; i++) {
            totalCandies += sums[i];
        }
        totalCandies /= 2;
        
        candies[0] = totalCandies;
        for (int i = 1; i < N; i += 2) {
            candies[0] -= sums[i];
        }
        
        for (int i = 1; i < N; i++) {
            candies[i] = sums[i - 1] - candies[i - 1];
        }
        
        for (int i = 0; i < N; i++) {
            System.out.println(candies[i]);
        }
    }
}
