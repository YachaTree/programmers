import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 단어의 개수 N을 입력받음
        scanner.nextLine(); // 숫자 입력 후 남은 개행 문자 제거

        Set<String> words = new HashSet<>(); // 중복 제거를 위한 Set 생성

        for (int i = 0; i < N; i++) {
            words.add(scanner.nextLine()); // 단어 입력 받아 Set에 저장
        }

        // Set을 List로 변환하여 정렬 가능하게 함
        List<String> sortedWords = new ArrayList<>(words);

        // 조건에 맞게 정렬
        Collections.sort(sortedWords, (word1, word2) -> {
            if (word1.length() == word2.length()) {
                return word1.compareTo(word2); // 길이가 같으면 사전 순으로 정렬
            } else {
                return word1.length() - word2.length(); // 길이에 따라 정렬
            }
        });

        // 정렬된 단어 출력
        for (String word : sortedWords) {
            System.out.println(word);
        }
    }
}
