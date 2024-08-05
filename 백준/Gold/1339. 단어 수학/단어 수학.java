import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];
        
        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }
        
        // 알파벳 가중치를 저장할 Map
        Map<Character, Integer> weightMap = new HashMap<>();
        
        // 각 단어의 각 자리의 알파벳에 대해 가중치를 계산
        for (String word : words) {
            int length = word.length();
            for (int i = 0; i < length; i++) {
                char c = word.charAt(i);
                int weight = (int) Math.pow(10, length - i - 1);
                weightMap.put(c, weightMap.getOrDefault(c, 0) + weight);
            }
        }
        
        // 가중치가 높은 순으로 알파벳을 정렬
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(weightMap.entrySet());
        entryList.sort((e1, e2) -> e2.getValue() - e1.getValue());
        
        // 높은 가중치 순서대로 9부터 0까지 숫자 배정
        Map<Character, Integer> charToDigit = new HashMap<>();
        int digit = 9;
        for (Map.Entry<Character, Integer> entry : entryList) {
            charToDigit.put(entry.getKey(), digit--);
        }
        
        // 각 단어를 숫자로 변환하여 합을 계산
        int sum = 0;
        for (String word : words) {
            int number = 0;
            for (char c : word.toCharArray()) {
                number = number * 10 + charToDigit.get(c);
            }
            sum += number;
        }
        
        // 결과 출력
        System.out.println(sum);
    }
}
