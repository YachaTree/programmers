import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        boolean inTag = false;

        for (char c : s.toCharArray()) {
            if (inTag) {

                if (c == '>') {
                    inTag = false;
                }
                result.append(c);
            } else {
                if (c == '<') {

                    result.append(word.reverse());
                    word.setLength(0); 
                    inTag = true;
                    result.append(c);
                } else if (c == ' ') {

                    result.append(word.reverse()).append(c);
                    word.setLength(0); 
                } else {

                    word.append(c);
                }
            }
        }

        if (word.length() > 0) {
            result.append(word.reverse());
        }

        System.out.println(result.toString());
    }
}
