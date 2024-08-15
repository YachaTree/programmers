import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int scenarioNumber = 1;
        
        while (true) {
            String[] initialInput = br.readLine().split(" ");
            int o = Integer.parseInt(initialInput[0]);
            int w = Integer.parseInt(initialInput[1]);
            
            if (o == 0 && w == 0) break;
            
            boolean isAlive = true;
            
            while (true) {
                String[] action = br.readLine().split(" ");
                String type = action[0];
                int n = Integer.parseInt(action[1]);
                
                if (type.equals("#") && n == 0) {
                    break;
                }
                
                if (isAlive) {
                    if (type.equals("E")) {
                        w -= n;
                    } else if (type.equals("F")) {
                        w += n;
                    }
                    
                    if (w <= 0) {
                        isAlive = false;
                    }
                }
            }
            
            if (!isAlive) {
                System.out.println(scenarioNumber + " RIP");
            } else if (w > o / 2 && w < o * 2) {
                System.out.println(scenarioNumber + " :-)");
            } else {
                System.out.println(scenarioNumber + " :-(");
            }
            
            scenarioNumber++;
        }
    }
}
