import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        Map<Character, Integer> firstLetterCount = new HashMap<>();
        
        // 각 성의 첫 글자를 확인하여 빈도 수를 저장
        for (int i = 0; i < n; i++) {
            String lastName = br.readLine();
            char firstLetter = lastName.charAt(0);
            
            firstLetterCount.put(firstLetter, firstLetterCount.getOrDefault(firstLetter, 0) + 1);
        }
        
        // 5명 이상인 성의 첫 글자를 모아서 정렬
        TreeSet<Character> result = new TreeSet<>();
        for (Map.Entry<Character, Integer> entry : firstLetterCount.entrySet()) {
            if (entry.getValue() >= 5) {
                result.add(entry.getKey());
            }
        }
        
        if (result.isEmpty()) {
            System.out.println("PREDAJA");
        } else {
            for (char c : result) {
                System.out.print(c);
            }
        }
    }
}
