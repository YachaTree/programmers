import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> words = new TreeSet<>((word1, word2) -> {
            if (word1.length() == word2.length()) {
                return word1.compareTo(word2);
            } else {
                return Integer.compare(word1.length(), word2.length());
            }
        });

        for (int i = 0; i < N; i++) {
            words.add(br.readLine());
        }

        words.forEach(System.out::println);
    }
}
