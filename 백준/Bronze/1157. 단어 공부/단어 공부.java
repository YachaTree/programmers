import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input = reader.readLine().toUpperCase();
            int[] alphabetCount = new int[26];

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (Character.isAlphabetic(ch)) {
                    alphabetCount[ch - 'A']++;
                }
            }

            int maxCount = 0;
            char maxChar = '?';
            boolean isDuplicate = false;

            for (int i = 0; i < 26; i++) {
                if (alphabetCount[i] > maxCount) {
                    maxCount = alphabetCount[i];
                    maxChar = (char) (i + 'A');
                    isDuplicate = false;
                } else if (alphabetCount[i] == maxCount) {
                    isDuplicate = true;
                }
            }

            if (isDuplicate) {
                System.out.println("?");
            } else {
                System.out.println(maxChar);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
