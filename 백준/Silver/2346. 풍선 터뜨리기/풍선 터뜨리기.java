import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] balloons = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            balloons[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] order = new int[N];
        int currentPosition = 0, nextPosition, move;
        
        for (int i = 0; i < N; i++) {
            order[i] = currentPosition + 1; 
            move = balloons[currentPosition];
            balloons[currentPosition] = 0; 
            
            if (i == N - 1) break; 
            
            int actualMove = 0;
            if (move > 0) {
                while (move > 0) {
                    nextPosition = (currentPosition + 1) % N;
                    if (balloons[nextPosition] != 0) {
                        move--;
                    }
                    actualMove++;
                    currentPosition = nextPosition;
                }
            } else {
                while (move < 0) {
                    nextPosition = (currentPosition - 1 + N) % N;
                    if (balloons[nextPosition] != 0) {
                        move++;
                    }
                    actualMove++;
                    currentPosition = nextPosition;
                }
            }
        }
        
        for (int i = 0; i < N; i++) {
            System.out.print(order[i] + " ");
        }
    }
}
