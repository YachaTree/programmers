import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        String[] inputs = br.readLine().split(" ");
        BigInteger P = new BigInteger(inputs[0]);
        int K = Integer.parseInt(inputs[1]);
        

        boolean[] isPrime = new boolean[K];
        for (int i = 2; i < K; i++) {
            isPrime[i] = true;
        }
        

        for (int i = 2; i < K; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < K && j > 0; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        

        for (int r = 2; r < K; r++) {
            if (isPrime[r] && P.mod(BigInteger.valueOf(r)).equals(BigInteger.ZERO)) {

                System.out.println("BAD " + r);
                return;
            }
        }
        

        System.out.println("GOOD");
    }
}
