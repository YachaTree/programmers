import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {

            if (line.equals("#")) {
                break;
            }

            String[] parts = line.split(" ", 2);
            char targetChar = parts[0].charAt(0);  
            String sentence = parts[1];           

            targetChar = Character.toLowerCase(targetChar);
            sentence = sentence.toLowerCase();

            int count = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == targetChar) {
                    count++;
                }
            }

            System.out.println(targetChar + " " + count);
        }
    }
}
