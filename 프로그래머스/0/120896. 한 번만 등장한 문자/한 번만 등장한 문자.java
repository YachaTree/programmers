import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        //문자와 그 빈도수를 저장하기 위한 맵
        Map<Character, Integer> frequencyMap = new HashMap<>();
        //각 문자의 빈도수 계산
        for(char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c,0) + 1);
        }
        
        //한 번만 등장하는 문자들을 필터링하고 사전 순으로 정렬
        return frequencyMap.entrySet().stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .sorted()
            .map(String::valueOf)
            .collect(Collectors.joining());
    }
}