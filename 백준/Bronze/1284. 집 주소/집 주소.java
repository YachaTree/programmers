import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while (!(input = br.readLine()).equals("0")) {
            int width = 2; 
            
            for (char ch : input.toCharArray()) {
                if (ch == '1') {
                    width += 2;
                } else if (ch == '0') {
                    width += 4;
                } else {
                    width += 3;
                }
            }
            
            width += input.length() - 1;
            
            System.out.println(width);
        }
    }
}