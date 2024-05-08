import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] inputs = br.readLine().split(" ");
        
        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);
        int w = Integer.parseInt(inputs[2]);
        int h = Integer.parseInt(inputs[3]);
        
        int distanceToTop = h - y;
        int distanceToBottom = y;
        int distanceToLeft = x;
        int distanceToRight = w - x;
        
        int minDistance = Math.min(Math.min(distanceToTop, distanceToBottom), Math.min(distanceToLeft, distanceToRight));
        
        System.out.println(minDistance);
    }
}