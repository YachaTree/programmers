import java.util.HashMap;
import java.util.Map;


class Solution {
    public String solution(String letter) {
         Map<String, Character> morse = new HashMap<>();
        morse.put(".-", 'a');
        morse.put("-...", 'b');
        morse.put("-.-.", 'c');
        morse.put("-..", 'd');
        morse.put(".", 'e');
        morse.put("..-.", 'f');
        morse.put("--.", 'g');
        morse.put("....", 'h');
        morse.put("..", 'i');
        morse.put(".---", 'j');
        morse.put("-.-", 'k');
        morse.put(".-..", 'l');
        morse.put("--", 'm');
        morse.put("-.", 'n');
        morse.put("---", 'o');
        morse.put(".--.", 'p');
        morse.put("--.-", 'q');
        morse.put(".-.", 'r');
        morse.put("...", 's');
        morse.put("-", 't');
        morse.put("..-", 'u');
        morse.put("...-", 'v');
        morse.put(".--", 'w');
        morse.put("-..-", 'x');
        morse.put("-.--", 'y');
        morse.put("--..", 'z');

        // 문자열을 모스부호로 분리
        String[] morseLetters = letter.split(" ");

        // 모스부호를 영어 소문자로 변환
        StringBuilder decoded = new StringBuilder();
        for (String morseLetter : morseLetters) {
            if (morse.containsKey(morseLetter)) {
                decoded.append(morse.get(morseLetter));
            } else {
                decoded.append(" "); // 모스부호 사이의 공백 처리
            }
        }

        return decoded.toString();
    }
}