import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());

        int ballPosition = 1;

        for(int i = 0; i < M; i++) {
            String inputs[] = br.readLine().split(" ");
            int X = Integer.parseInt(inputs[0]);
            int Y = Integer.parseInt(inputs[1]);

            if (ballPosition == X) {
                ballPosition = Y;
            } else if (ballPosition == Y) {
                ballPosition = X;
            }
        }

        System.out.println(ballPosition);
        br.close();
    }
}