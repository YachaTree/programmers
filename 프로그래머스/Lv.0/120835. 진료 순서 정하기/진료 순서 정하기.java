import java.util.Arrays;
import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int[] solution(int[] emergency) {
                 // 응급도와 원래 인덱스를 저장할 Pair 배열 생성
        Pair[] pairs = new Pair[emergency.length];
        
        for (int i = 0; i < emergency.length; i++) {
            pairs[i] = new Pair(emergency[i], i);
        }
        
        // 응급도를 기준으로 내림차순 정렬
        Arrays.sort(pairs, (p1, p2) -> p2.emergency - p1.emergency);
        
        // 결과 배열 생성
        int[] result = new int[emergency.length];
        
        // 정렬된 순서대로 결과 배열에 인덱스 + 1 할당
        for (int i = 0; i < pairs.length; i++) {
            result[pairs[i].index] = i + 1;
        }
        
        return result;
    }

    // 응급도와 인덱스를 저장하기 위한 Pair 클래스
    private class Pair {
        int emergency;
        int index;

        public Pair(int emergency, int index) {
            this.emergency = emergency;
            this.index = index;
        }
    }
}