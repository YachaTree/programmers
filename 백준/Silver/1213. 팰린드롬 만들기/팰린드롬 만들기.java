import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String name = br.readLine();
        int[] count = new int[26];

        for (char c : name.toCharArray()) {
            count[c - 'A']++;
        }
        
        int oddCount = 0;
        int oddIndex = -1;
        
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 != 0) {
                oddCount++;
                oddIndex = i;
            }
        }
        
        if (oddCount > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }
        
        StringBuilder front = new StringBuilder(); // 앞부분
        StringBuilder back = new StringBuilder();  // 뒷부분
        
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < count[i] / 2; j++) {
                front.append((char) (i + 'A'));
            }
        }
        
        back.append(front).reverse();
        
        if (oddIndex != -1) {
            front.append((char) (oddIndex + 'A'));
        }
        
        System.out.println(front.toString() + back.toString());
    }
}
