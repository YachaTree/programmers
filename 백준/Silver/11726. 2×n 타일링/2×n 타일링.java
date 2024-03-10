import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            System.out.println(1);
            return;
        }

        int prev = 1;
        int current = 2; 
        int next = 0; 

        for (int i = 3; i <= n; i++) {
            next = (prev + current) % 10007;
            prev = current;
            current = next;
        }

        System.out.println(current);
    }
}
