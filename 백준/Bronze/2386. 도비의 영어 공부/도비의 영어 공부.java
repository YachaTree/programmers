import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.equals("#")) {
                break;
            }

            char targetChar = line.charAt(0);
            String sentence = line.substring(2);
            
            int count = 0;
            for (char c : sentence.toCharArray()) {
                if (Character.toLowerCase(c) == Character.toLowerCase(targetChar)) {
                    count++;
                }
            }
            
            System.out.println(targetChar + " " + count);
        }
    }
}
