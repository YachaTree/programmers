import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        
        int[] P = new int[M];
        for (int i = 0; i < M; i++) {
            P[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(P);
        
        int maxProfit = 0;
        int optimalPrice = 0;
        
        for (int i = 0; i < M; i++) {
            int currentPrice = P[i];
            int numberOfCustomers = M - i;
            int eggsToSell = Math.min(N, numberOfCustomers);
            int currentProfit = currentPrice * eggsToSell;
            
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
                optimalPrice = currentPrice;
            }
        }
        
        System.out.println(optimalPrice + " " + maxProfit);
    }
}
